package chapter12;

import org.junit.jupiter.api.Test;
import se.salt.chapter12.CompareTestResult;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTestResultTest {

    @Test
    void testCompareTestResult_with_calculateFinalGrade() {
        Map<String, Integer> finalGrades = CompareTestResult.calculateFinalGrades();

        assertEquals(97, finalGrades.get("Angie"));
        assertEquals(82, finalGrades.get("Dave"));
        assertEquals(80, finalGrades.get("Lisi"));  // Original was 80, Makeup was 76 -> 80
        assertEquals(89, finalGrades.get("Raja"));
        assertEquals(79, finalGrades.get("Shashi")); // Same in both
        assertEquals(98, finalGrades.get("Bas"));
        assertEquals(80, finalGrades.get("Carlos"));
        assertEquals(95, finalGrades.get("Amber"));
        assertEquals(95, finalGrades.get("Rex"));   // Original was 95, Makeup was 90 -> 95
        assertEquals(63, finalGrades.get("Jason")); // Original was 63, Makeup was 62 -> 63
        assertEquals(79, finalGrades.get("Nikolay"));
    }
}
