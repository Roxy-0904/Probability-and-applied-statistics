package stockmarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/*
 * with in this it takes in information from our stock csv and then calculates the relitve strangth index 
 * of the change in price in a period the will print that out in the terminal when run
 * 
 * had help from hope
 * @author heather krencicki
 */
public class StockRSICalculator 
{
	 public static double calculateRSI(List<StockData> stockData, int period) {
	        // Ensure enough data is available
	        if (stockData.size() < period) {
	            throw new IllegalArgumentException("Insufficient data for RSI calculation");
	        }

	        double averageGain = 0, averageLoss = 0;

	        // Initial average gain/loss calculation
	        for (int i = 1; i <= period; i++) {
	            double Change = stockData.get(i).getClosePrice() - stockData.get(i - 1).getClosePrice();
	            if (Change > 0) {
	                averageGain += Change;
	            } else {
	                averageLoss += Math.abs(Change);
	            }
	        }

	        averageGain /= period;
	        averageLoss /= period;

	        // Continued calculation for the remaining days
	        for (int i = period; i < stockData.size(); i++) {
	            double Change = stockData.get(i).getClosePrice() - stockData.get(i - 1).getClosePrice();
	            if (Change > 0) {
	                averageGain = ((averageGain * (period - 1)) + Change) / period;
	                averageLoss = (averageLoss * (period - 1)) / period;
	            } else {
	                averageLoss = ((averageLoss * (period - 1)) + Math.abs(Change)) / period;
	                averageGain = (averageGain * (period - 1)) / period;
	            }
	        }

	        double rs = (averageLoss == 0) ? 100 : averageGain / averageLoss;
	        return 100 - (100 / (1 + rs));
	    }

	    public static void main(String[] args) {
	        String csvFilePath = "GME.csv"; 

	        // Use CSVReader to get the stock data
	        Map<String, StockData> stockMap = StockdataReader.readData(csvFilePath);
	        List<StockData> stockData = new ArrayList<>(stockMap.values());

	        // Sort the list by date
	        Collections.sort(stockData, Comparator.comparing(StockData::getDate));

	        try {
	            int periodLength = 14; // Typical RSI period length
	            double rsi = calculateRSI(stockData, periodLength);
	            System.out.println("RSI: " + rsi);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
