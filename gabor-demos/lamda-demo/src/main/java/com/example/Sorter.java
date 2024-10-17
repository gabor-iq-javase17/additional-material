package com.example;

import java.util.List;

public class Sorter {
    public <T> void sequentialSort(List<T> items, MyComparator<T> comparator) {
        for (int i = 0; i < items.size(); i++) {
            var minIndex = i;
            for (int j = i + 1; j < items.size(); j++) {
                // if (items.get(j) < items.get(i) ) {
                if (comparator.compare(items.get(j), items.get(i)) < 0) {
                    minIndex = j;
                }
            }
            var temp = items.get(i);
            items.set(i, items.get(minIndex));
            items.set(minIndex, temp);
        }
    }

}
