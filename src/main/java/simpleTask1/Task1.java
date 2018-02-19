package simpleTask1;

import java.util.Scanner;

/**
 * Программа возвращает 2-й по величине элемент набора чисел.
 *
 * Решение: Необходимо ввести 10 целых чисел через консоль или посредством
 * аргументов на исполняемый jar файл. Если в наборе имеются нечисловые символы
 * то набор не обрабатывается.
 */
public class Task1 {
	private static String[] getInput() {
		Scanner scan = new Scanner(System.in);
		String[] bank;
		Integer d = 10;
		bank = new String[d];

		do {
			System.out.printf("Enter a set of 10 integers: \n");
			// Введите набор из 10 чисел
			int i = 0;
			while (i < bank.length) {
				bank[i] = scan.next();
				++i;
			}

			if (!isOfNumbers(bank)) {
				System.out.println("The set of numbers is not correct. Re-enter");
			}
			// Набор чисел не корректен. Повторите ввод
			else
				break;

		} while (true);

		scan.close();

		return bank;
	}

	/**
	 * Проверка строки на число.
	 */
	private static boolean isNumber(String str) {
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
	 * Являются ли элементы набора натуральными числами.
	 */
	private static boolean isOfNumbers(String[] src) {
		boolean ok = true;
		int count = 0;
		for (int i = 0; i < src.length; ++i) {
			// Если не числовой тип, то бросаем сообщение
			if (!isNumber(src[i])) {
				System.out.println("The set contains a NON-numeric value:  " + src[i]);
				// Набор содержит НЕ чиловое значение
				++count;
			}
		}
		if (count > 0)
			ok = false;
		return ok;
	}

	/**
	 * Равнозначность элементов
	 */
	private static boolean equalsNumbers(Integer[] src) {
		boolean ok = true;
		for (int i = 1; i < src.length; ++i) {
			if (!src[i - 1].equals(src[i])) {
				ok = false;
				break;
			}
		}
		return ok;
	}

	/**
	 * Конвертация строкового типа в числовой
	 */
	private static Integer[] toIntegers(String[] src) {
		Integer dist[] = new Integer[src.length];
		for (int i = 0; i < src.length; ++i) {
			dist[i] = Integer.parseInt(src[i]);
		}
		return dist;
	}

	/**
	 * Получить 2-ое по величине число из набора чисел.
	 */
	public static Integer secondBigNumber(Integer[] str) {
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MIN_VALUE;
		// Если все числа равны
		if (equalsNumbers(str)) {
			System.out.println("All numbers are equal");
			max = str[0];
		}
		// иначе получаем 2-ое по величине число
		else {
			for (Integer a : str) {
				if (min < a) {
					max = min;
					min = a;
				} else if ((max < a && !min.equals(a))) {
					max = a;
				}
			}
		}
		System.out.printf("Output the second largest number:  " + max);
		// Вывод второго по величине числа
		return max;
	}

	public static void main(String[] args) {
		System.out.println("The program returns the 2nd largest element of a set of numbers.");
		// Программа возвращает 2-й по величине элемент набора чисел
		// Ввод через системную консоль.
		if (args.length > 0) {
			if (isOfNumbers(args))
				secondBigNumber(toIntegers(args));
		} else {
			secondBigNumber(toIntegers(getInput()));
		}
	}
}
