/** This is created to be independant practice for working with dataTypes variables. Data sources are found at the below the class **/
public class Main {

    public static void main(String[] args) {

      // TODO: Complete the following variable declarations.

	      int oldYear = 1950;
        int nowYear = 2016;

        int averageFamilyIncome1950 = 3300;
        int medianHomePrice1950 = 7354;
        int tuitionYale1950 = 600;
        int roomAndBoardYale1950 = 456;
        int otherExpensesYale1950 = 376;

        int averageFamilyIncome2015 = 51017;
        int medianHomePrice2015 = 188900;
        int medianHomePriceManhattan2013 = 855000;
        int tuitionYale2015 = 45800;
        int roomAndBoardYale2015 = 14000;
        int otherExpensesYale2015 = 5552;

        String intro = "To understand how purchasing power has changed in the past 65 years, it is useful to compare the family income to the cost of goods and services, such as housing and education.";


      // TODO: Find and fix a mistake in the following.

        if (intro.equals("A long time ago in a galaxy far, far away")) {
            System.out.println("May the force be with you.");
        }
        else {
            System.out.println(intro);
        }

      // TODO: Use a print statment to add a newline or <br>.
      System.out.println("\n");
      // TODO: Complete the following basic mathematical calculations.

        // Divide median home price by annual income and print each result to the command line.
        // Make 3 variables: homeRatio1950, homeRatio2015, homeRatioNYC2015
        float homeRatio1950 = (float)medianHomePrice1950 / (float)averageFamilyIncome1950;
        float homeRatio2015 = (float) medianHomePrice2015 / (float) averageFamilyIncome2015;
        float homeRatioNYC2015 = (float) medianHomePriceManhattan2013 / (float) averageFamilyIncome2015;
        System.out.println("Home Ratio 1950: " +  homeRatio1950);
        System.out.println("Home Ratio 2015: " + homeRatio1950);
        System.out.println("Home Ratio NYC 2015: " + homeRatioNYC2015);

        // Find the total cost of university education for 1950 and for 2015 and print result to the command line.
        int totalYaleCost1950 = tuitionYale1950 + roomAndBoardYale1950 + otherExpensesYale1950;
        int totalYaleCost2015 = tuitionYale2015 + roomAndBoardYale2015 + otherExpensesYale2015;
        System.out.println("Total Yale Cost 1950: " + totalYaleCost1950);
        System.out.println("Total Yale Cost 2015: " + totalYaleCost2015);

        // Then divide university cost by annual income for both: educationRatio1950, & educationRation2015. Print the results to the command line.

        float educationRatio1950 = (float) totalYaleCost1950 / (float) averageFamilyIncome1950;
        float educationRatio2015 = (float) totalYaleCost2015 / (float) averageFamilyIncome2015;
        System.out.println("Education ratio 1950: " + educationRatio1950);
        System.out.println("Education ratio 2015: " + educationRatio2015);

      // TODO: Convert the following String into a number.

        String averageDebt1950 = "2000";
        int avgDebt1950 = Integer.valueOf(averageDebt1950);

      // TODO: Complete the following variable declarations, find the typo, and replace the /*something*/'s in the String with the proper variables.

        int creditCardDebt2010 = 15_355;
        int totalDebt2010 = 129_579; // _ is same as , makes it easier to read
        String debt = String.format("Debt is an unwelcome guest at the table in many American households. Back in the late 1940s and early 1950s, the average American consumer had less than $%d in total personal debt. Today the average U.S. household with debt carries $%d in credit card debt and $%d in total debt.", avgDebt1950, creditCardDebt2010, totalDebt2010);
        System.out.println(debt);

      // TODO: Using one line of code, determine if the following string contains the word "table". Print the result to the command line.
      System.out.println((debt.contains("table")));

      // TODO: How has the ratio of debt to income changed in the past 60 years?

      double debtIncomeRatio1950 = (double) averageFamilyIncome1950 / (double) avgDebt1950;
      double debtIncomeRatio2015 = (double) averageFamilyIncome2015 / (double) totalDebt2010;
      //double debtIncomeRatioChange = debtIncomeRatio1950 - debtIncomeRatio2015;

      // EXTRA: Round the answer to two decimal places.
      // 3.141596 -> 314.1596 -> 314 -> 3.14
      double roundOff = Math.round(debtIncomeRatio1950 * 100.0) / 100.0;
      double roundOff2 = Math.round(debtIncomeRatio2015 * 100.0) / 100.0;
      System.out.println(Math.round((roundOff2 - roundOff) * 100.0) / 100.0);
    }

}

/** SOURCES:
 *  http://www.mybudget360.com/cost-of-living-2014-inflation-1950-vs-2014-data-housing-cars-college/
 *  http://oir.yale.edu/1701-1976-yale-book-numbers
 *  http://www.yale.edu/tuba/finaid/finaid-information/1516/1516EA_FYYE.pdf
 *  http://www.forbes.com/sites/erincarlyle/2014/01/30/manhattan-real-estate-ten-year-review-neighborhoods-where-prices-have-gone-up-the-most/
 *  https://www.mainstreet.com/article/americans-personal-debt-skyrockets
 *  http://www.nerdwallet.com/blog/credit-card-data/average-credit-card-debt-household/
 *  **/
