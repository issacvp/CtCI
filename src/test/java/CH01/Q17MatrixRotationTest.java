package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Q17MatrixRotationTest {

    Q17MatrixRotation obj = new Q17MatrixRotation();

    @Test
    void matrixRotationTest() throws Exception {
        int data[][] = { { 1, 2, 3, 4 },
				         { 5, 6, 7, 8 },
				         { 9, 10, 11, 12 },
				         { 13, 14, 15, 16 } };
        data = obj.matrixRotation(data);
        assertTrue(data.length == 4 && data[1].length == 4 && data[0][0]== 13);
    }
}
