package com.piatsevich.sort;

import com.piatsevich.comparator.GeneralComparator;
import com.piatsevich.utils.Sort;

import java.util.List;

public interface Sortable {
    <T> void sort(List<T> list, GeneralComparator<T> comparator, Sort sortType);
}
