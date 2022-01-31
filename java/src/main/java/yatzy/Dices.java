package yatzy;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dices {
    List<Integer> dicesList;

    public Dices(List<Integer> dices) {
        this.dicesList = dices;
    }

    public List<Integer> getDices() {
        return dicesList;
    }

    public void setDices(List<Integer> dices) {
        this.dicesList = dices;
    }

    public Integer total() {
        return dicesList.stream().mapToInt(Integer::intValue).sum();
    }

    public Integer countOccurences(Dices dices, int intToCount) {
        return Collections.frequency(dices.dicesList, intToCount);
    }

    public Map<Integer, Integer> countAllOccurences() {
        Dices dices = this;
        Map<Integer, Integer> mapOfOccurences = new HashMap<>();
        for (int i = 1; i < 7; i++) {
            mapOfOccurences.put(i, countOccurences(dices, i));
        }
        return mapOfOccurences;
    }

    public Integer highiestOccurenceForXTimes(Integer times) {
        Dices dices = this;
        Map<Integer, Integer> mapOfOccurences = dices.countAllOccurences();
        Integer retNumber = 0;
        for (int number = 1; number < 7; number++) {
            if (mapOfOccurences.get(number) >= times) {
                retNumber = number;
            }
        }
        return retNumber;
    }

    public Integer occurenceForXTimesStrictlyEqual(Integer times) {
        Dices dices = this;
        Map<Integer, Integer> mapOfOccurences = dices.countAllOccurences();
        Integer retNumber = 0;
        for (int number = 1; number < 7; number++) {
            if (mapOfOccurences.get(number).equals(times)) {
                retNumber = number;
            }
        }
        return retNumber;
    }

    public Integer lowestOccurenceForXTimes(Integer times) {
        Dices dices = this;
        Map<Integer, Integer> mapOfOccurences = dices.countAllOccurences();
        Integer retNumber = 0;
        for (int number = 6; number != 0; number--) {
            if (mapOfOccurences.get(number) >= times) {
                retNumber = number;
            }
        }
        return retNumber;
    }

    public boolean checkStraightFromOccurences(Integer highestNumber) {
        Dices dices = this;
        boolean straightOk = true;
        Map<Integer, Integer> countAllOccurences = dices.countAllOccurences();
        for (int i = highestNumber - 4; i < highestNumber + 1; i++) {
            if (countAllOccurences.get(i) != 1) {
                straightOk = false;
            }
        }
        return straightOk;
    }

}
