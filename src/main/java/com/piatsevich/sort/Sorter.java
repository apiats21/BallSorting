package com.piatsevich.sort;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.utils.Sort;

import java.util.Comparator;
import java.util.List;

public class Sorter implements Sortable {

    private Sort sortType;
    private List<BasketBall> ballList;
    private List<BasketBall> sortedList;
    private Comparator<BasketBall> comparator;

    @Override
    public <T> List<T> sort(List<T> list, GeneralComparator<T> comparator, Sort sortType) {
        return sortType.sort(list, comparator);
    }

    public Sort getSortType() {
        return sortType;
    }

    public void setSortType(Sort sortType) {
        this.sortType = sortType;
    }

    public List<BasketBall> getBallList() {
        return ballList;
    }

    public void setBallList(List<BasketBall> ballList) {
        this.ballList = ballList;
    }

    public Comparator<BasketBall> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<BasketBall> comparator) {
        this.comparator = comparator;
    }
}
