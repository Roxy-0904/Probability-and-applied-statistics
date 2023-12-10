package inital_version_plotter_salter_smother;



public class Tester_for_inital_version 
{
	public static void main(String[] args)
	{
		
			Plotter graph = new Plotter();
			graph.plotterOfgraph(0,100,50);
			Salter salt = new Salter();
			salt.readunsaltedvalues("Function_points.csv",5,10);
			
		
	}

}
