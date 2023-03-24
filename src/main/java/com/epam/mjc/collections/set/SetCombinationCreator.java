package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        for (String s : firstSet) {
            if (countStringInSet(s, firstSet) == 1 && countStringInSet(s, secondSet) == 1 && countStringInSet(s, thirdSet) == 0) {
                result.add(s);
            }
        }

        for (String s : thirdSet) {
            if (countStringInSet(s, firstSet) == 0 && countStringInSet(s, secondSet) == 0) {
                result.add(s);
            }
        }

        return result;
    }

    private int countStringInSet(String string, Set<String> set) {
        return (int) set.stream()
                .filter(s -> s.equals(string))
                .count();
    }
}
