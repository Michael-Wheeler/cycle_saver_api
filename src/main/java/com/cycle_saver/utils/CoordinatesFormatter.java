package com.cycle_saver.utils;

import com.cycle_saver.model.Activity;

import java.util.List;

public class CoordinatesFormatter {
    public String main (List<Double> coordinate) {
        return coordinate.get(0).toString() + "," + coordinate.get(1).toString();
    }
}
