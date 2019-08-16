package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.entity.Promo;


@Repository
public interface IPromoDao extends JpaRepository<Promo, Integer>{
	
	Promo getPromoByPromoCode(String promoCode);

}
