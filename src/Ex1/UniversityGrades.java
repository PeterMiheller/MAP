package Ex1;

public class UniversityGrades {
    //1.
    public int[] getFailingGrades(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }
        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index] = grade;
                index++;
            }
        }
        return failingGrades;
    }
    //2.
    public double getAverageGrade(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        return average;
    }



}
