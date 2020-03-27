package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Sec13_112Enumeracoes {

	public static void main(String[] args) {
		
		//System.out.println(OrderStatus.PENDING_PAYMENT);
		//Ainda podemos chamar a Enum diretamente e já chamando as constantes.
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		//Na variável 2 estamos passando um string (texto) que exista na Enum. Mas o texto da mesma forma precisa existir na Enum.
		
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

}
