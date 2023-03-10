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

        BasketBall ball1 = BasketBall.builder().size(11).color(Color.YELLOW).build();
        BasketBall ball2 = BasketBall.builder().size(15).color(Color.BLUE).build();
        BasketBall ball3 = BasketBall.builder().size(7).color(Color.YELLOW).build();
        BasketBall ball4 = BasketBall.builder().size(42).color(Color.GREEN).build();
        BasketBall ball5 = BasketBall.builder().size(23).color(Color.BLUE).build();
        list.add(ball1);
        list.add(ball2);
        list.add(ball3);
        list.add(ball4);
        list.add(ball5);

        System.out.println(list);
        Sorter sorter = new Sorter();

//        sorter.sort(list, comparator, qs);
        List<BasketBall> list1 =  sorter.sort(list, comparator, qs1);

//        qs.quicksortList(list, cmp);
        System.out.println(list1);
    }
}
