package com.piatsevich.comparator;

import com.piatsevich.model.GeneralBall;

public class SizeComparator implements GeneralComparator {

    @Override
    public int compare(GeneralBall ball1, GeneralBall ball2) {
        Integer ball1Size = ball1.getSize();
        Integer ball2Size = ball2.getSize();
        return ball1Size.compareTo(ball2Size);
    }
}
