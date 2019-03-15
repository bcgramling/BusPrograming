
public class StockMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * @author Michael Redmond This shows the weekly prices of two index stocks and
		 *         the number of shares owned of each stock.
		 * 
		 *         2 6 (Size of array) Shares Mon Tues Wed Thurs Fri VUG 7 146.93 147.58
		 *         147.13 143.06 142.34 VGT 4 178.63 178.81 178.03 173.25 171.74
		 * 
		 * 
		 */

		// Note I'm hard-coding this, but you should read in array
		// from the txt file.

		double[][] stocks = new double[][] { { 7, 146.93, 147.58, 147.13, 143.06, 142.34 },
				{ 4, 178.63, 178.81, 178.03, 173.25, 171.74 } };

		// Here we can loop through and see how much money was
		// gained or lost during the week.
		int shares = 0;
		double opening_price = 0;
		double closing_price = 0;
		for (int i = 0; i < stocks.length; i++) {
			// Here i is the row number
			for (int j = 0; j < stocks[i].length; j++) {
				// and j is the column number of the array
				if (j == 0) {
					shares = (int) stocks[i][j];
				}
				if (j == 1) {
					opening_price = stocks[i][j];
				}
				if (j == stocks[i].length - 1) {
					closing_price = stocks[i][j];
				}
			}
			System.out.println("Stock " + (i + 1) + " weekly change: $" + shares * (closing_price - opening_price));
			System.out.printf("Stock %d weekly change: $%.2f %n", (i + 1), shares * (closing_price - opening_price));
		}

		// We can also print out the percentage change from day to day
		double percent_change = 0.0;
		for (int i = 0; i < stocks.length; i++) {
			// Here i is the row number
			System.out.printf("Stock %d %% daily change: ", i + 1);
			for (int j = 1; j < stocks[i].length; j++) {
				// and j is the column number of the array
				if (j == 1) {
					percent_change = 0.0;
				} else {
					percent_change = (stocks[i][j] - stocks[i][j - 1]) / stocks[i][j - 1];
				}
				System.out.printf("%.2f%% ", percent_change * 100);
			}
			System.out.println();
		}
		
		//Now let's try to get the column sums:
		//Hint we need to flip our inner and outer loops. Now
		//j (column index) should be outer loop while i (row index)
		// should be inner loop.
		double col_sum;
		for (int j=0; j < stocks[0].length  ;j++) {
			col_sum = 0;
			for (int i=0; i < stocks.length ;i++) {
				col_sum += stocks[i][j];
			}
		System.out.printf("%.2f    ", col_sum);
		}
		
	}

}
