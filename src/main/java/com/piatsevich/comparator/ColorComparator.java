package com.piatsevich.comparator;

import com.piatsevich.model.GeneralBall;

public class ColorComparator implements GeneralComparator {
    @Override
    public int compare(GeneralBall ball1, GeneralBall ball2) {
        String ball1Color = ball1.getColor().toString();
        String ball2Color = ball2.getColor().toString();
        return ball1Color.compareTo(ball2Color);
    }
}
