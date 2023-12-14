package inital_version_plotter_salter_smother;


/*
 * This class is used as a place to call all the functions in plotter,salter, and smoother so we can run multilple test case for them.
 * 
 * @author Heather Krencicki
 */
public class Tester_for_inital_version 
{
	public static void main(String[] args)
	{
			// uncomment the other lines to test those cases.
			Plotter graph = new Plotter();
			//graph.plotterOfgraph(0,50);
			graph.plotterOfgraph(2,100);
			Salter salt = new Salter();
			//salt.saltedvalues("Function_points.csv",5,10);
			salt.saltedvalues("Function_points.csv",2500, 7500);
			Smoother smooth = new Smoother();
			//smooth.smoothData( "Function_points_salted.csv",5, 5);
			smooth.smoothData( "Function_points_salted.csv",6000,6000);

		
	}

}
