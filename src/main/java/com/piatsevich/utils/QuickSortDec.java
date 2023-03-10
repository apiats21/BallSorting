package utils;

import java.util.Comparator;
import java.util.List;

public class QuickSortDec implements Sort{
    public<Car> void sort(List<Car> cars, Comparator<Car> cpm) {
        for (int i = 0; i < cars.size() - 2; i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                int b = cpm.compare(cars.get(i), cars.get(j));
                if (b < 0) {
                    Car temp;
                    temp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, temp);
                }
            }
        }


    }
}
