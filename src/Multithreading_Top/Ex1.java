package Multithreading_Top;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Privet");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("poka");
        /*
        Многопоточность - это принцип построения программы ,
        при котором нексолько блоков кода могут выполняться одновременно .

         1...1000 разбиаваем на под задачи

         1) 1 -250
         2) 251 - 500
         3) 501 - 750
         4) 751 - 1000

         Context switch - для одноядерных процесоров
         */
    }
}
