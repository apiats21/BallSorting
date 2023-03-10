package com.piatsevich.sort;

import com.piatsevich.utils.Sort;

import java.util.Comparator;
import java.util.List;

public interface Sortable {
    <T> void sort(List<T> list, Comparator<T> comparator, Sort sortType);
}
