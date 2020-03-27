package applicationExc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitiesExc.Client;
import entitiesExc.Order;
import entitiesExc.OrderItem;
import entitiesExc.Product;
import entitiesExc.enums.OrderStatus;

public class Exc118 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("ENTER CLIENT DATA:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirth = sdf1.parse(sc.nextLine());
		System.out.println();
		
		System.out.println("ENTER ORDER DATA:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order: ");
		int qtdItems = sc.nextInt();
		
		Date moment = new Date(); //precisa olhar os métodos getters and setters
		
		Order order = new Order(moment, status, new Client(clientName, clientEmail, clientBirth));
		
		for(int i=1; i <= qtdItems; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
						
			order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
