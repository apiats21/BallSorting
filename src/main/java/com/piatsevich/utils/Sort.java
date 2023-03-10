package utils;

import com.piatsevich.comparator.GeneralComparator;

import java.util.Comparator;
import java.util.List;

public interface Sort {
    public<T> void sort(List<T> ballList, GeneralComparator<T> cpm);
}
