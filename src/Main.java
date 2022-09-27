public class Main {
    public static void main(String[] args) {
        // ЦЫКЛ ЧАСТЬ 2 дз 1/1
        System.out.println("ЦЫКЛ ЧАСТЬ 2 дз 1/1");
        int total = 2459000;
        int copy = 15000;
        int first = 0;
        while (first<total) {
        first = total / (first+copy) ;

        total = total-total/first;

            System.out.println("месяц " + first  + " сумма накоплений равна " + total  + " рублей" );
        }


    }
}