package Week5_1;

public class ThreadedNumberPrinting {
    public static class OddPrinter implements Runnable {
        private int startNum;
        private int endNum;

        public OddPrinter(int startNum, int endNum) {
            this.startNum = startNum;
            this.endNum = endNum;
        }

        @Override
        public void run() {
            for (int i = this.startNum; i <= this.endNum; i++) {
                if (i % 2 == 1) {
                    System.out.println("Odd Thread: " + i);
                }
            }
        }
    }

    public static class EvenPrinter implements Runnable {
        private int startNum;
        private int endNum;

        public EvenPrinter(int startNum, int endNum) {
            this.startNum = startNum;
            this.endNum = endNum;
        }

        @Override
        public void run() {
            for (int i = this.startNum; i <= this.endNum; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread: " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int startNum = 1;
        int endNum = 20;
        Thread oddThread = new Thread(new OddPrinter(startNum, endNum));
        Thread evenThread = new Thread(new EvenPrinter(startNum, endNum));
        oddThread.start();
        evenThread.start();
        try {
            Thread.sleep(1000);
            System.out.println("Printing complete.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
