package stockmarket;

public class StockBot 
{
	private double startingBalance;

    private double currentBalance;

    private int numberOfShares;


    public StockBot(double startingBalance) {

        this.startingBalance = startingBalance;

        this.currentBalance = startingBalance;

        this.numberOfShares = 0;

    }


    public int tradeEvaluator(double rsi, double ma, double currentPrice) {

        if (rsi > 70 && ma > currentPrice) {

            return (int) (startingBalance * 0.1 / currentPrice);

        } else if (rsi < 30 && ma < currentPrice) {

            return (int) (numberOfShares * -1);

        }

        return 0;

    }


    public void run(double[] rsiArray, double[] maArray, double[] priceArray) {

        for (int i = 0; i < rsiArray.length; i++) {

            int sharesToBuyOrSell = tradeEvaluator(rsiArray[i], maArray[i], priceArray[i]);


            if (sharesToBuyOrSell > 0) {

                double amountToSpend = sharesToBuyOrSell * priceArray[i];

                if (currentBalance >= amountToSpend) {

                    currentBalance -= amountToSpend;

                    numberOfShares += sharesToBuyOrSell;

                }

            } else if (sharesToBuyOrSell < 0) {

                double amountToGet = -sharesToBuyOrSell * priceArray[i];

                if (numberOfShares >= -sharesToBuyOrSell) {

                    currentBalance += amountToGet;

                    numberOfShares += sharesToBuyOrSell;

                }

            }


            System.out.println("On " + (i + 1) + " day, Net Worth: " + currentBalance);

        }
    }
}
