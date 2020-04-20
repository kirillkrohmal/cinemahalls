package ru.job4j;


import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    private static final Main INST = new Main();
    private Map<Integer, Place> posts = new ConcurrentHashMap<>();

    private Main() {
        posts.put(1, new Place("1", "1"));
        posts.put(2, new Place("2", "2"));
        posts.put(3, new Place("3", "3"));
    }

    public static Main instOf() {
        return INST;
    }

    public Collection<Place> findAll() {
        return posts.values();
    }
}









