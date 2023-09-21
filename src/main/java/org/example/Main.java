package org.example;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Гарик", 300,3),
                new Human("Сева", 100,1),
                new Cat("Кейн", 200,1),
                new Cat("Феликс", 150,2),
                new Robot("МегаБотик", 800,5)
        };
        Trials[] trials = {
                new Road(RunningRoad.LOW),
                new Wall(HighJump.longest),
                new Wall(HighJump.normal),
                new Wall(HighJump.low),
                new Road(RunningRoad.NORMAL),
                new Wall(HighJump.longest),
                new Wall(HighJump.normal),
                new Wall(HighJump.low),
                new Road(RunningRoad.LONGEST),
        };
        for (Participant p: participants)
        {
            for (Trials t: trials)
            {
                if (!t.can(p)) break;
            }
        }
    }
}