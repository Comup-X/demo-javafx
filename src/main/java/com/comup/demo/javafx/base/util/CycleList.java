package com.comup.demo.javafx.base.util;

import java.util.ArrayList;
import java.util.Collections;

public class CycleList<E> extends ArrayList<E> {

    private int currentIndex = 0;

    public CycleList() {
        super();
    }

    @SafeVarargs
    public CycleList(E... es) {
        super(es.length);
        Collections.addAll(this, es);
    }

    public E getNext() {
        E result = this.get(currentIndex);
        if (currentIndex + 1 >= this.size()) currentIndex = 0;
        else currentIndex++;
        return result;
    }
}