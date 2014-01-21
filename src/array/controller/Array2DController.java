package array.controller;

import java.util.Objects;

import array.model.Tshirts;



public class Array2DController 
{

	int[][] myInts = new int [5][3];
	String[][] myStrings = new String[4][4];
	Tshirts[][] myShirts = new Tshirts[6][4];
	
	
	
	public void start() 
	{
		fillInts();
		fillShirts();
		fillStrings();
		
		changeInts();
		changeShirts();
	}
	
	
	private void fillInts()
	{
		for(int row = 0; row < myInts.length; row++)
		{
			for(int col = 0; col < myInts[0].length; col++)
			{
				myInts[row][col] = row + 4 * 3 + col;
				
			}
		}
	}
	
	private void changeInts()
	{
		for(int row = 0; row < myInts.length; row++)
		{
			for(int col = 0; col < myInts[0].length; col++)
			{
					myInts[row][col] = 42;
			}
		}
	}
	
	private void fillShirts()
	{
		String color = "Blue";
		for(int row = 0; row < myShirts.length; row++)
		{
			for(int col = 0; col < myShirts[0].length; col++)
			{
				
				myShirts[row][col] = new Tshirts(color );
			}
		}
	}
	
	private void changeShirts()
	{
		String color = "Blue";
		for(int row = 0; row < myShirts.length; row++)
		{
			for(int col = 0; col < myShirts[0].length; col++)
			{
				color = "Blue";
				if (row == 3)
				{
					color = "Red";
				}
				myShirts[row][col] = new Tshirts(color);
			}
		}
	}
	
	private void fillStrings()
	{
		myStrings[0][0] = "Amumu";
		myStrings[0][1] = "Blitzcrank";
		myStrings[0][2] = "Cho'Gath";
		myStrings[0][3] = "Dr. Mundo";
		myStrings[1][0] = "Draven";
		myStrings[1][1] = "Fiddlesticks";
		myStrings[1][2] = "Gangplank";
		myStrings[1][3] = "Heimerdinger";
		myStrings[2][0] = "Jinx";
		myStrings[2][1] = "Kha'Zix";
		myStrings[2][2] = "Kog'Maw";
		myStrings[2][3] = "Lee Sin";
		myStrings[3][0] = "Malzahar";
		myStrings[3][1] = "Lulu";
		myStrings[3][2] = "Master Yi";
		myStrings[3][3] = "Thresh";
		
		
	}
	
}
