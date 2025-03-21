package se.salt.chapter12;

import java.util.HashMap;
import java.util.Map;

public class CompareTestResult {

    public static void main(String[] args) {
        getFinalGrades();
    }

    private static void getFinalGrades() {
        Map<String, Integer> finalGrade = calculateFinalGrades();
        finalGrade.forEach((k, v) -> System.out.println("Final grade for " + k + " is " + v + " points"));
    }

    public static Map<String, Integer> calculateFinalGrades() {

        Map<String, Integer> finalGrade = new HashMap<>();

        for (var entry : getOriginalGrades().entrySet()) {
            String student = entry.getKey();
            int originalScore = entry.getValue();
            int makeUpScore = getMakeUpGrades().getOrDefault(student, 0);

            finalGrade.put(student, Math.max(originalScore, makeUpScore));
        }

        return finalGrade;
    }

    public static Map<String, Integer> getOriginalGrades() {

        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }

    public static Map<String, Integer> getMakeUpGrades() {

        Map<String, Integer> grades = new HashMap<>();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }
}
