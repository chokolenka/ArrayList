package Assertions;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AE41Test {
    private int arr[] = new int[]{5, 7, -8, 5, 14, 1};
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @org.junit.jupiter.api.Test
    void getSmallest() {
        Assertions.assertArrayEquals(new int[]{-8,1},AE41.getSmallest(arr));
    }

    @org.junit.jupiter.api.Test
    void getSmallest2() {
        Assertions.assertEquals("The smallest number is -8 and the second smallest number is 1.",
                AE41.getSmallest2(arr));
    }

    @org.junit.jupiter.api.Test
    void getSmallest3() {
        AE41.getSmallest3(arr);
        Assertions.assertEquals("The smallest number is -8 and the second smallest number is 1.\r\n",
                outContent.toString());
        outContent.reset();
    }

    @BeforeAll
    public static void setUpStream() {
        System.setOut(new PrintStream(outContent));

    }

    @AfterAll
    public static void restoreStream() {
        System.setOut(originalOut);

    }

}