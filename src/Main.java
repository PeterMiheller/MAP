//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Ex1.UniversityGrades;

public class Main {
    public static void main(String[] args) {
        UniversityGrades grades = new UniversityGrades();
        int[] gradesArray = {29, 37, 38, 41, 84, 67};
        //1
        int[] failingGrades = grades.getFailingGrades(gradesArray);
        System.out.println("1. Nicht ausreichende Noten: ");
        for (int grade : failingGrades) {
            System.out.print(grade + "; ");
        }
        //2
        double averageGrade = grades.getAverageGrade(gradesArray);
        System.out.println("\n2. Durchschnitt der Noten: " + averageGrade);
        //3
        int[] roundedGrades = grades.getRoundedGrades(gradesArray);
        System.out.println("3. Gerundete Noten: ");
        for (int grade : roundedGrades) {
            System.out.print(grade + "; ");
        }
        //4
        int maxRoundedGrade = grades.getMaxRoundedGrade(gradesArray);
        System.out.println("\n4. Die maximale abgerundete Note: " + maxRoundedGrade);
    }
}