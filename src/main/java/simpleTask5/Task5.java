package simpleTask5;

import java.util.Scanner;

/**
 * Программа выполняет поиск подстроки в строке.
 */
public class Task5 {
	private static void getInput() {

		System.out.printf("Enter the string: ");
		// Введите строку
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		System.out.printf("Enter the substring: ");
		// Введите подстроку
		String sub = scan.nextLine();
		scan.close();

		if (searchSubstring(str, sub))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	/**
	 * Преобразование строки в массив символов
	 */
	public static char[] toCharacterArray(String str) {

		if (str == null)
			return new char[] {};

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; ++i) {
			arr[i] = str.charAt(i);
		}

		return arr;
	}

	/**
	 * Поиск подстроки в строке.
	 */
	public static boolean searchSubstring(String str, String subStr) {

		boolean result = false;
		char[] charsOfStr = toCharacterArray(str);
		char[] charsOfSubStr = toCharacterArray(subStr);
		int strLen = charsOfStr.length;
		int subLen = charsOfSubStr.length;
		int counter = 0;

		for (int i = 0; i <= strLen - subLen; ++i) {
			for (int j = 0; j < subLen; ++j) {

				if (charsOfStr[i + j] == charsOfSubStr[j]) {
					++counter;
				}
				if (counter == subLen) {
					result = true;
					break;
				}
			}
			counter = 0;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("The program searches for the substring within the string");
		// Программа выполняет поиск подстроки в строке
		// Ввод аргументами через системную консоль.
		if (args.length > 1)
			if (searchSubstring(args[0], args[1])) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		// Интерактивный ввод через системную консоль.
		else
			getInput();
	}
}
