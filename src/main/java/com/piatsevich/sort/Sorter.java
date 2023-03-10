package com.piatsevich.sort;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.model.BasketBall;
import com.piatsevich.utils.Sort;

import java.util.Comparator;
import java.util.List;

public class Sorter implements Sortable {

    Sort sortType;
    List<BasketBall> ballList;
    Comparator<BasketBall> comparator;

    @Override
    public <T> void sort(List<T> list, GeneralComparator<T> comparator, Sort sortType) {
        sortType.sort(list, comparator);
    }


    // это прокси
    // 2-3 methods которые принимают sortType(вид сортировщика), лист и компаратор и попытаться сделать сортировку
    // и обработать ошибку и возвратить отсортированную коллекцию, описать логи
    //
    // в тестах создаем список, quickSort, comparator и передаем сортировщику и проверяем что сортировщик отработал как надо
    // задача: проверть что иеархия сортировщик, mergesort и компаратор работает


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
