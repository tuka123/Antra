package Day_06;

import java.util.Scanner;

class MyProduct extends Exception{
	public MyProduct(String msg) {
	super(msg);
	}
}


public class Product {
int wei;
	public int Weight(int weight)throws MyProduct {
		if(weight>100){
			throw new MyProduct("Product weight is high");
		}
		return weight;
	}
	public static void main(String[] args) {
		
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the weight...");
			System.out.println("Weight is :"+product.Weight(sc.nextInt()));
		    
		} catch (MyProduct e) {
			System.out.println(e.getMessage());
			
		}catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		sc.close();
		
	
		
		
	}
}
