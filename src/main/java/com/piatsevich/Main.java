package com.piatsevich;

import com.piatsevich.comparator.ColorComparator;
import com.piatsevich.comparator.SizeComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.model.Color;
import com.piatsevich.sorting.QuickSorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BasketBall> list = new ArrayList<>();
        QuickSorting qs = new QuickSorting();
        SizeComparator comparator = new SizeComparator();
        ColorComparator cmp = new ColorComparator();

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
        qs.quicksortList(list, cmp);
        System.out.println(list);
    }
}
