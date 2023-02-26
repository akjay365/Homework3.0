public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        byte bananas = 100;
        System.out.println("Бананов " + bananas + " кг!");


        float sugar = 3;
        float onePortion = sugar/4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг!");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);
        //задача2
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 = -159;
        short f1 = 27897;
        byte j1 = 67;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(j1);

        //задача3

        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short numberOfSheets = 480;
        int sheetsOfPaperForOne = numberOfSheets / (LP + AS + EA );
        System.out.println("На каждого ученика рассчитано "+ sheetsOfPaperForOne+ " листов бумаги!");

        //Задача 4

        byte bottlePerformance = 16 / 2;
        int productivityIn20Minutes = bottlePerformance * 20;
        System.out.println("За 20 минут машина произвела " + productivityIn20Minutes + " штук бутылок");
        int productivityPerDay = bottlePerformance * 1440;
        System.out.println("За сутки машина произвела " + productivityPerDay + " штук бутылок");
        int productivityIn3Days = bottlePerformance * (1440 *3);
        System.out.println("За 3 дня машина произвела " + productivityIn3Days + " штук бутылок");
        int monthlyIndicators = bottlePerformance * 43800;
        System.out.println("За месяц машина произвела " + monthlyIndicators + " штук бутылок");

        //Задача 5


        byte canOfPaint = 120;
        byte whiteJar = 2;
        byte brownJar =4;
        int numberOfClasses = canOfPaint / (whiteJar + brownJar);
        int totalWhiteCans = whiteJar * numberOfClasses;
        int totalBrownCans = brownJar * numberOfClasses;
        System.out.println("В школе, где "+ numberOfClasses +" классов, нужно "+totalWhiteCans+ " банок белой краски и " +
                totalBrownCans + " банок коричневой краски.");


        //Задача 6

        short bananas1 = 5 * 80;
        short milk = 105 * 2;
        short iceCreamSundae = 2* 100;
        short eggs = 4 * 70;
        int breakfast = bananas1 + milk + iceCreamSundae + eggs;
        float breakfastInKg = (bananas1 + milk +iceCreamSundae + eggs)/ 1000f;
        System.out.println("Вес завтрака "+ breakfast + " в граммах и "+ breakfastInKg +" в кг!");


        //Задача 7

        short kg = 7000;
        short min = 250;
        short max = 500;
        int daysMin = kg / min;
        int daysMax = kg / max;
        int onAverageDays = (daysMin + daysMax)/2;
        System.out.println(daysMin + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,\nа " +
                ""+daysMax + " - если каждый день будет худеть на 500 грамм.\n" + onAverageDays + " день в среднем " +
                "может потребоваться, чтобы добиться результата похудения.");


        // Задача 8

        int MashaBefore = 67760;
        int DenisBefore = 83690;
        int KristinaBefore = 76230;
        double MashaRaising = MashaBefore * 1.1;
        double DenisRaising = DenisBefore * 1.1;
        double KristinaRaising = KristinaBefore * 1.1;
        double MashaBeforeAfter = (MashaRaising * 12) - (MashaBefore * 12);
        System.out.println("Маша теперь получает " + MashaRaising + " рублей. Годовой доход вырос на " +
                MashaBeforeAfter + " рублей");
        double DenisBeforeAfter = (DenisRaising * 12) - (DenisBefore * 12);
        System.out.println("Денис теперь получает " + DenisRaising + " рублей. Годовой доход вырос на " +
                DenisBeforeAfter + " рублей");
        double KristinaBeforeAfter = (KristinaRaising * 12) - (KristinaBefore * 12);
        System.out.println("Кристина теперь получает " + KristinaRaising + " рублей. Годовой доход вырос на " +
                KristinaBeforeAfter + " рублей");

    }}

















