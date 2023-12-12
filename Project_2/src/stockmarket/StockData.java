package stockmarket;



public class StockData 
{
	 private String date;
	 private double open;
	 private double high;
	 private double low;
	 private double close;
	 private double adjClose;
	 private long volume;
    
    
    public StockData(String date, double open, double high, double low, double close, double adjClose, long volume) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adjClose = adjClose;
        this.volume = volume;
    }

    // Getters
    public String getDate() 
    {
        return date;
    }

    public double getOpenPrice() 
    {
        return open;
    }

    public double getHighPrice() 
    {
        return high;
    }

    public double getLowPrice() 
    {
        return low;
    }

    public double getClosePrice() 
    {
        return close;
    }

    public double getAdjClosePrice() 
    {
        return adjClose;
    }

    public long getVolume() 
    {
        return volume;
    }

    // Setters
    public void setDate(String date) 
    {
        this.date = date;
    }

    public void setOpenPrice(double openPrice) {
        this.open = openPrice;
    }

    public void setHighPrice(double highPrice) {
        this.high = highPrice;
    }

    public void setLowPrice(double lowPrice) 
    {
        this.low = lowPrice;
    }

    public void setClosePrice(double closePrice) 
    {
        this.close = closePrice;
    }

    public void setAdjClosePrice(double adjClosePrice) 
    {
        this.adjClose = adjClosePrice;
    }

    public void setVolume(long volume) 
    {
        this.volume = volume;
    }

    @Override
    public String toString() 
    {
        return "StockData{" +
                "date='" + date + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", adjClose=" + adjClose +
                ", volume=" + volume +
                '}';
    }
}
