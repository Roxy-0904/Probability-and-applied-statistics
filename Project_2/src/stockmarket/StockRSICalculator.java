package stockmarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StockRSICalculator 
{
	 public static double calculateRSI(List<StockData> stockDataList, int periodLength) {
	        // Ensure enough data is available
	        if (stockDataList.size() < periodLength) {
	            throw new IllegalArgumentException("Insufficient data for RSI calculation");
	        }

	        double averageGain = 0, averageLoss = 0;

	        // Initial average gain/loss calculation
	        for (int i = 1; i <= periodLength; i++) {
	            double priceChange = stockDataList.get(i).getClosePrice() - stockDataList.get(i - 1).getClosePrice();
	            if (priceChange > 0) {
	                averageGain += priceChange;
	            } else {
	                averageLoss += Math.abs(priceChange);
	            }
	        }

	        averageGain /= periodLength;
	        averageLoss /= periodLength;

	        // Continued calculation for the remaining days
	        for (int i = periodLength; i < stockDataList.size(); i++) {
	            double priceChange = stockDataList.get(i).getClosePrice() - stockDataList.get(i - 1).getClosePrice();
	            if (priceChange > 0) {
	                averageGain = ((averageGain * (periodLength - 1)) + priceChange) / periodLength;
	                averageLoss = (averageLoss * (periodLength - 1)) / periodLength;
	            } else {
	                averageLoss = ((averageLoss * (periodLength - 1)) + Math.abs(priceChange)) / periodLength;
	                averageGain = (averageGain * (periodLength - 1)) / periodLength;
	            }
	        }

	        double rs = (averageLoss == 0) ? 100 : averageGain / averageLoss;
	        return 100 - (100 / (1 + rs));
	    }

	    public static void main(String[] args) {
	        String csvFilePath = "GME.csv"; 

	        // Use CSVReader to get the stock data
	        Map<String, StockData> stockDataMap = StockdataReader.readData(csvFilePath);
	        List<StockData> stockDataList = new ArrayList<>(stockDataMap.values());

	        // Sort the list by date
	        Collections.sort(stockDataList, Comparator.comparing(StockData::getDate));

	        try {
	            int periodLength = 14; // Typical RSI period length
	            double rsi = calculateRSI(stockDataList, periodLength);
	            System.out.println("RSI: " + rsi);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
