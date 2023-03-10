package com.piatsevich;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.comparator.impl.ColorComparator;
import com.piatsevich.comparator.impl.SizeComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.model.Color;
import com.piatsevich.sort.Sorter;
import com.piatsevich.utils.QuickSort;
import com.piatsevich.utils.QuickSortDec;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BasketBall> list = new ArrayList<>();
        QuickSort qs = new QuickSort();
        QuickSortDec qs1 = new QuickSortDec();
        GeneralComparator<BasketBall> comparator = new SizeComparator();
        GeneralComparator<BasketBall> cmp = new ColorComparator();

        BasketBall ball1 = new BasketBall(10, Color.BLUE);
        BasketBall ball2 = new BasketBall(15, Color.GREEN);
        BasketBall ball3 = new BasketBall(7, Color.BLUE);
        BasketBall ball4 = new BasketBall(42, Color.YELLOW);
        BasketBall ball5 = new BasketBall(23, Color.GREEN);
        list.add(ball1);
        list.add(ball2);
        list.add(ball3);
        list.add(ball4);
        list.add(ball5);

        System.out.println(list);
        Sorter sorter = new Sorter();

//        sorter.sort(list, comparator, qs);
        sorter.sort(list, comparator, qs1);

//        qs.quicksortList(list, cmp);
        System.out.println(list);
    }
}
