package controller;

import java.io.File;
import java.util.Scanner;
import java.util.*;
/**
 * 
 */


/**
 * @author Esteban
 *
 */
public class HardwoodSeller {
	
	private double cherryCost = 5.95;
	private double curlyMapelCost = 6.00;
	private double mahoganyCost = 9.60;
	private double wengeCost = 22.35;
	private double whiteOakCost = 6.70;
	private double sawDustCost = 1.5;

	private double cherryTime = 2.5;
	private double curlyMapelTime = 1.5;
	private double mahoganyTime = 3;
	private double wengeTime = 5;
	private double whiteOakTime = 2.3;
	private double sawDustTime = 1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void readInputFile(String inputFilePath)
	{
		try
		{
			File f = new File(inputFilePath);
			Scanner scan = new Scanner(f);
			String []info = scan.nextLine().split(";");
			String []woodInfo = scan.nextLine().split(";");
			ArrayList<WoodItem> items = new ArrayList<WoodItem>();
			for(String s : woodInfo)
			{
				WoodItem w;
				String[] args = s.split(":");
				String name = args[0];
				if(name.equals("Cherry"))
					w = new WoodItem(name, cherryTime, cherryCost);
				else if(name.equals("Curly Mapel"))
					w = new WoodItem(name, curlyMapelTime, curlyMapelCost);
				else if(name.equals("Genuine Mahogany"))
					w = new WoodItem(name, mahoganyTime, mahoganyCost);
				else if (name.equals("Wenge"))
					w = new WoodItem(name, wengeTime, wengeCost);
				else if( name.equals("White Oak"))
					w = new WoodItem(name, whiteOakTime, whiteOakCost);
				else  
					w = new WoodItem(name, sawDustTime, sawDustCost);
				items.add(w);
			}
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public Double deliveryTime(){
		Double deliveryETA = 0.0;
		return deliveryETA;
	}
	
}
