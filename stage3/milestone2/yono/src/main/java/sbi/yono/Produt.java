package sbi.yono;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produt { // java object - mapping class - mysqldb
	@Id
	private Integer productId;
	private String productName;
	private Float cost;
	public Produt() {
		// TODO Auto-generated constructor stub
	}
	public Produt(Integer productId, String productName, Float cost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
	

}
