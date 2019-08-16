package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IPromoDao;
import com.cg.entity.Promo;


@Service
public class PromoServiceImpl implements PromoService {

	@Autowired
	IPromoDao promoDao;
	
	@Override
	public void addPromo(Promo promo) {
		// TODO Auto-generated method stub
		promoDao.save(promo);	
		
	}

	@Override
	public List<Promo> getAllPromos() {
		// TODO Auto-generated method stub
		return promoDao.findAll();
	}

	@Override
	public Promo getPromo(String promoCode) {
		// TODO Auto-generated method stub
		return promoDao.getPromoByPromoCode(promoCode);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void deletePromo(int id) {
		// TODO Auto-generated method stub
		if (promoDao.existsById(id)) {
	         promoDao.deleteById(id);
		} else {
			System.out.println("Id not found");
		}
	}

}
