import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //

        System.out.println("""

                 _____   _____             __          ___            _    \s
                /  __ \\ /  __ \\           /  |        /   |          | |   \s
                | /  \\/ | /  \\/  __   __  `| |       / /| |  ______  | |   \s
                | |     | |      \\ \\ / /   | |      / /_| | |______| | |   \s
                | \\__/\\ | \\__/\\   \\ V /   _| |_  _  \\___  |          | |____
                 \\____/  \\____/    \\_/    \\___/ (_)     |_/          \\_____/
                                                                           \s
                                                                           \s""");

        System.out.print("Supported currencies: [SAR,TL,USD,EUR]\n\n");

        System.out.print("Enter an amount: ");
        String userInput;

        do {

            //  / / / / / / / / // / / / / / / / /  / / / / / / / / / / / / / / / / / / / / / /

            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("0") ){ System.exit(0); }
            if (userInput.equalsIgnoreCase("exit") ){ System.exit(0); }
            if (userInput.equalsIgnoreCase("stop") ){ System.exit(0); }
            if (userInput.equalsIgnoreCase("quit") ){ System.exit(0); }
            if (userInput.equalsIgnoreCase("00") ){ System.exit(0); }
            String currency = userInput.substring( (userInput.length() - 3 ) );
            if ( currency.equalsIgnoreCase("uro") ) { currency = "euro"; }

            // // // / / // / / / // / / / / / // / / / / / // / / / / // / / / / / / / / /  / /

            if ( checkCurrency(currency) ) {        // if there is a currency


                userInput = userInput.substring(0, ( userInput.length() - 3 ) );
                Money moneyOneCurr = new Money(userInput , currency);
                moneyOneCurr.Print(); System.out.print(": ");

            }  else {
                Money money = new Money(userInput);
                money.Print();
                System.out.print(": ");
            }

        }

        while ( !Objects.equals(userInput, "0") || !Objects.equals(userInput, "exit")
                || !Objects.equals(userInput, "stop") || !Objects.equals(userInput, "00")
                || !Objects.equals(userInput, "quit")   );

    }


    public static boolean checkCurrency(String currency){

        if (  currency.equalsIgnoreCase("tl")  || currency.equalsIgnoreCase("sar")
        ||    currency.equalsIgnoreCase("usd") || currency.equalsIgnoreCase("try")
        ||   currency.equalsIgnoreCase("eur")  || currency.equalsIgnoreCase("euro")  )

        {return true;}

        else {return false;}
    }


}
