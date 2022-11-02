public class Second_task {
    public static void main(String[] args) {
        //Задача 1
        //Вывод в консоль всех високосных годов, начиная с 1904 года до 2096.
        System.out.println("Задача 1. Первый цикл");
        for (int i = 1904; i <= 2096; i= i+4) {
            System.out.println(i + " год является високосным.");
        }
        //Задача 2
        //Напишите программу, которая выводит в консоль последовательность цифр
        System.out.println("Задача 2. Второй цикл");
        for (int i = 7; i <= 98; i= i+7) {
            System.out.println(i);
        }
        //Задача 3
        //Напишите программу, которая выводит в консоль последовательность цифр
        System.out.println("Задача 3. Третий цикл");
        for (int i = 1; i <= 512; i= i*2) {
            System.out.println(i);
        }
    }
}
