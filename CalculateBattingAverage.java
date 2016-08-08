package com.CalculateBattingAverage;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateBattingAverage {
	
	public static void main(String[] args){
		
		Calculator jba= new Calculator(7, 10, 2, 1, 0);
		Calculator john = new Calculator(9, 6, 2, 0, 1);
		 
		if (jba.getAt_Bats() >= jba.getHits() ){
		
		double hits = jba.getHits(); 
		 double doubles= jba.getDoubles();
         double at_bats= jba.getAt_Bats();
         double triples= jba.getTriples();
         double homeRuns= jba.getHomeRuns();
         
         double batting_avg = hits / (double)at_bats;
    	 double singles = (hits - doubles - triples - homeRuns);
	     double totalBases = (singles + (doubles * 2) + (triples * 3) + (homeRuns * 4));
		 double slugPerc = (totalBases/at_bats);
	     
		 System.out.println("**Here are your batting statistics**");
			 
		 BigDecimal bd = new BigDecimal(batting_avg);
		 bd = bd.setScale(3, BigDecimal.ROUND_HALF_UP);
		 System.out.println("Batting Avg: " +  bd.doubleValue());
			
		 BigDecimal bd1 = new BigDecimal(slugPerc);
		 bd1 = bd1.setScale(3, BigDecimal.ROUND_HALF_UP);
		 System.out.println("Slugging Percentage " + bd1.doubleValue());
		}else{
			System.out.println("You made an input error");
		}
		 double new_batting_avg = john.getHits() / (double)john.getAt_Bats();
		 double new_singles = (john.getHits() - john.getDoubles() - john.getTriples() - john.getHomeRuns());
	     double new_totalBases = (new_singles + (john.getDoubles() * 2) + (john.getTriples() * 3) + (john.getHomeRuns() * 4));
		 double new_slugPerc = (new_totalBases/john.getAt_Bats());

		 System.out.println("**Here are John's batting statistics**");
		 
		 BigDecimal bdnew = new BigDecimal(new_batting_avg);
		 bdnew = bdnew.setScale(3, BigDecimal.ROUND_HALF_UP);
		 System.out.println("Batting Avg: " +  bdnew.doubleValue());
			
		 BigDecimal newbd1 = new BigDecimal(new_slugPerc);
		 newbd1 = newbd1.setScale(3, BigDecimal.ROUND_HALF_UP);
		 System.out.println("Slugging Percentage " + newbd1.doubleValue());
							
		}
	}


