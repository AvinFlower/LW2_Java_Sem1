package org.example;

public class Human implements Participant{
    private final int maxJump;
    private final int maxRun;
    protected String name;

    public Human(String name, int maxRun, int maxJump)
    {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun)
        {
            System.out.println(name + " успешно пробежал " + distance + "м");
            return true;
        }
        else
        {
            System.out.println(name + " не смог пробежать " + distance + "м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump)
        {
            System.out.println(name + " успешно перепрыгнул " + height + "м");
            return true;
        }
        else
        {
            System.out.println(name + " не смог перепрыгнуть " + height + "м, участник выбывает");
            return false;
        }
    }
}
