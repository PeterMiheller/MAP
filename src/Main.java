//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Ex1.UniversityGrades;

public class Main {
    public static void main(String[] args) {
        UniversityGrades grades = new UniversityGrades();
        int[] gradesArray = {84, 29, 57, 33, 89, 73, 38};
        int[] failingGrades = grades.getFailingGrades(gradesArray);
        System.out.println("1. Nicht ausreichende Noten: ");
        for (int grade : failingGrades) {
            System.out.print(grade + "; ");
        }
    }
}