Windows 7 Pro 64-bit
Java: JDK 1.8.0_144; JRE 1.8.0_144
Тестирование проекта: JUnit 4.12
Сборка проекта: Apache Maven 3.5.2

Tестирование Test-Driven-Development
Модульное тестирование Unit testing
Сборка исходиков: команда mvn package, 
тестировалась на Apache Maven 3.5.2

1 - Программа возвращает 2-ой по величине элемент набора чисел.
	запуск командой: mvn exec:java -Dexec.mainClass="simpleTask1.Task1"
	тест присутствует
2 - Программа выполняет разложение числа на набор простых множителей.
    запуск командой: mvn exec:java -Dexec.mainClass="simpleTask2.Task2"
	тест присутствует
3 - Программа выполняет проверку строки на то, что она является полиндромом.
    запуск командой: mvn exec:java -Dexec.mainClass="simpleTask3.Task3"
	тест присутствует
4 - Программа возвращает список разменов на 3,5 копеек и 3, 5, 7 копеек.
    запуск командой: mvn exec:java -Dexec.mainClass="simpleTask4.Task4"	
5 - Программа выполняет поиск подстроки в строке.
    запуск командой: mvn exec:java -Dexec.mainClass="simpleTask5.Task5"
	тест присутствует

2 - Программа выполняет run-length-encoding кодирование строки (aaabccdd -> 3a1b2c2d)
    запуск командой: mvn exec:java -Dexec.mainClass="middleTask2.Task2"
	тест присутствует
3 - Программа выполняет run-length-decoding декодирование строки (3a1b2c2d -> aaabccdd)
    запуск командой: mvn exec:java -Dexec.mainClass="middleTask3.Task3"
	тест присутствует

1 - Разработайте command-line утилиту, принимающую в качестве
    аргумента имя файла и обрабатывающую указанный файл
    запуск командой: mvn exec:java -Dexec.mainClass="difficultTask.Task"
    
