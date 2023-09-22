package Week5_1;

public class ParallelNumberSummation {
    public static class NumberSummer implements Runnable {
        private int start;
        private int end;
        private int[] numbers;
        private int sum;

        public NumberSummer(int start, int end, int[] numbers) {
            this.start = start;
            this.end = end;
            this.numbers = numbers;
            this.sum = 0;
        }

        @Override
        public void run() {
            for (int i = this.start; i <= this.end; i++) {
                this.sum += this.numbers[i];
            }
        }

        public int getSum() {
            return this.sum;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numThreads = 3;
        int start = 0;
        int end = numbers.length - 1;
        int sum = 0;
        int totalSum = 0;
        Thread[] threads = new Thread[numThreads];
        NumberSummer[] numberSummers = new NumberSummer[numThreads];
        for (int i = 0; i < numThreads; i++) {
            numberSummers[i] = new NumberSummer((i * (numbers.length / numThreads)), (i * (numbers.length / numThreads)+(numbers.length / numThreads)-1), numbers);
            threads[i] = new Thread(numberSummers[i]);
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                sum = numberSummers[i].getSum();
                System.out.println("Sum of thread " + i + ": " + sum);
                totalSum += sum;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Sum on all threads: " + totalSum);
    }
}
