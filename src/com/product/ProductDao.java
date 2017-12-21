package com.product;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.Product;
@Repository("productDao")
public class ProductDao implements Dao<Product, Integer> {

	@Override
	public void insert(Product t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product select(Integer s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> select() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Product> select(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}







