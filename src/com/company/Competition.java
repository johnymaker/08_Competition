package com.company;

public class Competition {

    public static void main(String[] args) {
        //Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать
        // и прыгать (методы просто выводят информацию о действии в консоль).
        //Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
        // соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        //Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        //У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

        Competitor[] competitors = {
                new Human("Jack", 200, 1),
                new Human("Boris", 500, 2),
                new Cat("Tom", 100, 3),
                new Cat("Clare", 50, 5),
                new Robot("Chappi", 1000, 8),
                new Robot("Valli", 2000, 15)
        };

        Trap[] traps = {
                new Track(90),
                new Wall(1),
                new Track(200),
                new Wall(4),
                new Track(1000),
                new Wall(5),
                new Track(500)
        };

        for (Competitor c : competitors) {
            for (Trap t : traps) {
                if (!t.overcoming(c)) {
                    System.out.printf("\n> %s %s выбывает из соревнования", c.getClass().getSimpleName(),
                            c.getName());
                    break;
                }
            }
            System.out.println();
        }

    } // eof main()
} // eof Competition
