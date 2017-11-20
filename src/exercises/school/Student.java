
//TODO: Add toString() to Student Class
//TODO: Create method to accumulate numberOfCredits
//TODO: Resolve issue with getGps() - currently the formula must be entered in the return statement.
    // It will not pull the data from setGpa().

package exercises.school;

import javax.naming.NameNotFoundException;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private double numberOfCredits;
    private double numberOfPoints;
    private double gpa;
    protected double totalQualityScore;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }
    // addGrade calls getGpa

    public void addGrade(double updatedGpa) {
        updatedGpa = getGpa();
    }

    // getGradeLevel calls getNumberOfCredits and checks
    // credit total and returns a grade level.

    public String getGradeLevel() {
        double gradeLevel = getNumberOfCredits();

        if (gradeLevel >= 90.0) {
            return "Senior";
        }
        if (gradeLevel >= 60.0 && gradeLevel <= 89.0) {
            return "Junior";
        }
        if (gradeLevel >= 30.0 && gradeLevel <= 59.0) {
            return "Sophomore";
        } else {
            return "Freshman";
        }
    }

    // setTotalQualityScore calls two methods - getNumberOfCredits and getNumberOfPoints
    // to get the updated information as it is entered.

    public void setTotalQualityScore(double classPoints, double credits) {
        credits = getNumberOfCredits();
        classPoints = getNumberOfPoints();
        totalQualityScore = classPoints * credits;
    }

    public double getTotalQualityScore() {
        return getNumberOfCredits() * getNumberOfPoints();
    }

    public void setName(String aName) {
        aName.equals(name);
    }

    public String getName() {
        return name;
    }

    public void setNextStudentId(int aStudentId) {
        aStudentId = studentId;
    }

    public int getNextStudentId() {
        return nextStudentId++;
    }

    // SetNumberOfCredits accumulates every time credits are added
    // to a student's total. This will help determine the grade level.

    protected void setNumberOfCredits(double aSetNumberOfCredits) {
        numberOfCredits += aSetNumberOfCredits;
    }

    public double getNumberOfCredits() {
        return numberOfCredits;
    }

    // setNumberOfPoints sets a range (max - 4.0, min - 0.0)

    public void setNumberOfPoints(double aSetNumberOfPoints) {
        if (numberOfPoints > 4.0 || numberOfPoints < 0.0) {
            throw new IllegalArgumentException("----POINT TOTAL OUT OF RANGE----");
        } else {
            numberOfPoints = aSetNumberOfPoints;
        }
    }

    public double getNumberOfPoints() {
        return numberOfPoints;
    }

    // setGpa calls two methods - getTotalQualityScore and getNumberOfCredits
    // This will help keep the current GPA updated as points and credits are changed.

    public void setGpa(double qualityScore, double creditCount) {
        qualityScore = getTotalQualityScore();
        creditCount = getNumberOfCredits();
        gpa = getTotalQualityScore() / getNumberOfCredits();
    }

    public double getGpa() {
        if (gpa > 4.0 ) {
            return Double.parseDouble("GPA is higher that allowed.");
        }
        if (Double.isNaN(gpa)){
            return 0.0;
        }
        else {
            return gpa = getTotalQualityScore() / getNumberOfCredits();
        }


    }
}





