package oop.hus.lab10.singleton.demoprogram;

import java.util.HashMap;

public class Ball {
    public String color;
    private static HashMap<String, Ball> map = new HashMap<>();


    public Ball(String color) {
        this.color = color;
    }

    public static Ball getInstance(String color) {
        if (!map.containsKey(color)) {

            map.put(color, new Ball(color));
        }
        return map.get(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
