package com.piatsevich.sort;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.comparator.impl.ColorComparator;
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
    private GeneralComparator<BasketBall> cmpByColor;

    @BeforeEach
    void init() {
        ballList = new ArrayList<>();
        quickSort = new QuickSort();
        quickSortDec = new QuickSortDec();
        cmpBySize = new SizeComparator();
        cmpByColor = new ColorComparator();
        sorter = new Sorter();

        var ball1 = BasketBall.builder().size(11).color(Color.YELLOW).build();
        var ball2 = BasketBall.builder().size(15).color(Color.BLUE).build();
        var ball3 = BasketBall.builder().size(7).color(Color.YELLOW).build();
        var ball4 = BasketBall.builder().size(42).color(Color.GREEN).build();
        var ball5 = BasketBall.builder().size(23).color(Color.BLUE).build();
        ballList.add(ball1);
        ballList.add(ball2);
        ballList.add(ball3);
        ballList.add(ball4);
        ballList.add(ball5);
    }

    @Test
    void sorterReturnNotNull() {
        emptyBallList = Collections.emptyList();
        var list = sorter.sort(emptyBallList, cmpBySize, quickSortDec);
        assertNotNull(list);
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
    void sortingListBySize() {
        sorter.sort(ballList, cmpBySize, quickSort);
        for (int i = 0; i <ballList.size()-2; i++) {
            assertTrue((ballList.get(i).getSize() - ballList.get(i+1).getSize()) <= 0 );
        }
    }

    @Test
    void sortingListByColor() {
        for (int i = 0; i <ballList.size()-2; i++) {
            var list = sorter.sort(ballList, cmpByColor, quickSort);
            assertTrue((ballList.get(i).getColor().compareTo(ballList.get(i+1).getColor())) <= 0 );
        }
    }
}