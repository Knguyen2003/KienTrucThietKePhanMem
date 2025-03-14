package com.iuh.test;

import com.iuh.singleton.*;

public class TestSingleTon {
    public static void main(String[] args) {

        // EagerInitializedSingleton
        System.out.println("=====================EagerInitializedSingleton=====================");
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        System.out.println("EagerInitializedSingleton instance1: " + instance1.hashCode());
        System.out.println("EagerInitializedSingleton instance2: " + instance2.hashCode());

        // StaticBlockSingleton
        System.out.println("=====================StaticBlockSingleton=====================");
        StaticBlockSingleton instance3 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance4 = StaticBlockSingleton.getInstance();
        System.out.println("StaticBlockSingleton instance3: " + instance3.hashCode());
        System.out.println("StaticBlockSingleton instance4: " + instance4.hashCode());


        // LazyInitializedSingleton
        System.out.println("=====================LazyInitializedSingleton=====================");
        LazyInitializedSingleton instance5 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance6 = LazyInitializedSingleton.getInstance();
        System.out.println("LazyInitializedSingleton instance5: " + instance5.hashCode());
        System.out.println("LazyInitializedSingleton instance6: " + instance6.hashCode());

        // ThreadSafeSingleton
        System.out.println("=====================ThreadSafeSingleton=====================");
        ThreadSafeSingleton instance7 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        ThreadSafeSingleton instance8 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println("ThreadSafeSingleton instance7: " + instance7.hashCode());
        System.out.println("ThreadSafeSingleton instance8: " + instance8.hashCode());


        //BillPughSingleton
        System.out.println("=====================BillPughSingleton=====================");
        BillPughSingleton instance9 = BillPughSingleton.getInstance();
        BillPughSingleton instance10 = BillPughSingleton.getInstance();
        System.out.println("BillPughSingleton instance9: " + instance9.hashCode());
        System.out.println("BillPughSingleton instance10: " + instance10.hashCode());

    }
}
