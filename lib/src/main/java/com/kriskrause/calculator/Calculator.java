package com.kriskrause.calculator;

public class Calculator {
    private final int _x;
    private final int _y;

    public Calculator(int x, int y) {
        _x = x;
        _y = y;
    }

    public int Add() {
        return _x + _y;
    }

    public int Divide() {
        if (_y < 1) return 0;

        return _x / _y;
    }
}
