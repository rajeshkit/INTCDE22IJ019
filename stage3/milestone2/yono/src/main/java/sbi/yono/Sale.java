package sbi.yono;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sale {
	@Id
	private Integer saleId;
	private String saleName;
	public Integer getSaleId() {
		return saleId;
	}
	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}
	public String getSaleName() {
		return saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}
	
}
