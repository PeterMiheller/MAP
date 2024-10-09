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
        return sum / grades.length;
    }

    // 3.
    public int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = roundGrade(grades[i]);
        }
        return roundedGrades;
    }


    private int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }
        int nextMultipleOfFive = ((grade / 5) + 1) * 5;
        if (nextMultipleOfFive - grade < 3) {
            return nextMultipleOfFive;
        }
        return grade;
    }

    // 4.
    public int getMaxRoundedGrade(int[] grades) {
        int maxRoundedGrade = 0;
        for (int grade : grades) {
            int roundedGrade = roundGrade(grade);
            if (roundedGrade > maxRoundedGrade) {
                maxRoundedGrade = roundedGrade;
            }
        }
        return maxRoundedGrade;
    }


}
