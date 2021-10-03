package com.company;

public class ClassA {
    private int health;
    private String name;
    private Enum anEnum;

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public Enum getAnEnum() {
        return anEnum;
    }

    public ClassA(int health, String name, Enum anEnum) {
        this.health = health;
        this.name = name;
        this.anEnum = anEnum;
    }
}
