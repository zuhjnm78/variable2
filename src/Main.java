public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 (){

        System.out.println("Задача 1");

        // Пишем код для задачи 1

       int i1 = 550;
       byte b1 = 122;
       short s1 = 1111;
       long l1 = 25000L;
       float f1 = 3.14f;
       double d1 = 5.667;


        System.out.println("Значение переменной i1 с типом int = " + i1);
        System.out.println("Значение переменной b1 с типом byte = "+ b1);
        System.out.println("Значение переменной s1 с типом short = " + s1);
        System.out.println("Значение переменной l1 с типом long = " + l1);
        System.out.println("Значение переменной f1 с типом float = " + f1);
        System.out.println("Значение переменной d1 с типом double = " + d1);
    }
    public static void task2 (){

        System.out.println("Задача 2");

        // Пишем код для задачи 2

      float f2 = 27.12f;
      long l2 = 987678965549L;
      double d2 = 2.786;
      short s2 = 569;
      short s3 = -159;
      int i2 = 27897;
      byte b2 = 67;

        System.out.println("Значение переменной f2 с типом float = " + f2);
        System.out.println("Значение переменной l2 с типом long = "+ l2);
        System.out.println("Значение переменной d2 с типом double = " + d2);
        System.out.println("Значение переменной s2 с типом short = " + s2);
        System.out.println("Значение переменной s3 с типом short = " + s3);
        System.out.println("Значение переменной i2 с типом int = " + i2);
        System.out.println("Значение переменной b2 с типом byte = "+ b2);


    }

    public static void task3 () {

        System.out.println("Задача 3");

        // Пишем код для задачи 3

        int lp = 23;
        int as = 27;
        int ea = 30;
        int pupils = lp + as + ea;
        int paper = 480;
        int paperPerPupils = paper / pupils;


        System.out.println("На каждого ученика расчитано " + paperPerPupils +" листов бумаги.");



    }

    public static void task4 (){

        System.out.println("Задача 4");

        // Пишем код для задачи 4

      int bottle = 16;
      int bottlePerMinute = bottle / 2;
      int bottlePer20Minuts = bottlePerMinute * 20;
      int bottlePerDay = bottlePerMinute * 60 * 24;
      int bottlePer3Days = bottlePerDay * 3;
      int bottlePerMonth = bottlePerDay * 30;

      System.out.println("За 20 минут машина произвела " + bottlePer20Minuts +" штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlePerDay +" штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlePer3Days +" штук бутылок.");
        System.out.println("За 20 минут машина произвела " + bottlePerMonth +" штук бутылок.");

    }

    public static void task5 (){

        System.out.println("Задача 5");

        // Пишем код для задачи 5

      int whiteColor = 2;
      int bronwColor = 4;
      int totalColor = 120;
      int totalClass = totalColor / (whiteColor +bronwColor);
      int totalWhiteColor = totalClass * whiteColor;
      int totalBrownColor = totalClass * bronwColor;

      System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteColor + " банок белой краски и "
      + totalBrownColor + " банок коричневой краски.");

    }
    public static void task6() {

        System.out.println("Задача 6");

        // Пишем код для задачи 6

       int banana = 5;
       int weightBanana = banana * 80;
       int milk = 105;
       int weightMilk = milk * 2;
       int eis = 100;
       int weightEis = eis * 2;
       int egg = 70;
       int weightEgg = egg * 4;

       int weightInGramm = weightEis + weightEgg + weightBanana + weightMilk;
       double weightInKilogramm = weightInGramm / 1000.0;

       System.out.println("Вес завтрака спортсмена в граммах = " + weightInGramm + " грамм.");
        System.out.println("Вес завтрака спортсмена в килограммах = " + weightInKilogramm + " килограмм.");




    }

    public static void task7 () {

        System.out.println("Задача 7");

        // Пишем код для задачи 7

       int totalWeight = 7000;
       int weight1 = 250;
       int weight2 = 500;
       int variant1 = totalWeight / weight1;
       int variante2 = totalWeight / weight2;
       int averege = (variante2 + variant1) / 2;
       System.out.println(variant1 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(variante2 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println(averege + " дней потребуется  в среднем, чтобы добиться результата похудения.");




    }

    public static void task8 () {

        System.out.println("Задача 8");

        // Пишем код для задачи 8

       int salaryMasha = 67760;
       int salaryDenis = 83690;
       int salaryCristina = 76230;
       int newSalaryMasha = salaryMasha + salaryMasha * 10 / 100;
       int newSalaryDenis = salaryDenis + salaryDenis * 10 / 100;
       int newSalaryCristina = salaryCristina + salaryCristina * 10 / 100;
       int differenceMasha = newSalaryMasha - salaryMasha;
       int differenceDenis = newSalaryDenis - salaryDenis;
       int differenceCristina = newSalaryCristina - salaryCristina;

       System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha +
               " рублей.");

        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis +
                " рублей.");

        System.out.println("Денис теперь получает " + newSalaryCristina + " рублей. Годовой доход вырос на " + differenceCristina +
                " рублей.");


    }

}