package login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallShop {
    static List<String> productList = new ArrayList<>();
    static double toplamOdeme;


    public SmallShop() {
     productList.add("Tomatoes - Product Code 1 - Price: 20");
     productList.add("Pepper - Product Code 2 - Price: 25");
     productList.add("Potatoes - Product Code 3 - Price: 9");
     productList.add("Apple - Product Code 4 - Price: 15");
     productList.add("Banana - Product Code 5 - Price: 30");
        shoMenu();
        selectionOfCustomer();

   }


    public void selectionOfCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(" Enter Product Code : ");
        int kod = scanner.nextInt();
        System.out.print(" How Many kg : ");
        int kilo = scanner.nextInt();

        System.out.println(kilo + " kg " + productList.get(kod - 1).split(" ")[0] + " => " + Integer.parseInt(productList.get(kod - 1).split(" ")[productList.get(kod - 1).split(" ").length - 1]) * kilo);
        toplamOdeme += Integer.parseInt(productList.get(kod - 1).split(" ")[productList.get(kod - 1).split(" ").length - 1]) * kilo;
        System.out.println("TotalCost = " + toplamOdeme);

        System.out.println("For continue shopping press D, for payment press any keys");

        if (scanner.next().equalsIgnoreCase("d")) {
            selectionOfCustomer();
        } else {
            System.out.println("Total Cost = " + toplamOdeme);
            System.out.println("Thanks To Choice Us");
        }
    }
    public void shoMenu(){
        System.out.println();
        String a="   =========     Welcome To My Small Shop    ==========";
        slowPrint(a,25);
        System.out.println();
        System.out.println();
        System.out.println(" Tomatoes - Product Code 1 - Price: 20 \n Pepper - Product Code 2 - Price: 25 \n Potatoes - Product Code 3 - Price: 9 \n Apple - Product Code 4 - Price: 15" +
                " \n Banana - Product Code 5 - Price: 30");

    }
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


