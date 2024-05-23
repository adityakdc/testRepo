package linkedlistassignment;

import java.util.*;

public class CustomerDetails {

	static LinkedList<CustomerManagement> customers = new LinkedList<>();

	static void addNewCustomer(Scanner sc) {
		System.out.println("Enter Id");
		int cust_id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter Product");
		String product = sc.nextLine();
		System.out.println("Enter Price");
		int price = Integer.parseInt(sc.nextLine());
		CustomerManagement currentCustomer = new CustomerManagement(cust_id, name, price, product);
		customers.add(currentCustomer);
	}

	static void removeCustomer(int id) {
		for(CustomerManagement customer: customers)
		{
			if(customer.cust_id == id) {
			}
		}
	}

	static void printCustomer() {
		for (int i = 0; i < customers.size(); i++) {
			System.out.println("Id\t" + customers.get(i).cust_id);
			System.out.println("Name\t" + customers.get(i).name);
			System.out.println("Product\t" + customers.get(i).product);
			System.out.println("Price\t" + customers.get(i).price);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Customers");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			addNewCustomer(sc);
		}
		printCustomer();

	}

}
