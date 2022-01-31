package Yatzy;

import org.junit.*;
import yatzy.Dices;
import yatzy.Yatzy;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class YatzyTest {

    @Test
    public void testChance() {
        Dices dices16 = new Dices(new ArrayList<>(Arrays.asList(3, 3, 4, 5, 1)));
        Dices dices15 = new Dices(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 1)));

        assertEquals(16, Yatzy.chance(dices16));
        assertEquals(15, Yatzy.chance(dices15));
    }

    @Test
    public void testYatzy() {
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(6, 6, 6, 6, 3)));
        Dices dices50With4 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4)));
        Dices dices50With6 = new Dices(new ArrayList<>(Arrays.asList(6, 6, 6, 6, 6)));

        assertEquals(0, Yatzy.yatzy(dices0));
        assertEquals(50, Yatzy.yatzy(dices50With4));
        assertEquals(50, Yatzy.yatzy(dices50With6));
    }

    @Test
    public void testOnes() {
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(6, 2, 2, 4, 5)));
        Dices dices1 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        Dices dices2 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 1, 4, 5)));
        Dices dices4 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 1, 1, 1)));

        assertEquals(0, Yatzy.ones(dices0));
        assertEquals(1, Yatzy.ones(dices1));
        assertEquals(2, Yatzy.ones(dices2));
        assertEquals(4, Yatzy.ones(dices4));
    }

    @Test
    public void testTwos() {
        Dices dices4 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 6)));
        Dices dices10 = new Dices(new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2)));

        assertEquals(4, Yatzy.twos(dices4));
        assertEquals(10, Yatzy.twos(dices10));
    }

    @Test
    public void testThrees() {
        Dices dices6 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3)));
        Dices dices12 = new Dices(new ArrayList<>(Arrays.asList(2, 3, 3, 3, 3)));

        assertEquals(6, Yatzy.threes(dices6));
        assertEquals(12, Yatzy.threes(dices12));
    }

    @Test
    public void testFours() {
        Dices dices12 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 4, 5, 5)));
        Dices dices8 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 5, 5, 5)));
        Dices dices4 = new Dices(new ArrayList<>(Arrays.asList(4, 6, 5, 5, 5)));

        assertEquals(12, Yatzy.fours(dices12));
        assertEquals(8, Yatzy.fours(dices8));
        assertEquals(4, Yatzy.fours(dices4));
    }

    @Test
    public void testFives() {
        Dices dices10 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 4, 5, 5)));
        Dices dices15 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 5, 5, 5)));
        Dices dices20 = new Dices(new ArrayList<>(Arrays.asList(4, 5, 5, 5, 5)));

        assertEquals(10, Yatzy.fives(dices10));
        assertEquals(15, Yatzy.fives(dices15));
        assertEquals(20, Yatzy.fives(dices20));
    }

    @Test
    public void testSixes() {
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 4, 5, 5)));
        Dices dices6 = new Dices(new ArrayList<>(Arrays.asList(4, 4, 6, 5, 5)));
        Dices dices18 = new Dices(new ArrayList<>(Arrays.asList(6, 5, 6, 6, 5)));

        assertEquals(0, Yatzy.sixes(dices0));
        assertEquals(6, Yatzy.sixes(dices6));
        assertEquals(18, Yatzy.sixes(dices18));
    }

    @Test
    public void testOnePair() {
        Dices dices6 = new Dices(new ArrayList<>(Arrays.asList(3, 4, 3, 5, 6)));
        Dices dices10 = new Dices(new ArrayList<>(Arrays.asList(5, 3, 3, 3, 5)));
        Dices dices12 = new Dices(new ArrayList<>(Arrays.asList(5, 3, 6, 6, 5)));
        assertEquals(6, Yatzy.onePair(dices6));
        assertEquals(10, Yatzy.onePair(dices10));
        assertEquals(12, Yatzy.onePair(dices12));
    }

    @Test
    public void testTwoPairs() {
        Dices dices16 = new Dices(new ArrayList<>(Arrays.asList(3, 3, 5, 4, 5)));
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(5, 2, 1, 3, 5)));
        Dices dices0NoPairs = new Dices(new ArrayList<>(Arrays.asList(5, 2, 1, 3, 4)));

        assertEquals(16, Yatzy.twoPairs(dices16));
        assertEquals(0, Yatzy.twoPairs(dices0));
        assertEquals(0, Yatzy.twoPairs(dices0NoPairs));

    }

    @Test
    public void testThreeOfAKind() {
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(3, 4, 3, 5, 6)));
        Dices dices9 = new Dices(new ArrayList<>(Arrays.asList(3, 3, 3, 4, 5)));
        Dices dices15 = new Dices(new ArrayList<>(Arrays.asList(5, 3, 5, 4, 5)));

        assertEquals(0, Yatzy.threeOfAKind(dices0));
        assertEquals(9, Yatzy.threeOfAKind(dices9));
        assertEquals(15, Yatzy.threeOfAKind(dices15));

    }

    @Test
    public void testFourOfAKind() {
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(3, 2, 3, 3, 5)));
        Dices dices12with5 = new Dices(new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3)));
        Dices dices12with4 = new Dices(new ArrayList<>(Arrays.asList(3, 3, 3, 3, 5)));
        Dices dices20 = new Dices(new ArrayList<>(Arrays.asList(5, 5, 5, 4, 5)));

        assertEquals(0, Yatzy.fourOfAKind(dices0));
        assertEquals(12, Yatzy.fourOfAKind(dices12with5));
        assertEquals(12, Yatzy.fourOfAKind(dices12with4));
        assertEquals(20, Yatzy.fourOfAKind(dices20));
    }

    @Test
    public void testSmallStraight() {
        Dices dices15InOrder = new Dices(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        Dices dices15OutOfOrder = new Dices(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 1)));
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5)));
        Dices dices0LargeStraight = new Dices(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6)));

        assertEquals(15, Yatzy.smallStraight(dices15InOrder));
        assertEquals(15, Yatzy.smallStraight(dices15OutOfOrder));
        assertEquals(0, Yatzy.smallStraight(dices0));
        assertEquals(0, Yatzy.smallStraight(dices0LargeStraight));

    }

    @Test
    public void testLargeStraight() {
        Dices dices20InOrder = new Dices(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6)));
        Dices dices20OutOfOrder = new Dices(new ArrayList<>(Arrays.asList(6, 2, 3, 4, 5)));
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5)));
        Dices dices0SmallStraight = new Dices(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));

        assertEquals(20, Yatzy.largeStraight(dices20InOrder));
        assertEquals(20, Yatzy.largeStraight(dices20OutOfOrder));
        assertEquals(0, Yatzy.largeStraight(dices0));
        assertEquals(0, Yatzy.largeStraight(dices0SmallStraight));

    }

    @Test
    public void testFullHouse() {
        Dices dices18 = new Dices(new ArrayList<>(Arrays.asList(2, 6, 2, 2, 6)));
        Dices dices22 = new Dices(new ArrayList<>(Arrays.asList(6, 6, 2, 2, 6)));
        Dices dices0 = new Dices(new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6)));

        assertEquals(18, Yatzy.fullHouse(dices18));
        assertEquals(22, Yatzy.fullHouse(dices22));
        assertEquals(0, Yatzy.fullHouse(dices0));
    }
}
