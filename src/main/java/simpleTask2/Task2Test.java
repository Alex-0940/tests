package simpleTask2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Task2Test {

	@Test
	public void isNumber() {

		// Тестирование на некорректные входные данные.
		//
		String t1 = " ";
		String t2 = "rrsdf";
		String t3 = "-1df";

		assertFalse(t1, Task2.isNumber(t1));
		assertFalse(t2, Task2.isNumber(t2));
		assertFalse(t3, Task2.isNumber(t3));

		// Тестирование на корректные входные данные.
		//
		String t4 = "50";
		String t5 = "56487";
		String t6 = "98897";
		String t7 = "5555";
		String t8 = "122";

		assertTrue(t4, Task2.isNumber(t4));
		assertTrue(t5, Task2.isNumber(t5));
		assertTrue(t6, Task2.isNumber(t6));
		assertTrue(t7, Task2.isNumber(t7));
		assertTrue(t8, Task2.isNumber(t8));
	}

	@Test
	public void isPrime() {

		// Тестирование на определение простого числа.
		//
		Long t9 = -1L;
		Long t10 = 0L;
		Long t11 = 2L;
		Long t12 = 113L;
		Long t13 = 5L;

		assertFalse(t9.toString(), Task2.isPrime(t9));
		assertFalse(t10.toString(), Task2.isPrime(t10));

		assertTrue(t11.toString(), Task2.isPrime(t11));
		assertTrue(t12.toString(), Task2.isPrime(t12));
		assertTrue(t13.toString(), Task2.isPrime(t13));
	}

}
