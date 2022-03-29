package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1

	byte a = 7;
    short b = 28;
    int c = 320;
    long d = 115700L;
    float e = 9.18f;
    double f = 98.125;
    boolean g = 25 > a;
    System.out.println(g);
    char tilde = 126;
    System.out.println(tilde);
        //Задание 2

     double firstBoxer = 78.2;
     double secondBoxer = 82.7;
     double totalWeight = firstBoxer + secondBoxer;
     System.out.println("Total weight both boxers " + totalWeight + " kg" );
     double weightDifference = secondBoxer - firstBoxer;
     System.out.println("Weight difference between boxers " + weightDifference + " kg");
         //Задание 3

      int bananas = 4;
      int bananasWeight = 80;
      int totalBananasWeight = bananas * bananasWeight;
      System.out.println("Total bananas weight " + totalBananasWeight + "g ");
      int milk = 200;
      int milkQuantity = 2;
      int totalQuantity = milk = milkQuantity;
      int milkWeight = 105;
      int totalMilkWeight = milk * milkWeight;
      System.out.println("Total milk weight " + totalMilkWeight + "g ");
      int iceCream = 2;
      int iceCreamWeight = 100;
      int totalIceCreamWeight = iceCream * iceCreamWeight;
      System.out.println("Total ice cream weight " + totalIceCreamWeight + "g ");
      int eggs = 4;
      int eggsWeight = 80;
      int totalEggsWeight = eggs * eggsWeight;
      System.out.println("Total eggs weight " + totalEggsWeight + "g ");
      int totalProductsWeight = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
      System.out.println("Total weight of all products " + totalProductsWeight + "g ");
      int grPerKg = 1000;
      float totalWeightInKg = totalProductsWeight / (float) grPerKg;
      System.out.println("Total weight all products " + totalWeightInKg + "kg ");
          //Задание 4

       int needToLoseWeight = 7;
       int kgPerG = 1000;
       int weightInG = needToLoseWeight * kgPerG;
       System.out.println("Weight value became " + weightInG + "g ");
       int firstPurpose = 250;
       int secondPurpose = 500;
       int daysQuantity1 = weightInG / firstPurpose;
       System.out.println("Lose weight by first purpose " + daysQuantity1 + " days");
       int daysQuantity2 = weightInG / secondPurpose;
       System.out.println("Lose weight by second purpose " + daysQuantity2 + " days");
       int quantityValue = 2;
       int averageQuantityDays = (daysQuantity1 + daysQuantity2) / quantityValue;
       System.out.println("Average number of days " + averageQuantityDays);
           //Задание 5

        int paymentMasha = 67760;
        int paymentDenis = 83690;
        int paymentKristina = 76230;
        int percent = 10;
        int paymentUpMasha = (paymentMasha * percent / 100) + paymentMasha;
        System.out.println("Payment for Masha with percents " + paymentUpMasha + " rub");
        int paymentUpDenis = (paymentDenis * percent / 100) + paymentDenis;
        System.out.println("Payment for Denis with percents " + paymentUpDenis + " rub");
        int paymentUpKristina = (paymentKristina * percent / 100) + paymentKristina;
        System.out.println("Payment for Kristina with percents " + paymentUpKristina + " rub");
        int year = 12;
        int yearPaymentMasha = paymentMasha * year;
        System.out.println("Year payment for Masha " + yearPaymentMasha + " rub");
        int yearPaymentDenis = paymentDenis * year;
        System.out.println("Year payment for Denis " + yearPaymentDenis + " rub");
        int yearPaymentKristina = paymentKristina * year;
        System.out.println("Year payment for Kristina " + yearPaymentKristina + " rub");
        int yearPaymentUpMasha = (yearPaymentMasha * percent / 100) + yearPaymentMasha;
        System.out.println("Year payment for Masha with percents " + yearPaymentUpMasha + " rub");
        int yearPaymentUpDenis = (yearPaymentDenis * percent / 100) + yearPaymentDenis;
        System.out.println("Year payment for Denis with percents " + yearPaymentUpDenis + " rub");
        int yearPaymentUpKristina = (yearPaymentKristina * percent / 100) + yearPaymentKristina;
        System.out.println("Year payment for Kristina with percents " + yearPaymentUpKristina + " rub");
        int differenceYearPaymentMasha = yearPaymentUpMasha - yearPaymentMasha;
        System.out.println("Difference between year payment for Masha " + differenceYearPaymentMasha + " rub");
        int differenceYearPaymentDenis = yearPaymentUpDenis - yearPaymentDenis;
        System.out.println("Difference between year payment for Denis " + differenceYearPaymentDenis + "rub");
        int differenceYearPaymentKristina = yearPaymentUpKristina - yearPaymentKristina;
        System.out.println("Difference between year payment for Kristina " + differenceYearPaymentKristina + " rub");









    }
}
