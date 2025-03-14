package com.iuh.test;

import com.iuh.singleton.LazyInitializedSingleton;
import com.iuh.singleton.ThreadSafeSingleton;

public class TestMultithread {
    public static void main(String[] args) {
        System.out.println("=====================LazyInitializedSingleton=====================");
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());
        Thread thread4 = new Thread(new Thread4());
        Thread thread5 = new Thread(new Thread5());
        Thread thread6 = new Thread(new Thread6());
        Thread thread7 = new Thread(new Thread7());
        Thread thread8 = new Thread(new Thread8());


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

    }

    static class Thread1 implements Runnable {
        @Override

        public void run() {
            ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread1: " + instance1.hashCode());
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread2: " + instance2.hashCode());
        }
    }

    static class Thread3 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread3: " + instance3.hashCode());
        }
    }

    static class Thread4 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread4: " + instance4.hashCode());
        }
    }

    static class Thread5 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance5 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread5: " + instance5.hashCode());
        }
    }

    static class Thread6 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton  instance6= ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread6: " + instance6.hashCode());
        }
    }


    static class Thread7 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton  instance7= ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread7: " + instance7.hashCode());
        }
    }

    static class Thread8 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton  instance8= ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println("Thread8: " + instance8.hashCode());
        }
    }

}
