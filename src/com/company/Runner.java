package com.company;

public class Runner extends Thread {
    private int id;
    private String diraction;

    public Runner(int id, String diraction) {
        this.id = id;
        this.diraction = diraction;
    }

    public synchronized void run() {
        try {
            if (id < 5 && diraction.equals("forwards")) {
                System.out.println("Бегун "+id+" Бежит палочку");
                System.out.println("Бегун "+id+" Бежит k бегуну "+(id+1));
                sleep(1000);
            }
            if (id == 5) {
                System.out.println("Бегун "+id+" Бежит палочку");
                System.out.println("Бегун "+id+" Бежит k финишу");
                sleep(1000);
                System.out.println("Бегун "+id+" Бежит k бегуну "+(id-1));
            }
            if (id > 1 && diraction.equals("назад")) {
                System.out.println("Бегун "+id+" берет палочку");
                System.out.println("Бегун "+id+" Бежит k бегуну "+(id-1));
                sleep(1000);
            }
            if (id == 1 && diraction.equals("назад ")) {
                System.out.println("Бегун "+id+" берет палочку");
            }
        } catch (Exception e) {}
    }
}
