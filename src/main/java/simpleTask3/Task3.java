package simpleTask3;

import java.util.Scanner;

/**
 * Программа выполняет проверку строки на то, что она является полиндромом.
 */
public class Task3 {
	private static String getInput() {
		System.out.printf("Enter a string to check whether he palindrome: ");
		// Введите строку для проверки - является ли он полиндромом
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		return str;
	}

	/**
	 * Реверс строки
	 */
	public static String reverseString(String str) {
		String r = "";
		for (int i = str.length() - 1; i >= 0; --i)
			r += str.charAt(i);
		return r;
	}

	/**
	 * Является ли строка полиндромом.
	 */
	public static boolean isPalindrome(String str) {

		if (str.equals(reverseString(str))) {
			System.out.println("Yes a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		return str.equals(reverseString(str));
	}

	public static void main(String[] args) {
		System.out.println("The program performs validation of a string that it is palindrome");
		// Программа выполняет проверку строки на то, что она является полиндромом
		// Ввод аргументами через системную консоль.
		if (args.length > 1) {
			isPalindrome(args[0]);
		} else {
			// Интерактивный ввод через системную консоль.
			isPalindrome(getInput());
		}
	}
}
