package Task3Hashset;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> productList = new HashSet <>();
		productList.add(new Product(9, "KitKat", 34.55, 4.5, 3));
		productList.add(new Product(8, "FiveStar", 19.99, 4.9, 5));
		productList.add(new Product(7, "Munch", 30.99, 4.6, 6));
		productList.add(new Product(2, "pERK", 10.99, 4.4, 1));
		productList.add(new Product(5, "DairyMilk", 100.99, 3.9, 2));
		productList.add(new Product(6, "Fuse", 19.99, 4.1, 9));
		productList.add(new Product(3, "Bournville",200.99, 4.7, 1));
		productList.add(new Product(1, "Choco", 399.99, 4.5, 10));
		
		ProductMain p = new ProductMain();
		System.out.println("Product List");
		p.printProduct(productList);
		
	}
	
	public void printProduct(Set<Product> productList) {
		for(Product p: productList) {
			System.out.println(p);
		}
	}

}

