package Week5_2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class ThreadSafeArrayList {
    public static class NewArrayList {
        private int size;
        public ArrayList<String> contents = new ArrayList<String>();

        public NewArrayList() {
            this.size = 0;
        }

        public synchronized void add(String content) {
            this.size++;
            contents.add(content);
        }

        public synchronized int size() {
            return this.size;
        }

        public synchronized void remove(String content) {
            if (contents.contains(content)) {
                this.size--;
                contents.remove(content);
            } else System.out.println("Content not found.");
        }
    }

    public class Test implements Runnable {
        NewArrayList arrayList;

        public Test(NewArrayList arrayList) {
            this.arrayList = arrayList;
        }

        @Override
        public void run() {
            arrayList.add("KEKW");
            arrayList.add("in");
            arrayList.add("the");
            arrayList.add("Chat");
            arrayList.remove("the");
            System.out.println(arrayList.size());
        }

    }

    public static void main(String[] args) {
        ThreadSafeArrayList threadSafeArrayList = new ThreadSafeArrayList();
        NewArrayList arrayList = new NewArrayList();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(threadSafeArrayList.new Test(arrayList));
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (String content : arrayList.contents) {
            System.out.println(content);
        }
    }
}


