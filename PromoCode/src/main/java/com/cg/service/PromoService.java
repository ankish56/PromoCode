package com.cg.service;

import java.util.List;

import com.cg.entity.Promo;

public interface PromoService {
	public void addPromo(Promo promo);
	public void deletePromo(int id);

	public List<Promo> getAllPromos();

	public Promo getPromo(String promoCode);

}
