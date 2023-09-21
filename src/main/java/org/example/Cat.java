package org.example;

public class Cat implements Participant, SuperJump{
    private final int maxJump;
    private final int maxRun;
    private String name;
    public int count;


    public Cat(String name, int maxRun, int maxJump)
    {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        count = 1;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " успешно пробежал " + distance + "м");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + "м");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.println(name + " успешно перепрыгнул " + height + "м");
            return true;
        } else if (count != 0) {
            superJump(name);
            count --;
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть " + height + "м, участник выбывает");
            return false;
        }
    }

}
