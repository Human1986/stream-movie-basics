package com.epam.rd.autotask.stream.basic;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MovieQueries {
    List<String> movies;

    public MovieQueries(List<String> movies) {
//        if (movies.isEmpty()) throw new IllegalArgumentException();
        this.movies = movies;
    }

    public long getNumberOfMovies() {
        return movies.size();
    }

    public long getNumberOfMoviesThatStartsWith(String start) {
        return movies.stream()
                .filter(m -> m.startsWith(start))
                .count();
    }

    public long getNumberOfMoviesThatStartsWithAndEndsWith(String start, String end) {
        return movies.stream()
                .filter(m -> m.startsWith(start) && m.endsWith(end))
                .count();
    }

    public List<Integer> getLengthOfTitleOfMovies() {
        return movies.stream()
                .mapToInt(String::length)
                .boxed()
                .collect(Collectors.toList());
    }

    public int getNumberOfLettersInShortestTitle() {
        Optional<String> min = movies.stream()
                .min(Comparator.comparing(String::length));
        return Math.toIntExact(min.stream().mapToInt(String::length).count());
    }

    public Optional<String> getFirstTitleThatContainsThreeWords() {
        return Optional.empty();
    }

    public List<String> getFirstFourTitlesThatContainAtLeastTwoWords() {
        return movies.stream()
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
    }

    public void printAllTitleToConsole() {
        movies.forEach(System.out::println);
    }
}
