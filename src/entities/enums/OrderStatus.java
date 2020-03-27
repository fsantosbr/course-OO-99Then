package entities.enums;

//criamos ela no subdomínio 'entities'

public enum OrderStatus {
	
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;

}

//Nota: As informações dentro podem ser qualquer uma (texto) que você queira usar. Por convenção, use cx alta pois são case sensitive.
//Nota2: Para criar: "New > Enum".