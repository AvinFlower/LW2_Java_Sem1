package org.example;

public class Wall implements Trials{
    private int height;
    public Wall(HighJump highJump) {
        this.height = highJump.getHeight();
    }
    @Override
    public boolean can (Participant participant){
        return participant.jump(height);
    }
}
