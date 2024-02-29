package dev.lpa;

public class Main {
    public static void main(String[] args) {
        var thread = Thread.currentThread();
        System.out.println(thread.getClass().getName());

        System.out.println(thread);
        printThreadState(thread);
    }
    public static void printThreadState(Thread thread) {
        System.out.println("---------------");
        System.out.println("thread id: "+ thread.getId());
        System.out.println("thread name: "+ thread.getName());
        System.out.println("thread state: "+ thread.getState());
        System.out.println("thread priority: "+ thread.getPriority());
        System.out.println("thread is alive: "+ thread.isAlive());
        System.out.println("thread group: "+ thread.getThreadGroup());
        System.out.println("---------------");
    }
}
