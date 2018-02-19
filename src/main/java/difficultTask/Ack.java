package difficultTask;

public class Ack {
	public static int ackFunc(int n, int m) {

		if (n == 0) {
			return m + 1;
		} else if (m == 0) {
			return ackFunc(n - 1, 1);
		} else
			return ackFunc(n - 1, ackFunc(n, m - 1));
	}
}
