package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShopService {

	@Autowired
	private ShopRepo shopRepo;
	
	public void getShopName(int shopId) {
		
		Shop shop = shopRepo.findById(shopId).get();
		System.out.println(shop.getShopName());
//		System.out.println(shop.getProductCategoryCollection());
		
	}
	
	public void deleteShop(int shopId) {
		shopRepo.deleteById(shopId);
	}
	
}