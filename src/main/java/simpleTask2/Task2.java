package simpleTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Программа выполняет разложение числа на набор простых множителей
 */
public class Task2 {
	/**
	 * Получить набор чисел.
	 */
	private static String getInput() {
		Scanner scan = new Scanner(System.in);
		String str;

		do {
			System.out.printf("Enter the number you want to decompose: ");
			// Введите число, которое необходимо разложить
			str = scan.next();
			if (isNumber(str)) {
				break;
			} else
				System.out.println("Incorrect input! Retype the number");
			// Некорректный ввод! Повторите ввод числа
		} while (true);

		scan.close();

		return str;
	}

	/**
	 * Проверка строки на число.
	 */
	static boolean isNumber(String str) {
		boolean ok = true;
		char ch;
		for (int i = 0; i < str.length(); ++i) {
			ch = str.charAt(i);
			// проверяется знаковый символ и диапозон (0 <= ch <= 9)
			if (i == 0 && ch == '-' && str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9')
				continue;
			// иначе проверяем символ на символ цифры.
			else {
				if (!(ch >= '0' && ch <= '9')) {
					ok = false;
					break;
				}
			}
		}
		return ok;
	}

	/**
	 * Преобразование строкового типа в в целое число.
	 */
	private static Long toInteger(String str) {

		Long numb = null;

		try {
			numb = Long.parseLong(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return numb;
	} // toInteger()

	/**
	 * Является ли число простым.
	 */
	protected static boolean isPrime(Long n) {
		boolean result = false;
		if (n != null) {
			if (n < 2L) {
				return false;
			} else if (n == 2L) {
				return true;
			} else if (n % 2L == 0L) {
				return false;
			}
			// пробный делитель
			int d = 3;
			// Алгоритм поиска простого числа.
			// n делим по модулю на пробный делитель.
			//
			while (d * d <= n) {
				if (n % d == 0) {
					return false;
				}
				d += 2;
			}
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	/**
	 * Разложить число на простые множители.
	 */
	private static Long[] decomposeTheNumber(Long n) {
		ArrayList<Long> temp = new ArrayList<Long>();
		// n - число для факторизации.
		// d - делитель
		// a - первый множитель
		// b - второй множитель
		Long a = n, b, d = 2L;
		// Если исходное число не простое - раскладываем на множители
		if (!isPrime(n)) {
			for (; d <= n;) {
				if (a % d == 0L) {
					a /= d;
					b = d; // Сохраняем частное от деления и записываем частное в делимое.
					temp.add(b);
				} else {
					if (d == 2L) {
						++d;
					} else {
						d += 2L;
					}
				}
			}
		}
		// Иначе возвращаем исходное.
		else {
			temp.add(n);
		}
		Long[] result = new Long[temp.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = temp.get(i);
		}
		return result;
	}

	/**
	 * Получить набор простых множителей.
	 */
	public static Long[] getPrimes(String str) {
		return decomposeTheNumber(toInteger(str));
	}

	public static void main(String[] args) {
		System.out.println("The program performs the decomposition of numbers in a set of simple multipliers");
		// Программа выполняет разложение чисел в наборе простых множителей
		// Ввод аргумента через системную консоль.
		if (args.length > 0) {
			if (isNumber(args[0])) {
				System.out.println(Arrays.toString(getPrimes(args[0])));
			} else
				System.out.println("Incorrect input!");
		}
		// Интерактивный ввод через системную консоль.
		else {
			System.out.println(Arrays.toString(getPrimes(getInput())));
		}
	}
}
