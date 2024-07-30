package com.razeft.alfanumeric.modules;

import com.razeft.alfanumeric.util.Type;

import java.util.concurrent.TimeUnit;

public class AlfanumericThread implements Runnable{

    private Type type;

    public AlfanumericThread(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public void run() {
        switch (type) {
            case LETTER:
                System.out.println("Start Thread Case: " + type);
                for(char c = 'A'; c <= 'Z'; c++){
                    System.out.println(c);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("End Thread case: " + type);
                break;
            case NUMBER:
                System.out.println("Start Thread Case: " + type);
                for(int i = 1; i < 10; i++){
                    System.out.println(i);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("End Thread case: " + type);
                break;
        }
    }
}
