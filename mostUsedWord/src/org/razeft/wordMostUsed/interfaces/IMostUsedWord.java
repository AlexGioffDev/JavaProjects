package org.razeft.wordMostUsed.interfaces;

import java.util.Map;

@FunctionalInterface
public interface IMostUsedWord {
    Map<String, Integer> findMostUsedWord(String sentence);
}
