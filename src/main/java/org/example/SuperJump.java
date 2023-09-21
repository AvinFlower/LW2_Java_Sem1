package org.example;

public interface SuperJump {
        default void superJump(String name){
            System.out.println(name + " перепрыгнул с помощью способности");
        }
}
