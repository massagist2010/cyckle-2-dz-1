public class Main {

    public static void main(String[] args) {
        // ЦЫКЛ ЧАСТЬ 2 дз 1/1
        System.out.println("ЦЫКЛ ЧАСТЬ 2 дз 1/1");
        int total = 2459000;
        int copy = 15000;
        int first = 0;
        while (first < total) {
            first = total / (first + copy);
            total = total - total / first;
            System.out.println("месяц " + first + " сумма накоплений равна " + total + " рублей");
        }
        // 1.2
        System.out.println(1.2);
        int i = 0;
        while (i <= 9) {
            i = ++i;
            System.out.print(" " + i);
        }
        System.out.println("");
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println(' ');
        // 1.3
        System.out.println(1.3);
        float y = 12_000_000;// жители города
        float fertility = (float) 17 / 1000;// рождаемость
        float mortality = (float) 8 / 1000;// смертность
        for (i = 1; i <= 10; i++) {
            y = y + (fertility * y) - (mortality * y);
            System.out.println("год " + i + " численность населения составляет " + y);
        }
        System.out.println("H.W. 2.1");
        int depositTotal = 12000000;
        int month = 1;
        int deposit = 15_000;
        while (deposit < 12000000) {
            deposit = (int) (deposit + deposit * 0.07); // 2.2
            if ( month % 6 == 0 ) {
                System.out.println("месяц " + month + " сумма накоплений равна " + deposit + "рублей");
            }
            month++;
        }
        // 2.3
        System.out.println("hw2.3");
        int year = 1;
        int many = 15000;
        while ( year >= 9 * 12 ) {
            many = (int) (many + many * 0.07);
            if (year % 6 == 0)
             {
                System.out.println("месяц " + year + " сумма накоплений равна " + many + "рублей");
            }   many++;
    }
        // H.W. 2.4
        System.out.println("H.W. 2.4");
        int friday = 3;
        int monthDay = 31;
        while (friday<=monthDay){
            friday+=7;
            System.out.println("Сегодня пятница " + friday + " Необходимо подготовить отчет.");
        }
        // H.W. 3.1
        System.out.println("H.W. 3.1");
        int now = 2022;
        int upToYears = now - 200;
        int afterYears = now + 100;
        for (int g = upToYears; g<=afterYears; g++) {
            if (g % 79 == 0) {
                System.out.println(g);
            }
        }
        System.out.println("H.W. 3.2.");
        int onTow = 1;
        while (onTow<10){
            onTow++;
            System.out.println("2 * " + onTow + " = " + 2 * onTow);
        }
        System.out.println(" цикл 2 завершен. ");

    }
}