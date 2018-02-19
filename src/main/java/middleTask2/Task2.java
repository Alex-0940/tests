package middleTask2;

import java.util.Scanner;

/**
 * Программа выполняет run-length-encoding кодирование строки (aaabccdd ->
 * 3a1b2c2d)
 */
public class Task2 {
	private static String getInput() {

		Scanner scan = new Scanner(System.in);
		String str;

		System.out.println("Enter the string: ");
		// Введите строку
		str = scan.nextLine();
		scan.close();
		return str;
	}

	/**
	 * Кодирование повторов Run-Length Encoding
	 */
	public static String encodeRLE(String str) {

		String ip = str;
		int len = ip.length(), i = 0, c = 0;
		char f = ip.charAt(0);

		String op = "";
		for (; i < len; ++i) {
			if (i + 1 < len) {
				if (ip.charAt(i) == ip.charAt(i + 1)) {
					++c;
				} else {
					op = op + Integer.toHexString(c + 1) + f;
					c = 0;
					f = ip.charAt(i + 1);
				}
			} else {
				op = op + Integer.toHexString(c + 1) + f;
			}
		}
		return op;
	}

	public static void main(String[] args) {

		System.out.println("The program performs RLE the encoding of the string.");
		// Программа выполняет RLE кодировку строки
		// Ввод через системную консоль.
		if (args.length > 0)
			System.out.println(encodeRLE(args[0]));
		// Интерактивный ввод через системную консоль.
		else
			System.out.println(encodeRLE(getInput()));
	}
}
