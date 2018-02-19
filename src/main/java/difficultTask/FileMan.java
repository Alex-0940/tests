package difficultTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileMan {

	// проверяем файл
	private static void exists(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		if (!file.exists()) {
			throw new FileNotFoundException(file.getName());
		}
	}

	public static ArrayList<String> read(String fileName) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();

		File file = new File(fileName);
		exists(fileName);
		try {
			BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			try {
				// строка для чтения файла
				String s;
				while ((s = in.readLine()) != null) {
					list.add(s);
				}
			} finally {
				// закрываем файл
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		// Возвращаем полученный текст
		return list;
	}

	public static void write(String fileName, String text) {
		File file = new File(fileName);

		try {
			// проверить файл, если файл не найден, создайте его
			if (!file.exists()) {
				file.createNewFile();
			}

			FileMan.read(fileName);
			FileWriter out = new FileWriter(file.getAbsoluteFile(), true);
			try {
				// запись текста в файл
				out.append(text + "\n");
			} finally {
				// закрываем файл
				out.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}