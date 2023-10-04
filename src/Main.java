import Some.Body;

import java.util.Scanner;

//v2.1.1.1


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        int b = scanner.nextInt(); // ctrl + / -- быстрое комментирование
//        System.out.println(a + b);




//        String s = scanner.nextLine(); // сканиирует строку
//        System.out.println(s); // / -- деление, подстраивается под тип числа



        byte b = 10 >> 1; // побитовое сдвижение (згать не надо)

        try {
            float a = scanner.nextFloat();
            System.out.println("-"+a);
        } catch (Exception e){ //Exeption -- ловит ошибку   e -- имя ошибки
            System.out.println("Ацтань");
            System.out.println(e);
        }finally { //выполняется всегда
            System.out.println("\n Я выполнюсь всегда!");
        }








    }
}