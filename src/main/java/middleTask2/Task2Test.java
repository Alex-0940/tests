package middleTask2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task2Test {
	@Test
	public void encodeRLE() throws Exception {

		// Тестирование RLE кодирования строки.

		String tSrc1 = "aaabccdd";
		String tExt1 = "3a1b2c2d";

		String tSrc2 = "rereereeer";
		String tExt2 = "1r1e1r2e1r3e1r";

		String tSrc3 = "0000011122211100101000";
		String tExt3 = "503132312011101130";

		String tSrc4 = "!!!!$$$$$#.......";
		String tExt4 = "4!5$1#7.";

		assertEquals(tExt1, Task2.encodeRLE(tSrc1));
		assertEquals(tExt2, Task2.encodeRLE(tSrc2));
		assertEquals(tExt3, Task2.encodeRLE(tSrc3));
		assertEquals(tExt4, Task2.encodeRLE(tSrc4));
	}
}
