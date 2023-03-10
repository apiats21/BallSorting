package com.piatsevich.sort;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.comparator.impl.SizeComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.model.Color;
import com.piatsevich.utils.QuickSort;
import com.piatsevich.utils.QuickSortDec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    private Sorter sorter;
    private QuickSort quickSort;
    private QuickSortDec quickSortDec;
    private List<BasketBall> ballList;
    private List<BasketBall> emptyBallList;
    private GeneralComparator<BasketBall> cmpBySize;

    @BeforeEach
    void init() {
        ballList = new ArrayList<>();
        quickSort = new QuickSort();
        quickSortDec = new QuickSortDec();
        cmpBySize = new SizeComparator();
        sorter = new Sorter();

        BasketBall ball1 = BasketBall.builder().size(11).color(Color.YELLOW).build();
        BasketBall ball2 = BasketBall.builder().size(15).color(Color.BLUE).build();
        BasketBall ball3 = BasketBall.builder().size(7).color(Color.YELLOW).build();
        BasketBall ball4 = BasketBall.builder().size(42).color(Color.GREEN).build();
        BasketBall ball5 = BasketBall.builder().size(23).color(Color.BLUE).build();
        ballList.add(ball1);
        ballList.add(ball2);
        ballList.add(ball3);
        ballList.add(ball4);
        ballList.add(ball5);
    }

    @Test
    void sortingEmptyList() {
        emptyBallList = Collections.emptyList();
        sorter.sort(emptyBallList, cmpBySize, quickSortDec);
        assertEquals(0, emptyBallList.size());
    }

    @Test
    void NullInsteadOfListShouldReturnNPE() {
        emptyBallList = null;
        assertThrows(NullPointerException.class,
                () -> {
                    sorter.sort(emptyBallList, cmpBySize, quickSortDec);
                }
        );
    }

    @Test
    void sortingList() {
        sorter.sort(ballList, cmpBySize, quickSort);
        assertEquals((BasketBall.builder().size(7).color(Color.YELLOW).build()), ballList.get(0));
        assertEquals((BasketBall.builder().size(42).color(Color.GREEN).build()), ballList.get(4));
    }
}