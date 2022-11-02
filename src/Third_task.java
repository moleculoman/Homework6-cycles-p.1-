public class Third_task {
    public static void main(String[] args) {
        //Задача 1
        //Накопления при откладывании денег в "банку".
        System.out.println("Задача 1. Первый цикл");
        int amount = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total= total+amount;
            System.out.println("Месяц "+i +", сумма накоплений равна " + total +" рублей.");
        }
        //Задача 2
        //Накопления при откладывании денег под проценты.
        System.out.println("Задача 2. Второй цикл с процентами");
        int amount2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2/100;
            total2= total2+amount2;
            System.out.println("Месяц "+ i +", сумма накоплений равна " + total2 +" рублей.");
        }
    }
}
