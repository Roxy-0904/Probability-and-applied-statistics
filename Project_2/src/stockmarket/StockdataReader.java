package stockmarket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import inital_version_plotter_salter_smother.Smoother;

/*
 * In this class you are taking in data from the stock data csv call GME which is stock in formation for game stop
 * you then put that in to a hash map and call the constructor in Stock Data. in the main it calls read data and the 
 * test it by call on a specific data within the data that has been parsed through.
 * 
 * had help from Hope
 * 
 * @author heather krencicki
 */
public class StockdataReader 
{
	public static Map<String, StockData> readData(String csvFile) 
	{
        Map<String, StockData> stockDataMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
        {
            br.readLine(); // Skip the header line

            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] columns = line.split(",");

                String date = columns[0];
                double open = Double.parseDouble(columns[1]);
                double high = Double.parseDouble(columns[2]);
                double low = Double.parseDouble(columns[3]);
                double close = Double.parseDouble(columns[4]);
                double adjClose = Double.parseDouble(columns[5]);
                long volume = Long.parseLong(columns[6]);

                StockData stockData = new StockData(date, open, high, low, close, adjClose, volume);
                stockDataMap.put(date, stockData);
            }
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        return stockDataMap;
    }

    // Main method for testing or stand alone use
    public static void main(String[] args) 
    {
        String File = "GME.csv";
        Map<String, StockData> stockDataMap = readData(File);

        // Testing by printing data for a specific day
        System.out.println(stockDataMap.get("2022-10-12"));
        Smoother smooth = new Smoother();
		smooth.smoothData(File,100,500);
    }
}