package Week3_4;

import java.io.*;

public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        Student jim = new Student(1, "Jim Nobody", 11);
        Student tim = new Student(2, "Tim Better than Jim", 12);
        Course math = new Course("MT10169", "Math 101", "Peter Buttersworth");
        Enrollment enrollment = new Enrollment(jim, math, "01.10.1999");

        File f = new File(FILENAME);

        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream);
        ) {
            objects.writeObject(enrollment);
        } catch (Exception e) {
            System.err.println("Writing enrollment: " + e);
        }
        try (
                FileInputStream inputstream = new FileInputStream(FILENAME);
                ObjectInputStream objects = new ObjectInputStream(inputstream);
        ) {
            Enrollment testEnrollment = (Enrollment) objects.readObject();
            System.out.println("Course name: " + testEnrollment.getCourse().getCourseName() + "\nStudent name: " + testEnrollment.getStudent().getName() + "\nEnrollment date: " + testEnrollment.getEnrollmentDate() );
        } catch (
                Exception e) {
            System.err.println("Reading enrollment: " + e);
        }

    }
}


