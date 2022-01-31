package yatzy;

import java.util.Map;

public class Yatzy {
    private Yatzy() {
    }

    public static int chance(Dices dices) {
        return dices.total();
    }

    public static int yatzy(Dices dices) {
        Integer score = 0;
        if (dices.highiestOccurenceForXTimes(5) > 0) {
            score = 50;
        }
        return score;
    }

    public static int ones(Dices dices) {
        int number = 1;
        return dices.countOccurences(dices, number) * number;
    }

    public static int twos(Dices dices) {
        int number = 2;
        return dices.countOccurences(dices, number) * number;
    }

    public static int threes(Dices dices) {
        int number = 3;
        return dices.countOccurences(dices, number) * number;
    }

    public static int fours(Dices dices) {
        int number = 4;
        return dices.countOccurences(dices, number) * number;
    }

    public static int fives(Dices dices) {
        int number = 5;
        return dices.countOccurences(dices, number) * number;
    }

    public static int sixes(Dices dices) {
        int number = 6;
        return dices.countOccurences(dices, number) * number;
    }


    public static int onePair(Dices dices) {
        Integer score = 0;
        score = dices.highiestOccurenceForXTimes(2) * 2;

        return score;
    }

    public static int twoPairs(Dices dices) {
        Integer highiest = dices.highiestOccurenceForXTimes(2);
        Integer lowest = dices.lowestOccurenceForXTimes(2);
        Integer score = highiest * 2 + lowest * 2;

        return (!highiest.equals(lowest)) ? score : 0;
    }

    public static int threeOfAKind(Dices dices) {
        Integer score = 0;
        score = dices.highiestOccurenceForXTimes(3) * 3;

        return score;
    }

    public static int fourOfAKind(Dices dices) {
        Integer score = 0;
        score = dices.highiestOccurenceForXTimes(4) * 4;

        return score;
    }

    public static int smallStraight(Dices dices) {
        Integer score = 0;
        if (dices.checkStraightFromOccurences(5)) {
            score = 15;
        }
        return score;
    }

    public static int largeStraight(Dices dices) {
        Integer score = 0;
        if (dices.checkStraightFromOccurences(6)) {
            score = 20;
        }
        return score;
    }

    public static int fullHouse(Dices dices) {
        Integer score = 0;
        Integer numberWithTwo = dices.occurenceForXTimesStrictlyEqual(2);
        Integer numberWithThree = dices.occurenceForXTimesStrictlyEqual(3);
        if (!numberWithThree.equals(numberWithTwo)) {
            score = numberWithThree * 3 + numberWithTwo * 2;
        }
        return score;
    }
}



