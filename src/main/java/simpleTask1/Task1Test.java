package simpleTask1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Task1Test {

	/**
	 * Тестирование алгоритма получения 2-ого по величине числа из набора чисел.
	 */
	@Test
	public void getSecondBigNumber() throws Exception {

		// Тестирование на НЕкорректное получение числа.

		Integer[] t0 = { 10, 20, 20, 10, 5 };
		//
		assertEquals(Integer.valueOf(10), Task1.secondBigNumber(t0));

		// Тестирование на корректное получение числа.

		Integer[] t1 = { 20, 50, 66, 2, 1, 5 };
		Integer[] t2 = { 0, 0, 6, 2, 0, 5 };
		Integer[] t3 = { -10, -50, 6, 2, 51, 95 };

		assertEquals(Integer.valueOf(50), Task1.secondBigNumber(t1));
		assertEquals(Integer.valueOf(5), Task1.secondBigNumber(t2));
		assertEquals(Integer.valueOf(51), Task1.secondBigNumber(t3));

	}
}