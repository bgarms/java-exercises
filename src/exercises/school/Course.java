
// TODO: Add toString() method to Course Class
// TODO: Add students to HashMap (roster)

package exercises.school;

import java.util.HashMap;

public class Course {
    private static String courseName;
    private static int numberOfStudents = 0;
    private final int maxNumberOfStudents = 30;
    private final int minNumberOfStudents = 5;
    private double averageGpa;
    private static HashMap<Integer, Object> roster = new HashMap<>();

    public void setCourseName (String courseSubject) {
        courseSubject.equals(courseName);
    }

    public void setNumberOfStudents(int aNumberOfStudents){
        aNumberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public static void main(String[] args){

        // Creates three new student Objects using the constructor
        // that only requires a name paramenter.

        Student Washington = new Student("George Washington");

        Washington.setNextStudentId(0);
        Washington.setNumberOfCredits(4.0);
        Washington.setNumberOfPoints(3.5);
        Washington.getTotalQualityScore();
        Washington.getGpa();


        Student Franklin = new Student("Ben Franklin");

        Franklin.setNextStudentId(1);
        Franklin.setNumberOfCredits(1.5);
        Franklin.setNumberOfPoints(3.0);
        Franklin.getTotalQualityScore();
        Franklin.getGpa();

        Student Hamilton = new Student("Alexander Hamilton");

        Hamilton.setNextStudentId(2);
        Hamilton.setNumberOfCredits(3.0);
        Hamilton.setNumberOfPoints(4.0);
        Hamilton.getTotalQualityScore();
        Hamilton.getGpa();


        // Testing with print statements

        System.out.println("\n");

        System.out.println("Student: " +Washington.getName() + "\nGrade Level: " + Washington.getGradeLevel() +
                "\nQuality Score: " + Washington.getTotalQualityScore() +
                "\nGPA: " + Washington.getGpa());

        System.out.println("\n");


        System.out.println(Franklin.getName() + "\nhas a " + Franklin.getTotalQualityScore() +
                " Quality Score\nand a " + Franklin.getGpa() + "GPA");

        System.out.println("\n");


        System.out.println(Hamilton.getName() + " has a " + Hamilton.getTotalQualityScore() +
                " Quality Score and a " +Hamilton.getGpa() + " GPA");

    }
}

