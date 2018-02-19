package difficultTask;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Task {

	private static String ack = "ACK"; // функция Аккермана
	private static String f = "F"; // Факториал
	private static String fib = "FIB"; // фунция Фибоначчи
	// static FileMan fileMan = new FileMan();

	public void fMFunc(String fileName) throws FileNotFoundException {

		String outFileName = fileName + ".res.txt";// создать файл dir.
		Task taskClassReaderFile = new Task();

		ArrayList<String> list = FileMan.read(fileName);// читать входящий файл

		for (int i = 0; i < list.size(); i++) {
			String mes = String.valueOf(list.get(i));// назначил строку из массива строк
			String[] arrMes = mes.split(" ");// разобрать n-ю строку в массиве
			taskClassReaderFile.mathOp(arrMes, i + 1, outFileName);// вызов функции и отправка номера строки
		}
		System.out.println("Results are copied to a file: \n" + outFileName);// результаты сохранены в файл
	}

	// вызывать нужную функцию
	public void mathOp(String[] arr, int i, String outFileName) {
		if (arr[0].equals(ack)) {
			int arg1 = Integer.parseInt(arr[1]);
			int arg2 = Integer.parseInt(arr[2]);

			System.out.println(Ack.ackFunc(arg1, arg2));

			String res = i + " " + String.valueOf(Ack.ackFunc(arg1, arg2));
			FileMan.write(outFileName, res);

		} else if (arr[0].equals(f)) {
			int arg = Integer.parseInt(arr[1]);

			System.out.println(Fact.factFunc(arg));
			String res = i + " " + String.valueOf(Fact.factFunc(arg));
			FileMan.write(outFileName, res);

		} else if (arr[0].equals(fib)) {
			int arg = Integer.parseInt(arr[1]);

			System.out.println(Fib.fibFunc(arg));
			String res = i + " " + String.valueOf(Fib.fibFunc(arg));
			FileMan.write(outFileName, res);

		} else {
			System.out.println("error function");
		}
	}

	public static void main(String[] args) {
		Task fileManger = new Task();
		try {
			fileManger.fMFunc("/Tests/src/difficultTask/file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
