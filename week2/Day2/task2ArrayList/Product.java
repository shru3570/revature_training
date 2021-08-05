package task2ArrayList;

public class Product {
	
	private int id;
	private String name;
	private double cost;
	private double rating;
	private int quantity;
	
	
	
	public Product() {
		super();
	}



	public Product(int id, String name, double cost, double rating, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.quantity = quantity;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [id = " + id + ", name = " + name + ", cost = " + cost + ", rating = " + rating + ", quantity = " +quantity + "]";
		
	}
	
    

}
