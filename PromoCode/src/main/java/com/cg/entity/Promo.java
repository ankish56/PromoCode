package com.cg.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Promo")
public class Promo {
	
	@Id
	@Column(name="promoId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int promoId;
	/*private String promoImageUrl;*/
	private String promoCode;
	
	public int getPromoId() {
		return promoId;
	}
	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	
	@Override
	public String toString() {
		return "Promos [promoId=" + promoId + ", promoCode=" + promoCode + 
				 "]";
	}
	public Promo(int promoId, String promoCode) {
		super();
		this.promoId = promoId;
		this.promoCode = promoCode;
	}
	public Promo() {
		super();
	}

	
	
}