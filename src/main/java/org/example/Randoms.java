package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int MAX, MIN;

    public Randoms(int min, int max) {
        random = new Random();
        this.MIN = min;
        this.MAX = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(MAX - MIN + 1) + MIN;
            }
        };
    }
}