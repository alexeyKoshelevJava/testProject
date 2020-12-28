import junit.framework.AssertionFailedError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void testTurnTable() {

        //given

        int[][] colors = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedColors = new int[colors.length][colors.length];
        int degrees = 1;
        int[][] expected = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};

        //when


        int[][] realArray = Main.turnTable(colors, rotatedColors, degrees);
        //then
        assertArrayEquals(expected, realArray);

    }

    @Test
    void testTurnTableTrows() {

        //given

        int[][] colors = {{2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedColors = new int[colors.length][colors.length];
        int degrees = 2;
        int[][] expected = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};

        //expected

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Main.turnTable(colors, rotatedColors, degrees);
        });
    }

    @Test
    void testTurnTableNegativ() {

        //given

        int[][] colors = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedColors = new int[colors.length][colors.length];
        int degrees = 2;
        int[][] expected = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
        int expectedValue = expected[0][0];
//when
        int[][] realArray = Main.turnTable(colors, rotatedColors, degrees);
        int realArrayValue = realArray[0][0];
//     then
       assertNotEquals(expectedValue,realArrayValue);








    }
}
