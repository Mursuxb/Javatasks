package Week3_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Fibonacci {
    public static void main(String[] args) {
        String csvFileName = "Fibonacci.csv";

        try (Writer writer = new FileWriter(csvFileName)) {
            writer.write("Index, Fibonacci Number\n");

            long firstNum = 0;
            long secondNum = 1;
            writer.write(1 + ", " + firstNum + "\n");
            writer.write(2 + ", " + secondNum + "\n");
            for (int i = 3; i <= 100; i++) {
                long total = firstNum + secondNum;
                writer.write(i + ", " + total + "\n");
                firstNum = secondNum;
                secondNum = total;
            }

            System.out.println("Fibonacci numbers have been written to " + csvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

