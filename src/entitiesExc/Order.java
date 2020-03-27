package entitiesExc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesExc.enums.OrderStatus;

//Sendo usado no Ex118
public class Order {

	private static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
	//Aqui estamos dizendo como a data deve ser capturada e depois exibida. Mas precisa usar a classe na hora de coletar e exibir também
	
	private Date moment;
	
	private OrderStatus status;
	
	private Client client;
	//associação "Tem-um" com a classe Client
	private List<OrderItem> items = new ArrayList<>();
	//associaçao "todo-parte" ou "tem-vários" com a classe OrderItem
	//Como tem muitos muitos, criamos uma lista e não adicionamos ela no construtor.
	//E nem criamos metodos setters para listas. Usamos motodos list.add() e list.remove()
	
	
	//CONSTRUCTORS
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	//GETTERS AND SETTERS
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	
	//METODOS
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	

	public Double total() {
		Double finalValue = 0D;
		for(OrderItem total : items) {
			finalValue += total.subTotal();
		}
		return finalValue;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order Moment: " + sdf2.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		
		sb.append("Client: " + client.getName() + " (" + sdf3.format(client.getBirthDate()));
		sb.append(") - " + client.getEmail() + "\n");
		
		sb.append("Order Itens:\n");
				
		for(OrderItem c : items) {
			sb.append(c.getProduct().getName() + ", $" + String.format("%.2f", c.getProduct().getPrice()) + ", ");
			sb.append("Quantity: " + c.getQuantity() + ", Subtotal: $" + String.format("%.2f", c.subTotal()) + "\n");
		}
		sb.append("Total Price: $" + String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
	
}
