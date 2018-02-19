package simpleTask4;

/**
 * Программа возвращает список разменов на 3,5 копеек и 3, 5, 7 копеек для
 * примера берем число 36
 */

public class Task4 {
	public static void main(String[] args) {
		int[] denomination = { 3, 5, 7 };
		int sum = 36;
		int i = 0, j, k = denomination.length;
		while (k != 0 && denomination[--k] > sum)
			;
		j = k;
		int tempSum, count;
		do {
			if ((tempSum = sum % denomination[j]) >= denomination[0] || tempSum == 0) {
				count = sum / denomination[j];
				sum = tempSum;
			} else {
				count = sum / denomination[j] - 1;
				sum = tempSum + denomination[j];
			}
			System.out.println("Denomination: " + denomination[j] + "; count: " + count);
			while (j != 0 && denomination[--j] > sum)
				;
		} while (i < k && sum > 0);
	}
}
