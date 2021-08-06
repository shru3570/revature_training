package StreamMinCost;

import java.util.ArrayList;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Bus> busList = new ArrayList<>();
		
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		double minPrice= busList.stream().filter(e -> e.getProviderName().equals("Xyz Travels")).map(e ->e.getCost()).reduce(Double.MAX_VALUE,(min,price)->Math.min(min,price));
		
		System.out.println( "MinPrice : "+minPrice);
	}

}
