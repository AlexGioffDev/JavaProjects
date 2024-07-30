package com.razeft.alfanumeric;

import com.razeft.alfanumeric.modules.AlfanumericThread;
import com.razeft.alfanumeric.util.Type;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        Thread threadNumeric = new Thread(new AlfanumericThread(Type.NUMBER));
        Thread threadLetter = new Thread(new AlfanumericThread(Type.LETTER));

        System.out.println("Start threads...");

        threadNumeric.start();
        threadNumeric.join();
        threadLetter.start();
        threadLetter.join();

        System.out.println("End Threads...");
    }
}
