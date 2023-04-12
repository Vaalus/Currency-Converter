import java.util.*; public class Money {

    private String userAmount; private String iCurrency; private String fCurrency;
    private double numericalAmount; private int userCurrency,convertedCurrency; private double convertedAmount;
    private int i,j;

    private final String[] currencySymbols = { "SAR","TL","USD","EUR" };

    private final double[][] conversionRates = // using userCurrency and convertedCurrency
            {
                    {1,5.13416,0.2663,0.24424},  // [0] SAR |
                    {0.19413,1,0.05183,0.04754}, // [1] TL  |
                    {3.74524,19.28,1,0.91718},   // [2] USD |
                    {4.08285,21.018,1.09014,1}   // [3] EUR |
            };


    // / / / / /  Constructors / / / / / / //


    Money (String userAmount ){
        this.userAmount = userAmount; this.userCurrency = 1; this.fCurrency = "all"; i = 1; // TL
        this.numericalAmount = Polish(this.userAmount);
        this.convertedAmount = this.numericalAmount*conversionRates[i][j];



    }

    Money (String userAmount, String iCurrency){
        this.userAmount = userAmount; this.iCurrency = iCurrency; this.fCurrency = "all";
        this.numericalAmount = Polish(this.userAmount);
        this.convertedAmount = this.numericalAmount*conversionRates[i][j];

        //
        if ( this.iCurrency.equalsIgnoreCase("SAR") ) { this.userCurrency = 0;}
        if ( this.iCurrency.equalsIgnoreCase("TL")
                || this.iCurrency.equalsIgnoreCase("TRY") ) { this.userCurrency = 1;}
        if ( this.iCurrency.equalsIgnoreCase("USD") ) { this.userCurrency = 2;}
        if ( this.iCurrency.equalsIgnoreCase("EUR")
                || this.iCurrency.equalsIgnoreCase("EURO") ) { this.userCurrency = 3;}
        //

        i = this.userCurrency;

    }

    Money (String userAmount, String iCurrency, String fCurrency){
        this.userAmount = userAmount; this.iCurrency = iCurrency; this.fCurrency = fCurrency;
        this.numericalAmount = Polish(this.userAmount);

        //
        if ( this.iCurrency.equalsIgnoreCase("SAR") ) { this.userCurrency = 0;}
        if ( this.iCurrency.equalsIgnoreCase("TL")
                || this.iCurrency.equalsIgnoreCase("TRY") ) { this.userCurrency = 1;}
        if ( this.iCurrency.equalsIgnoreCase("USD") ) { this.userCurrency = 2;}
        if ( this.iCurrency.equalsIgnoreCase("EUR")
                || this.iCurrency.equalsIgnoreCase("EURO") ) { this.userCurrency = 3;}
        //
        if ( this.fCurrency.equalsIgnoreCase("SAR") ) { this.convertedCurrency = 0;}
        if ( this.fCurrency.equalsIgnoreCase("TL")
                || this.fCurrency.equalsIgnoreCase("TRY") ) { this.convertedCurrency = 1;}
        if ( this.fCurrency.equalsIgnoreCase("USD") ) { this.convertedCurrency = 2;}
        if ( this.fCurrency.equalsIgnoreCase("EUR")
                || this.fCurrency.equalsIgnoreCase("EURO") ) { this.convertedCurrency = 3;}

        i = this.userCurrency; j = this.convertedCurrency;
        this.convertedAmount = this.numericalAmount*conversionRates[i][j];

    }

    Money (String userAmount, String iCurrency,String to, String fCurrency){
        this.userAmount = userAmount; this.iCurrency = iCurrency; this.fCurrency = fCurrency;
        this.numericalAmount = Polish(this.userAmount);

        //
        if ( this.iCurrency.equalsIgnoreCase("SAR") ) { this.userCurrency = 0;}
        if ( this.iCurrency.equalsIgnoreCase("TL")
                || this.iCurrency.equalsIgnoreCase("TRY") ) { this.userCurrency = 1;}
        if ( this.iCurrency.equalsIgnoreCase("USD") ) { this.userCurrency = 2;}
        if ( this.iCurrency.equalsIgnoreCase("EUR")
                || this.iCurrency.equalsIgnoreCase("EURO") ) { this.userCurrency = 3;}
        //
        if ( this.fCurrency.equalsIgnoreCase("SAR") ) { this.convertedCurrency = 0;}
        if ( this.fCurrency.equalsIgnoreCase("TL")
                || this.fCurrency.equalsIgnoreCase("TRY") ) { this.convertedCurrency = 1;}
        if ( this.fCurrency.equalsIgnoreCase("USD") ) { this.convertedCurrency = 2;}
        if ( this.fCurrency.equalsIgnoreCase("EUR")
                || this.fCurrency.equalsIgnoreCase("EURO") ) { this.convertedCurrency = 3;}

        i = this.userCurrency; j = this.convertedCurrency;
        this.convertedAmount = this.numericalAmount*conversionRates[i][j];

    }

    /*        Methods         */

    public void Print(){
        if ( this.fCurrency.equalsIgnoreCase("all") )
        {
            System.out.printf("\n%,.2f %s equals: \n\n" , this.numericalAmount , currencySymbols[i] );

            for ( int j = 0; j < 4; j++ ){

                int i = this.userCurrency;
                this.convertedAmount = this.numericalAmount*conversionRates[i][j];

                if( j != i ) {
                    System.out.printf("%,-10.2f %-6s\n",this.convertedAmount,currencySymbols[j]);
                }

            }

            System.out.print("\n");

        }

        else{

            System.out.printf("%,.2f %s = " , this.numericalAmount , currencySymbols[i] );
            System.out.printf("%,.2f %s\n",this.convertedAmount,currencySymbols[j]);
            System.out.print("\n");
        }

    }

    public double Polish(String userInput) {
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

        return Double.parseDouble(userInput);
    }

}
