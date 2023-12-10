package third_version_plotter_salter_smother;

import java.util.ArrayList;

public class Tester_for_third_version 
{
	public static void main(String[] args)
	{
		
			Plotter_vs3 graph = new Plotter_vs3();
			graph.plotterOfgraph(0,100,50);
			Salter_vs3 salt = new Salter_vs3();
			ArrayList<String[]> dataPoints = salt.readunsaltedvalues("Function_points.csv");
			salt.salterOfgraph(dataPoints,0);
		
		
	}

}
