package com.saatvik.course.collections;

public class Java21Feature {

    void m1(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {

        var obj = new Java21Feature();
        if (obj instanceof Java21Feature obj2){
            obj2.m1();
        }
        Thread.ofVirtual().start(()-> System.out.println(Thread.currentThread()));

        System.out.println("********");

//        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//            executor.submit(()-> System.out.println(Thread.currentThread()));
//        }
    }
}
