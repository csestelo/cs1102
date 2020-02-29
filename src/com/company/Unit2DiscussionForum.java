package com.company;

import java.util.ArrayList;

public class Unit2DiscussionForum {
    public static void main (String[] args) {
        // example 1: withdraw cash. Counts de number of withdrawals and the amount of withdrawn cash, and then it displays for the user.
        whileLoop();
        doWhileLoop();
        forLoop();

        // example 2: 5 steps are needed to cross a street. Giving a initial qty of taken steps, validates if it is necessary to take another step.
        whileLoop2();
        doWhileLoop2();
        forLoop2();

        // example 3: it sums the items of a list.
        whileLoop3();
        doWhileLoop3();
        forLoop3();
    }

    private static void whileLoop () {
        int initialCash = 100;
        int withdrawAmount = 10;
        int withdrawTimes = 0;
        int withdrawnCash = 0;

        while (initialCash > 0) {
            initialCash -= withdrawAmount;
            withdrawTimes += 1;
            withdrawnCash += withdrawAmount;
        }

        System.out.println(String.format("whileLoop: %d withdrawals made, totaling $%d.", withdrawTimes, withdrawnCash));
    }

    private static void doWhileLoop () {
        int initialCash = 100;
        int withdrawAmount = 10;
        int withdrawTimes = 0;
        int withdrawnCash = 0;

        do {
            initialCash -= withdrawAmount;
            withdrawTimes += 1;
            withdrawnCash += withdrawAmount;
        } while (initialCash > 0);

        System.out.println(String.format("doWhileLoop: %d withdrawals made, totaling $%d.", withdrawTimes, withdrawnCash));
    }

    private static void forLoop () {
        int withdrawAmount = 10;
        int withdrawTimes = 0;
        int withdrawnCash = 0;

        for (int initialCash = 100; initialCash > 0; withdrawTimes++) {
            initialCash -= withdrawAmount;
            withdrawnCash += withdrawAmount;
        }

        System.out.println(String.format("forLoop: %d withdrawals made, totaling $%d.", withdrawTimes, withdrawnCash));
    }

    private static void whileLoop2 () {
        int stepsTaken = 5;

        while (stepsTaken < 5) {
            stepsTaken++;
        }

        System.out.println(String.format("whileLoop2: %s stepsTaken.", stepsTaken));
    }

    private static void doWhileLoop2 () {
        int stepsTaken = 5;

        do {
            stepsTaken++;
        } while (stepsTaken < 5);

        System.out.println(String.format("doWhileLoop2: %s stepsTaken.", stepsTaken));
    }

    private static void forLoop2 () {
        int stepsTaken;
        for (stepsTaken = 5; stepsTaken < 5; stepsTaken++) {
        }

        System.out.println(String.format("forLoop2: %s stepsTaken.", stepsTaken));
    }

    private static void whileLoop3 () {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers.add(2);
        randomNumbers.add(4);
        randomNumbers.add(5);

        int elementsSum = 0;

        while (randomNumbers.size() > 0) {
            elementsSum += randomNumbers.get(0);
            randomNumbers.remove(0);
        }

        System.out.println(String.format("whileLoop3: elementsSum = %s.", elementsSum));
    }

    private static void doWhileLoop3 () {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers.add(2);
        randomNumbers.add(4);
        randomNumbers.add(5);

        int elementsSum = 0;

        do {
            elementsSum += randomNumbers.get(0);
            randomNumbers.remove(0);
        } while (randomNumbers.size() > 0);

        System.out.println(String.format("doWhileLoop3: elementsSum = %s.", elementsSum));
    }

    private static void forLoop3 () {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers.add(2);
        randomNumbers.add(4);
        randomNumbers.add(5);

        int elementsSum;

        for (elementsSum = 0; randomNumbers.size() > 0; randomNumbers.remove(0)) {
            elementsSum += randomNumbers.get(0);
        }

        System.out.println(String.format("forLoop3: elementsSum = %s.", elementsSum));
    }
}
