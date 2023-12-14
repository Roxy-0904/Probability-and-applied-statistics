package third_version_plotter_salter_smother;



public class Tester_for_third_version 
{
	public static void main(String[] args)
	{
		
		//Plotter_vs3 graph = new Plotter_vs3("Plotter_vs3");
		//graph.run();
		//graph.plotterOfgraph(0,50);
		//graph.plotterOfgraph(2,100);
		//Salter_vs3 salt = new Salter_vs3("Salter_vs3");
		//salt.run();
		//salt.saltedvalues("Function_points.csv",5,10);
		//salt.saltedvalues("Function_points.csv",2500, 7500);
		Smoother_vs3 smooth = new Smoother_vs3("Smoother_vs3");
		smooth.run();
		//smooth.smoothData( "Function_points_salted.csv",5, 5);
		//smooth.smoothData( "Function_points_salted.csv",6000,6000);
		
		
	}

}
