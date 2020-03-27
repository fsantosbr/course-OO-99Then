package entitiesExc;

//Sendo usado no Ex118
public class OrderItem {

	private Integer quantity;
	private Double price;
	
	private Product product;
	//Composição com a classe Product
	//Relação 'tem-um'. A classe OrderItem tem uma coisa da clase Product
	//Quando formos acessar o preço de um produto dentro da classe Product, usaremos assim:
	//getProduct().getPrice()

	
	//CONSTRUCTORS			
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;	
	}

	//GETTERS AND SETTERS
	public Integer getQuantity() {
		return quantity;
	}
				
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	//METODOS
	public Double subTotal() {
		return quantity * price;
	}
	
	
}
