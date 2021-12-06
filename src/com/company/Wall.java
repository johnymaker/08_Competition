package com.company;

public class Wall implements Trap {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcoming(Competitor c) {
        if (c.jump(height)) {
            System.out.printf("\n%s %s перепрыгнул препятствие %dм", c.getClass().getSimpleName(), c.getName(), height);
            return true;
        } else {
            System.out.printf("\n%s %s не смог перепрыгнуть препятствие %dм", c.getClass().getSimpleName(),
                    c.getName(), height);
            return false;
        }
    }
}
