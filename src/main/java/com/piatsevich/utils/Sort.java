package com.piatsevich.utils;

import com.piatsevich.comparator.GeneralComparator;

import java.util.List;

public interface Sort {
    <T> void sort(List<T> ballList, GeneralComparator<T> cpm);
}
