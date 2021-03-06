package BillPrinting;

import java.util.Objects;


public class product {
	private int id;
	private String name;
	private double cost;

	private int quantity;
	
	public product() {
		// TODO Auto-generated constructor stub
	}

	public product(int id, String name, double cost,  int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	
	

	public int getQuantity() {
		return quantity;
	}
	public static void printProducts(int i, product product) {
		System.out.printf("%d  %-10s %-8.2f %-4d %.2f\n",i, product.name, product.cost, product.quantity,  product.cost*product.quantity);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [id = " + id + ", name = " + name + ", cost = " + cost +  ", quantity = " +quantity + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}



