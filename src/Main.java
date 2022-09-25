public class Main {
    public static void main(String[] args) {
        //Exercise 1
        byte age = 22;
        int year = 2022;
        short birthtYear = 1999;
        long salary = 1999999;
        float experience = 2.5f;
        double height = 165.5;
        System.out.println("Значение переменной age с типом byte равно " + age);
        System.out.println("Значение переменной year с типом int равно " + year);
        System.out.println("Значение переменной birthYear с типом short равно " + birthtYear);
        System.out.println("Значение переменной salary с типом long равно " + salary);
        System.out.println("Значение переменной experience с типом float равно " + experience);
        System.out.println("Значение переменной height с типом double равно " + height);

        System.out.println();
        //Exercise 2
        //27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        double num1 = 27.12;
        long num2 = 987678965549L;
        short num3 = 2786;
        boolean example = false;
        short num4 = 569;
        short num5 = -159;
        short num6= 2;
        int num7 = 7897;
        byte num8 = 67;

        System.out.println();
        //Exercise 3
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int paper = 480;
        float total = lP + aS + eA;
        float perStudent = paper/total;
        System.out.println("На каждого ученика рассчитано " +perStudent + " листов бумаги.");

        System.out.println();
        //Exercise 4
        int bottlesPerMinute = 16/2;
        int bottles20M = bottlesPerMinute * 20;
        int bottles24H = bottlesPerMinute * 60 * 24;
        int bottles3Days = bottlesPerMinute * bottles24H * 3;
        int bottles1Months = bottles3Days * 10;
        System.out.println("За 20 минут машина произвела бутылок " + bottles20M + " штук");
        System.out.println("За сутки машина произвела бутылок " + bottles24H+ " штук");
        System.out.println("За 3 дня машина произвела бутылок " + bottles3Days + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + bottles1Months+ " штук");

        System.out.println();
        //Exercise 5
        int paintQuantity = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int numOfClasses = paintQuantity / (whitePaint + brownPaint);
        whitePaint = whitePaint * numOfClasses;
        brownPaint = brownPaint * numOfClasses;
        System.out.println("В школе, где " + numOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println();
        //Exercise 6
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int bananaQuantity = 5;
        int milkQuantity = 2;
        int iceCreamQuantity = 2;
        int eggQuantity = 4;
        int totalGrams = bananaWeight * bananaQuantity + milkWeight * milkQuantity + iceCreamWeight * iceCreamQuantity + eggWeight * eggQuantity;
        float totalKilos = totalGrams / 1000;
        System.out.println(totalGrams + " grams");
        System.out.println(totalKilos + " kg");

        System.out.println();
        //Exercise 7
        int targetInKilos = 7;
        int lowGrams = 250;
        int highGrams = 500;
        int targetInGrams = 7 * 1000;
        float daysForLow = targetInGrams / lowGrams;
        float daysForHigh = targetInGrams / highGrams;
        float average = (daysForHigh + daysForLow) / 2;
        System.out.println(daysForLow + " days for 250 grams decrease daily");
        System.out.println(daysForHigh + " days for 500 grams decrease daily");
        System.out.println(average + " days on average");

        System.out.println();
        //Exercise 8
        float  mariaSalary = 67760;
        float dennisSalary = 83690;
        float kristinaSalary = 76230;
        float mAnnual = mariaSalary * 12;
        float dAnnual = dennisSalary * 12;
        float kAnnual = kristinaSalary * 12;
        float increaseRate = 0.1f;
        mariaSalary = mariaSalary * (increaseRate + 1) ;
        dennisSalary = dennisSalary * (increaseRate + 1);
        kristinaSalary = kristinaSalary * (increaseRate + 1);
        float mAnnualAfter = mariaSalary * 12;
        float dAnnualAfter = dennisSalary * 12;
        float kAnnualAfter = kristinaSalary * 12;
        float mDifference = mAnnualAfter - mAnnual;
        float dDifference = dAnnualAfter - dAnnual;
        float kDifference = kAnnualAfter - kAnnual;
        System.out.println("Маша теперь получает " + mAnnualAfter + " рублей. Годовой доход вырос на " + mDifference + " рублей");
        System.out.println("Денис теперь получает " + dAnnualAfter + " рублей. Годовой доход вырос на " + dDifference + " рублей");
        System.out.println("Кристина теперь получает " + kAnnualAfter + " рублей. Годовой доход вырос на " + kDifference + " рублей");

    }
}