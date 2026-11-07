
package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeCalcTest {

    @Test
    void testTotal() {
        assertEquals(225,
            GradeCalc.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            GradeCalc.calculateAverage(75, 68, 82));
    }

    @Test
    void testGradeA() {
        assertEquals("A", GradeCalc.calculateGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", GradeCalc.calculateGrade(85));
    }

    @Test
    void testGradeC() {
        assertEquals("C", GradeCalc.calculateGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals("D", GradeCalc.calculateGrade(60));
    }
}
