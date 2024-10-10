//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Ex1.UniversityGrades;
import Ex2.NaturalNumbers;
import Ex3.BigNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UniversityGrades grades = new UniversityGrades();
        System.out.println("Aufgabe 1");
        int[] gradesArray = {29, 37, 38, 41, 84, 67};
        //1.1
        int[] failingGrades = grades.getFailingGrades(gradesArray);
        System.out.println("1. Nicht ausreichende Noten: ");
        for (int grade : failingGrades) {
            System.out.print(grade + "; ");
        }
        //1.2
        double averageGrade = grades.getAverageGrade(gradesArray);
        System.out.println("\n2. Durchschnitt der Noten: " + averageGrade);
        //1.3
        int[] roundedGrades = grades.getRoundedGrades(gradesArray);
        System.out.println("3. Gerundete Noten: ");
        for (int grade : roundedGrades) {
            System.out.print(grade + "; ");
        }
        //1.4
        int maxRoundedGrade = grades.getMaxRoundedGrade(gradesArray);
        System.out.println("\n4. Die maximale abgerundete Note: " + maxRoundedGrade);
        //2
        NaturalNumbers number = new NaturalNumbers();
        System.out.println("\nAufgabe 2");
        int[] numbersArray = {4, 8, 3, 10, 17};
        System.out.println("1. Maximale Zahl: " + number.findMaximum(numbersArray));
        System.out.println("2. Minimale Zahl: " + number.findMinimum(numbersArray));
        System.out.println("3. Maximale Summe von n-1 Zahlen: " + number.findMaxSum(numbersArray));
        System.out.println("4. Minimale Summe von n-1 Zahlen: " + number.findMinSum(numbersArray));
        //3
        BigNumber bigNumber = new BigNumber();
        System.out.println("\nAufgabe 3");
        //1
        int[] bigNumber1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("1. Summe: " + Arrays.toString(bigNumber.add(bigNumber1, bigNumber2)));
        //2
        int[] bigNumber3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] bigNumber4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("2. Differenz: " + Arrays.toString(bigNumber.sub(bigNumber3, bigNumber4)));
        //3
        int[] bigNumber5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.println("3. Multiplikation: " + Arrays.toString(bigNumber.mul(bigNumber5, 2)));
        //4
        int[] bigNumber6 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.println("4. Division: " + Arrays.toString(bigNumber.div(bigNumber6, 2)));
    }
}