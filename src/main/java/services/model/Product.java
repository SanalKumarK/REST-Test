package services.model;

import java.util.Date;

public class Product {
	private String name ;
	private String Id;
	private String type;
	private Long price;
	private Long manufacturedBy;
	private Date manufacturedDate;
	private Date expiryDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getManufacturedBy() {
		return manufacturedBy;
	}
	public void setManufacturedBy(Long manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}
	public Date getManufacturedDate() {
		return manufacturedDate;
	}
	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
