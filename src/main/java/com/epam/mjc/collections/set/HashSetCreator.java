package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        sourceList.forEach(x -> {
            if (x % 2 == 0) {
                addEvenNumberToSet(x, result);
            } else {
                result.add(x);
                result.add(2 * x);
            }
        });
        return result;
    }

    private void addEvenNumberToSet(int number, HashSet<Integer> set) {
        set.add(number);
        if (number % 2 != 0) {
            return;
        }
        addEvenNumberToSet(number / 2, set);
    }
}
