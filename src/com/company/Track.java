package com.company;

public class Track implements Trap {
    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcoming(Competitor c) {
        if (c.run(length)) {
            System.out.printf("\n%s %s пробежал дистанцию %dм", c.getClass().getSimpleName(), c.getName(), length);
            return true;
        } else {
            System.out.printf("\n%s %s не смог пробежать дистанцию %dм", c.getClass().getSimpleName(), c.getName(), length);
            return false;
        }
    }
}
