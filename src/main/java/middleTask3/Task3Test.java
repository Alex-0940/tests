package middleTask3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task3Test {
	@Test
	public void decodeRLD() throws Exception {

		// Тестрирование RLD декодирования строки.

		String tSrc1 = "3a1b2c2d";
		String tExt1 = "aaabccdd";

		String tSrc2 = "4o4p4s";
		String tExt2 = "ooooppppssss";

		String tSrc3 = "4!5$1#7.";
		String tExt3 = "!!!!$$$$$#.......";

		assertEquals(tExt1, Task3.decodeRLD(tSrc1));
		assertEquals(tExt2, Task3.decodeRLD(tSrc2));
		assertEquals(tExt3, Task3.decodeRLD(tSrc3));
	}
}