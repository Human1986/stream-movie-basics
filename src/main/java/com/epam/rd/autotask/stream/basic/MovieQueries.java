package com.epam.rd.autotask.stream.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieQueries {

    public MovieQueries(List<String> movies) {
    }

    public long getNumberOfMovies() {
        return 0;
    }

    public long getNumberOfMoviesThatStartsWith(String start) {
        return 0;
    }

    public long getNumberOfMoviesThatStartsWithAndEndsWith(String start, String end) {
        return 0;
    }

    public List<Integer> getLengthOfTitleOfMovies() {
        return null;
    }

    public int getNumberOfLettersInShortestTitle() {
        return 0;
    }

    public Optional<String> getFirstTitleThatContainsThreeWords() {
        return Optional.empty();
    }

    public List<String> getFirstFourTitlesThatContainAtLeastTwoWords() {
        return null;
    }

    public void printAllTitleToConsole() {
    }
}
