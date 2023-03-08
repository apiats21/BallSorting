package com.piatsevich.sorting;

import com.piatsevich.comparator.SizeComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.model.Color;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class QuickSortingTest {

    @Test
    void sortingEmptyList() {
        QuickSorting qs = new QuickSorting();
        SizeComparator cmp = new SizeComparator();
        List<BasketBall> balls = new ArrayList<>();
        qs.quicksortList(balls, cmp);
        assertEquals(0, balls.size());
    }

    @Test
    void sortingList() {
        QuickSorting qs = new QuickSorting();
        SizeComparator cmp = new SizeComparator();

        List<BasketBall> balls = new ArrayList<>();
        BasketBall ball1 = new BasketBall(10, Color.BLUE);
        BasketBall ball2 = new BasketBall(15, Color.GREEN);
        BasketBall ball3 = new BasketBall(7, Color.BLUE);
        BasketBall ball4 = new BasketBall(42, Color.YELLOW);
        BasketBall ball5 = new BasketBall(23, Color.GREEN);
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        balls.add(ball4);
        balls.add(ball5);

        qs.quicksortList(balls, cmp);
        assertEquals(new BasketBall(7, Color.BLUE), balls.get(0));
        assertEquals(new BasketBall(42, Color.YELLOW), balls.get(4));
    }

    @Test
    void NullInsteadOfListShouldReturnNPE() {
        QuickSorting qs = new QuickSorting();
        SizeComparator cmp = new SizeComparator();

        List<BasketBall> listToSort = null;
        assertThrows(NullPointerException.class,
                () -> {
                    qs.quicksortList(listToSort, cmp);
                }
        );
    }
}