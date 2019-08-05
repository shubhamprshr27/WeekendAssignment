package weekendAssignment;

import java.util.Scanner;

class Profit {

	int noOfDozen;
	public int getNoOfDozen() {
		return noOfDozen;
	}

	public void setNoOfDozen(int noOfDozen) {
		this.noOfDozen = noOfDozen;
	}

	public int getCostPriceOfDozen() {
		return costPriceOfDozen;
	}

	public void setCostPriceOfDozen(int costPriceOfDozen) {
		this.costPriceOfDozen = costPriceOfDozen;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	int costPriceOfDozen;
	int sellingPrice;
	float profit;
		
	public void calculateProfit(){
		float itemCostPrice;
		itemCostPrice = (float)costPriceOfDozen/12 ;
		float gain = sellingPrice - itemCostPrice ;
		profit = gain/itemCostPrice*100;
	}
}

public class Main31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Profit profitCalc=new Profit();
		System.out.println("Enter the number of dozens of toys purchased");
		int noOfDozen= sc.nextInt();
		profitCalc.setNoOfDozen(noOfDozen);
		System.out.println("Enter the price per dozen");
		int costPriceOfDozen=sc.nextInt();
		profitCalc.setCostPriceOfDozen(costPriceOfDozen);
		System.out.println("Enter the selling price of 1 toy");
		int sellingPrice= sc.nextInt();
		profitCalc.setSellingPrice(sellingPrice);
		profitCalc.calculateProfit();
		System.out.printf("Sam's profit percentage is %.2f percent", profitCalc.getProfit());
		
		sc.close();
	}

}