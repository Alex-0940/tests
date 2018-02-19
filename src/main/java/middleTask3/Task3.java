package middleTask3;

import java.util.Scanner;

/**
 * Программа выполняет run-length-decoding декодирование строки (3a1b2c2d ->
 * aaabccdd)
 */
public class Task3 {
	private static String getInput() {

		Scanner scan = new Scanner(System.in);
		String str;

		System.out.printf("Enter the string: ");
		// Введите строку
		str = scan.nextLine();
		scan.close();
		return str;
	}

	/**
	 * Декодирование Run-Length Decoding
	 */
	public static String decodeRLD(String str) {

		if (str == "" || str == null)
			return "";

		int count = 0;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c))
				count = count * 10 + c - '0';
			else {
				while (count > 0) {
					result.append(c);
					--count;
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {

		System.out.println("The program performs RLD the decoding of the string");
		// Программа выполняет RLD декодирование строки
		// Ввод через системную консоль.
		if (args.length > 0)
			System.out.println(decodeRLD(args[0]));
		// Интерактивный ввод через системную консоль.
		else
			System.out.println(decodeRLD(getInput()));
	}
}
