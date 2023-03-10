package utils;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.model.BasketBall;

import java.util.Comparator;
import java.util.List;

public class QuickSort implements Sort {

    @Override
    public <T> void sort(List<T> ballList, GeneralComparator<T> comparator) {
        quicksortList(ballList, 0, ballList.size() - 1, comparator);
    }

    private <T> void quicksortList(List<T> listOfBalls, int lowIndex,
                                   int highIndex, GeneralComparator<T> comparator) {
        if (lowIndex >= highIndex) {
            return;
        }

        int leftPointer = partition(listOfBalls, lowIndex, highIndex, comparator);

        quicksortList(listOfBalls, lowIndex, leftPointer - 1, comparator);
        quicksortList(listOfBalls, leftPointer + 1, highIndex, comparator);
    }

    private static <T> int partition(List<T> listOfBalls, int lowIndex,
                                 int highIndex, GeneralComparator <T> comparator) {

        T pivot = listOfBalls.get(highIndex);
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

    private static <T> void swap(List<T> listOfBalls, int index1, int index2) {
        T temp = listOfBalls.get(index1);
        listOfBalls.set(index1, listOfBalls.get(index2));
        listOfBalls.set(index2, temp);
    }
}


//public class QuickSort implements Sort {
//    public <Car> void sort(List<Car> cars, Comparator<Car> cpm) {
//        for (int i = 0; i < cars.size() - 2; i++) {
//            for (int j = i + 1; j < cars.size(); j++) {
//                int b = cpm.compare(cars.get(i), cars.get(j));
//                if (b > 0) {
//                    Car temp;
//                    temp = cars.get(i);
//                    cars.set(i, cars.get(j));
//                    cars.set(j, temp);
//                }
//            }
//        }
//    }
//}
