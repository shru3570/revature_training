package BillPrinting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class productMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<product> productList = new ArrayList<>();
		productList.add(new product(1, "KitKat", 34.55,  3));
		productList.add(new product(2, "FiveStar", 19.99,  5));
		productList.add(new product(3, "Munch", 30.99,  6));
		productList.add(new product(4, "pERK", 10.99, 1));
		productList.add(new product(5, "DairyMilk", 100.99, 2));
		productList.add(new product(6, "Fuse", 19.99,  9));
		productList.add(new product(7, "Bournville",200.99,1));
		productList.add(new product(8, "Choco", 399.99,  10));
		
		Collections.sort(productList, (product p1, product p2) -> {
			String s1 = p1.getName();
			String s2 = p2.getName();
			return s1.compareTo(s2);
		});
		productMain pm = new productMain();
		pm.printMainProducts(productList);
		

	}
	public void printMainProducts(List<product> productList) {
		System.out.println("---------------------------------------");
		System.out.println("#  Name       Price   Qty.  Total");
		System.out.println("---------------------------------------");
		int  i = 1;
		for(product p: productList) {
			product.printProducts(i++, p);
		}
		System.out.println("---------------------------------------");
		Double totalBill = productList.stream().map(e -> e.getCost()*e.getQuantity()).reduce(0.0, (sum, bill) -> sum + bill);
		
		System.out.println("Total                    " + totalBill);
		System.out.println("5% GST                   " + totalBill*0.05);
		System.out.println("---------------------------------------");
		System.out.println("Final Bill               " + (totalBill*1.05));
		System.out.println("---------------------------------------");
	}

}
