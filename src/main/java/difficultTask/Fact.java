package difficultTask;

public class Fact {
	static long[] table = new long[21];// максимальное количество long типа 20
	static {
		table[0] = 1;
	}
	static int last = 0;// номер последнего вычисленного факториала.

	public static long factFunc(int inI) throws IllegalArgumentException {
		// ловим исключения
		if (inI >= table.length)
			throw new IllegalArgumentException("The overflow variable");
		if (inI < 0)
			throw new IllegalArgumentException("Factorial cannot be a negative number");
		// вычисляем факториал
		while (last < inI) {
			table[last + 1] = table[last] * (last + 1);
			last++;
		}
		return table[inI];
	}
}
