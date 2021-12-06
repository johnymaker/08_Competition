package com.company;

public class Human implements Competitor {
    String name;
    int maxRun;
    int maxJump;

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        if (maxRun >= length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxJump >= height) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
