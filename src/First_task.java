public class First_task {
    public static void main(String[] args) {
        //Задача 1
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        System.out.println("Задача 1. Первый цикл");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задача 2
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        System.out.println("Задача 2. Второй цикл");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        //Задача 3
        //Выведите в консоль все четные числа от 0 до 17.
        System.out.println("Задача 3. Третий цикл");
        for (int i = 0; i<=17; i=i+2){
            System.out.println(i);
        }
        //Задача 4
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        System.out.println("Задача 4. Четвертый цикл");
        for (int i = 10; i>=-10; i--){
            System.out.println(i);
        }

    }
}