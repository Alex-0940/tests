package difficultTask;

public class Fib {
	public static long fibFunc(int inI) {
		int f1 = 1;
		int f2 = 1;
		int fSumm = 0;
		int i = 2;
		while (i < inI) {
			fSumm = f1 + f2;
			f1 = f2;
			f2 = fSumm;
			i++;
		}
		return fSumm;
	}
}
