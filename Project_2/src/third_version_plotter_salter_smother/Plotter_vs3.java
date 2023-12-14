package third_version_plotter_salter_smother;


import java.io.BufferedWriter;
import java.io.FileWriter;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;

/*Plotter
 * In this program the main point of it is to create a data set of the type xydataset then takes it so that it can write it to an
 * excel file and then the method create line chart creates a line graph while it runs and prints out that plot is complete.
 * 
 * used as reference https://github.com/ilindaa/Project-1/blob/main/Project1/src/GraphProgram/GraphProgram.java
 * 
 * @author Heather Krencicki
 */
public class Plotter_vs3 extends ApplicationFrame
{
	
	private static final long serialVersionUID = 1L;
	private XYSeries plotter = new XYSeries("Plotter");
	//Change the number held for every run
	private int lowlimit = 2;
	private int upperlimit = 100;
	
	public void run() 
	{
		System.out.println("Plot is compleate");
		
		pack();
		setVisible(true);
	}
	public Plotter_vs3(String title) 
	{
		super(title);
		createLinechart("Plotter Graph 2",createPlotter());
	}
	public void createLinechart(String title, XYDataset dataset)
	{
		JFreeChart XYLineChart = ChartFactory.createXYLineChart(title,"x","y", dataset, PlotOrientation.VERTICAL,false,false,false);
		ChartPanel chartpan = new ChartPanel(XYLineChart);
		chartpan.setPreferredSize(new java.awt.Dimension(560,367));
		setContentPane(chartpan);
	}
	
	private XYDataset createPlotter()
	{
		for(int i = lowlimit; i <= upperlimit; i++)
		{		
			int function = (int) (2*Math.pow(i, 2))+(5*i)-10;
			
			plotter.add(i,function);
			
			writeTofile(i,function);
		}
		final XYSeriesCollection dataset = new XYSeriesCollection();
		dataset.addSeries(plotter);
		return dataset;
	}
	
	private void writeTofile(int dim, int function)
	{
		
		try (FileWriter  Creater= new FileWriter("Function_points_vs3_run2.csv", true))
		{
			if(dim == lowlimit) 
			{
				Creater.write("x" + "," + "y\n");
				
			}
			
			String s2 = (dim + "," + function + "\n" );
			Creater.write(s2);
			Creater.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public XYSeries getPlotterSet() {
		return plotter;
	}
	public int getlowlimit() {
		return lowlimit;
	}
	
	public int getupperlimit() {
		return upperlimit;
	}
	
}
