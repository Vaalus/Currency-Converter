import java.util.*;

public class currencyConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 1;
        String TL = "TL";
        String ARS = "ARS";
        String USD = "USD";
        String SAR = "SAR";
        String EURO = "EURO";
        String RUB = "RUB";

// TL ARS USD SAR EURO RUB
        do {

            System.out.print("\n");

            counter = 7563;

            System.out.println("/////////////////////////////////////////////////////////////////\n//////            Currency Converter v1.2 ULTRA            //////\n/////////////////////////////////////////////////////////////////\n");

            System.out.println("1. Turkish Liras (TL) to Saudi Riyals (SAR)");
            System.out.println("2. Argentine Pesos (ARS) to Saudi Riyals (SAR)");
            System.out.println("3. US Dollars (USD) to Saudi Riyals (SAR)");
            System.out.println("4. Euros (EUR) to Saudi Riyals (SAR)");
            System.out.println("5. Russian Ruble (RUB) to Saudi Riyals (SAR)");
            System.out.println("6. Custom conversion");
            System.out.print("0. Exit the app\n\n: ");

            int firstChoice = input.nextInt();

            switch (firstChoice) {

                case 1: {

                    while (counter != 9 && counter != 0) {

                        System.out.print("\nEnter the amount in Turkish Liras (TL): ");
                        String userInput = input.next();
                        double amount = properFormat(userInput);
                        convertCurrency c = new convertCurrency(TL, SAR, amount);
                        System.out.printf("\n%.2f TL = %.2f SAR", amount, c.result);

                        System.out.print("\n\n1. Enter another amount\n9. Go back\n0. Exit\n: ");
                        counter = input.nextInt();

                        if (counter == 0) {

                            System.out.print("Thank you.");
                            try {
                                Thread.sleep(350);
                                System.exit(0);
                                break;
                            } catch (InterruptedException ex) {
                                System.exit(0);
                            }

                        }

                    }

                    break;
                } // case 1

                case 2: {

                    while (counter != 9 && counter != 0) {

                        System.out.print("\nEnter the amount in Argentine Pesos (ARS): ");
                        String userInput = input.next();
                        double amount = properFormat(userInput);
                        convertCurrency c = new convertCurrency(ARS, SAR, amount);
                        System.out.printf("\n%.2f ARS = %.2f SAR", amount, c.result);

                        System.out.print("\n\n1. Enter another amount\n9. Go back\n0. Exit\n: ");
                        counter = input.nextInt();

                        if (counter == 0) {

                            System.out.print("Thank you.");
                            try {
                                Thread.sleep(350);
                                System.exit(0);
                                break;
                            } catch (InterruptedException ex) {
                                System.exit(0);
                            }

                        }

                    }

                    break;
                }
                case 3: {

                    while (counter != 9 && counter != 0) {

                        System.out.print("\nEnter the amount in US Dollars (USD): ");
                        String userInput = input.next();
                        double amount = properFormat(userInput);
                        convertCurrency c = new convertCurrency(USD, SAR, amount);
                        System.out.printf("\n$%.2f = %.2f SAR", amount, c.result);

                        System.out.print("\n\n1. Enter another amount\n9. Go back\n0. Exit\n: ");
                        counter = input.nextInt();

                        if (counter == 0) {

                            System.out.print("Thank you.");
                            try {
                                Thread.sleep(350);
                                System.exit(0);
                                break;
                            } catch (InterruptedException ex) {
                                System.exit(0);
                            }

                        }

                    }

                    break;
                }
                case 4: {

                    while (counter != 9 && counter != 0) {

                        System.out.print("\nEnter the amount in Euros (EUR): ");
                        String userInput = input.next();
                        double amount = properFormat(userInput);
                        convertCurrency c = new convertCurrency(EURO, SAR, amount);
                        System.out.printf("\n%.2f EURO = %.2f SAR", amount, c.result);

                        System.out.print("\n\n1. Enter another amount\n9. Go back\n0. Exit\n: ");
                        counter = input.nextInt();

                        if (counter == 0) {

                            System.out.print("Thank you.");
                            try {
                                Thread.sleep(350);
                                System.exit(0);
                                break;
                            } catch (InterruptedException ex) {
                                System.exit(0);
                            }

                        }

                    }

                    break;
                }
                case 5: {

                    while (counter != 9 && counter != 0) {

                        System.out.print("\nEnter the amount in Russian Ruble (RUB): ");
                        String userInput = input.next();
                        double amount = properFormat(userInput);
                        convertCurrency c = new convertCurrency(RUB, SAR, amount);
                        System.out.printf("\n%.2f RUB = %.2f SAR", amount, c.result);

                        System.out.print("\n\n1. Enter another amount\n9. Go back\n0. Exit\n: ");

                        counter = input.nextInt();

                        if (counter == 0) {

                            System.out.print("Thank you.");
                            try {
                                Thread.sleep(350);
                                System.exit(0);
                                break;
                            } catch (InterruptedException ex) {
                                System.exit(0);
                            }

                        }

                    }

                    break;
                }
                case 6: {

                    while (counter != 9 && counter != 0) {

                        String initial, finall;
                        double amount;

                        do {
                            System.out.print("\nFormat: Amount - its currency - desired currency \nFor example: 15 ARS to TL\n\n: ");

                            String userInput = input.next();
                            amount = properFormat(userInput);

                            initial = input.next();
                            String ignoral = input.next();
                            if (!ignoral.equalsIgnoreCase("to")) {
                                finall = ignoral;
                            } else {
                                finall = input.next();
                            }

                            if (initial.equalsIgnoreCase("EUR")) {
                                initial = "EURO";
                            }
                            if (finall.equalsIgnoreCase("EUR")) {
                                finall = "EURO";
                            }
                            if (initial.equalsIgnoreCase("TRY")) {
                                initial = "TL";
                            }
                            if (finall.equalsIgnoreCase("TRY")) {
                                finall = "TL";
                            }

                        } while (!initial.equalsIgnoreCase("ARS") && !initial.equalsIgnoreCase("TL") && !initial.equalsIgnoreCase("SAR")
                                && !initial.equalsIgnoreCase("USD") && !initial.equalsIgnoreCase("RUB") && !initial.equalsIgnoreCase("EURO")
                                || (!finall.equalsIgnoreCase("ARS") && !finall.equalsIgnoreCase("TL")
                                && !finall.equalsIgnoreCase("SAR") && !finall.equalsIgnoreCase("USD") && !finall.equalsIgnoreCase("RUB")
                                && !finall.equalsIgnoreCase("EURO")));

                        convertCurrency c = new convertCurrency(initial, finall, amount);
                        System.out.printf("\n%.2f %s = %.2f %s", amount, initial, c.result, finall);
                        System.out.print("\n\n1. Enter another amount\n9. Go back\n0. Exit\n: ");

                        counter = input.nextInt();

                        if (counter == 0) {

                            System.out.print("Thank you.");
                            try {
                                Thread.sleep(350);
                                System.exit(0);
                                break;
                            } catch (InterruptedException ex) {
                                System.exit(0);
                            }

                        }

                    }

                    break;
                }
                case 0: { // InterruptedException

                    System.out.print("Thank you.");
                    try {
                        Thread.sleep(350);
                        System.exit(0);
                        break;
                    } catch (InterruptedException ex) {
                        System.exit(0);
                    }
                }

            }

        } while (counter == 9);

    }

    //  end of main method  \\
    public static double properFormat(String userInput) {
        int point = 0;
        userInput = userInput.replaceAll("[ ]", "");
        userInput = userInput.replaceAll("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*\"'/|]", "");
        if (userInput.length() > 3) {
            if (userInput.charAt(userInput.length() - 2) == '.') {
                userInput = userInput.replaceAll("[,]", "");
            }
            if (userInput.charAt(userInput.length() - 3) == ',' || userInput.charAt(userInput.length() - 2) == ',') {
                userInput = userInput.replaceAll("[.]", "");
                userInput = userInput.replaceAll("[,]", ".");
            }
        }
        userInput = userInput.replaceAll("[,]", "");
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '.') {
                point++;
            }
        }
        if (point > 1) {
            for (int i = point; i > 1; i--) {
                userInput = userInput.replaceFirst("[.]", "");
            }
        }
        double polished = Double.parseDouble(userInput);

        return polished;
    }

}

class convertCurrency {

    double result;

    public convertCurrency(String initialCurrency, String finalCurrency, double amount) {

        // table =   0. Turkish Liras TL  / 1. Argentine Peso ARS / 2. US Dollars USD $ / 3. Saudi Riyal SAR / 4. Euros € / 5. Russian Ruble ₽
        // array [0][i] = TL  ₺  -->   everything except for itself.   // array [1][i] = ARS $   --> everything except for itself  // array [2][i] = USD $
// array [3][i] = Saudi Riyal SAR  // array [3][i] = Euros €   // array [5][i] = Russian Ruble ₽
        double conversionRate;

        int i = 0;
        int j = 0;

        if (initialCurrency.equalsIgnoreCase("TL")) {
            i = 0;
        }
        if (initialCurrency.equals("ARS")) {
            i = 1;
        }
        if (initialCurrency.equalsIgnoreCase("USD")) {
            i = 2;
        }
        if (initialCurrency.equalsIgnoreCase("SAR")) {
            i = 3;
        }
        if (initialCurrency.equalsIgnoreCase("EURO")) {
            i = 4;
        }
        if (initialCurrency.equalsIgnoreCase("RUB")) {
            i = 5;
        }
        //
        if (finalCurrency.equalsIgnoreCase("TL")) {
            j = 0;
        }
        if (finalCurrency.equalsIgnoreCase("ARS")) {
            j = 1;
        }
        if (finalCurrency.equalsIgnoreCase("USD")) {
            j = 2;
        }
        if (finalCurrency.equalsIgnoreCase("SAR")) {
            j = 3;
        }
        if (finalCurrency.equalsIgnoreCase("EURO")) {
            j = 4;
        }
        if (finalCurrency.equalsIgnoreCase("RUB")) {
            j = 5;
        }
        //
        double[][] conversionRatesTable = {
                {1, 10.78320, 0.05243, 0.19695, 0.04872, 4.05176}, // TL to other currencies
                {0.09274, 1, 0.00486, 0.01826, 0.00452, 0.37575}, // ARS to other currencies
                {19.07320, 205.67000, 1, 3.75655, 0.92930, 77.28000}, // USD to other currencies
                {5.07732, 54.74970, 0.26620, 1, 0.24738, 20.57210}, // SAR to other currencies
                {20.52470, 221.32100, 1.07610, 4.04242, 1, 83.16100}, // EURO to other currencies
                {0.24681, 2.66136, 0.01294, 0.04861, 0.01202, 1} // RUB to other currencies
        };

        conversionRate = conversionRatesTable[i][j];

        result = conversionRate * amount;

    }

}