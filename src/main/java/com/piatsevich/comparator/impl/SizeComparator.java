package com.piatsevich.comparator.impl;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.model.BasketBall;

public class SizeComparator implements GeneralComparator<BasketBall> {

    @Override
    public int compare(BasketBall ball1, BasketBall ball2) {
        Integer ball1Size = ball1.getSize();
        Integer ball2Size = ball2.getSize();
        return ball1Size.compareTo(ball2Size);
    }
}
