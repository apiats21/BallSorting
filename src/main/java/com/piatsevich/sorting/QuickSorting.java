package com.piatsevich.sorting;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.model.GeneralBall;

import java.util.List;

public class QuickSorting {

    public void quicksortList(List<BasketBall> listOfBalls, GeneralComparator comparator) {
        quicksortList(listOfBalls, 0, listOfBalls.size()-1, comparator);
    }

    private void quicksortList(List<BasketBall> listOfBalls, int lowIndex,
                              int highIndex, GeneralComparator comparator) {
        if (lowIndex >= highIndex) {
            return;
        }

        int leftPointer = partition(listOfBalls, lowIndex, highIndex, comparator);

        quicksortList(listOfBalls, lowIndex, leftPointer - 1, comparator);
        quicksortList(listOfBalls, leftPointer + 1, highIndex, comparator);
    }

    private static int partition(List<BasketBall> listOfBalls, int lowIndex,
                                 int highIndex, GeneralComparator comparator) {

        GeneralBall pivot = listOfBalls.get(highIndex);
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (comparator.compare(listOfBalls.get(leftPointer), pivot) <= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (comparator.compare(listOfBalls.get(rightPointer), pivot) >= 0 && rightPointer > leftPointer) {
                rightPointer--;
            }

            swap(listOfBalls, leftPointer, rightPointer);
        }
        swap(listOfBalls, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(List<BasketBall> listOfBalls, int index1, int index2) {
        BasketBall temp = listOfBalls.get(index1);
        listOfBalls.set(index1, listOfBalls.get(index2));
        listOfBalls.set(index2, temp);
    }
}
