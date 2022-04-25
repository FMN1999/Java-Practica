package Ejercicio6a;

public class Product {
	private Integer id;
	private String name;
	private String description;
	private Double price;
	private Integer stock;
	private Boolean shippingIncluded;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Boolean getShippingIncluded() {
		return shippingIncluded;
	}
	public void setShippingIncluded(Boolean shippingIncluded) {
		this.shippingIncluded = shippingIncluded;
	}

	@Override
	public String toString() {
		return "\nProducto: [id: "+ id + ", name:"+ name+ ", description:"+ description+", price:"+
	price + ", stock:"+ stock +", shipping included:"+ shippingIncluded + "];";
	}
}
