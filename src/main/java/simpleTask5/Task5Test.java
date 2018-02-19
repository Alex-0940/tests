package simpleTask5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task5Test {

	@Test
	public void toCharacterArray() throws Exception {

		// Тестирование преобразования строки в массив символов.
		//
		char[] tCha00 = new char[] {};
		String tStr00 = null;

		char[] tCha01 = new char[] {};
		String tStr01 = "";

		char[] tCha02 = new char[] { 's' };
		String tStr02 = "s";

		char[] tCha03 = new char[] { 's', '2', '1', '-', '=', '+', };
		String tStr03 = "s21-=+";

		assertArrayEquals(tCha00, Task5.toCharacterArray(tStr00));
		assertArrayEquals(tCha01, Task5.toCharacterArray(tStr01));
		assertArrayEquals(tCha02, Task5.toCharacterArray(tStr02));
		assertArrayEquals(tCha03, Task5.toCharacterArray(tStr03));
	}

	@Test
	public void searchSubstring() {

		// Тестирование на вхождение подстроки в строке.
		//
		String tStr00 = "abracadabra";
		String tSub00 = "cada";
		//
		String tStr01 = "hello World my amazing friends!";
		String tSub01 = "!";
		//
		String tStr02 = "55 + 66 = 121";
		String tSub02 = "121";
		//
		assertTrue(Task5.searchSubstring(tStr00, tSub00));
		assertTrue(Task5.searchSubstring(tStr01, tSub01));
		assertTrue(Task5.searchSubstring(tStr02, tSub02));

		// Тестирование на не вхождение подстроки в строке.
		//
		String tStr10 = "syybgerror";
		String tSub10 = "orda";
		//
		String tStr11 = "ron for foundation";
		String tSub11 = "xfvv";
		//
		assertFalse(Task5.searchSubstring(tStr10, tSub10));
		assertFalse(Task5.searchSubstring(tStr11, tSub11));
	}
}
