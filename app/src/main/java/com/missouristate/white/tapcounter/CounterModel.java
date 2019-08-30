package com.missouristate.white.tapcounter;

public class CounterModel {
    private int clickCount = 0;

    public CounterModel(int newClickCount) {
        setCount(newClickCount);
    }

    public int getCount () {
        return clickCount;
    }

    public void setCount(int newClickCount) {

        newClickCount++;
        clickCount = newClickCount;
    }
}
