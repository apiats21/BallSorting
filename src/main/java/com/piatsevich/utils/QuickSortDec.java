package com.piatsevich.utils;

import com.piatsevich.comparator.GeneralComparator;

import java.util.List;

public class QuickSortDec implements Sort {

    @Override
    public <T> List<T> sort(List<T> ballList, GeneralComparator<T> comparator) {
        quicksortList(ballList, 0, ballList.size() - 1, comparator);
        return ballList;
    }

    private <T> List<T> quicksortList(List<T> listOfBalls, int lowIndex,
                                   int highIndex, GeneralComparator<T> comparator) {
        if (lowIndex >= highIndex) {
            return listOfBalls;
        }

        int leftPointer = partition(listOfBalls, lowIndex, highIndex, comparator);

        quicksortList(listOfBalls, lowIndex, leftPointer - 1, comparator);
        quicksortList(listOfBalls, leftPointer + 1, highIndex, comparator);

        return listOfBalls;

    }

    private static <T> int partition(List<T> listOfBalls, int lowIndex,
                                     int highIndex, GeneralComparator<T> comparator) {

        T pivot = listOfBalls.get(highIndex);
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (comparator.compare(listOfBalls.get(leftPointer), pivot) >= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (comparator.compare(listOfBalls.get(rightPointer), pivot) <= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }

            swap(listOfBalls, leftPointer, rightPointer);
        }
        swap(listOfBalls, leftPointer, highIndex);
        return leftPointer;
    }

    private static <T> void swap(List<T> listOfBalls, int index1, int index2) {
        T temp = listOfBalls.get(index1);
        listOfBalls.set(index1, listOfBalls.get(index2));
        listOfBalls.set(index2, temp);
    }
}

