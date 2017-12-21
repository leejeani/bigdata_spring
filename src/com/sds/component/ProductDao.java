package com.sds.component;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.sds.frame.Dao;
import com.sds.frame.Product;
import com.sds.frame.User;
@Repository("productDao")
public class ProductDao implements Dao<Product, Integer> {

	@Override
	public void insert(Product t) {
		System.out.println(t+" Inserted ...");
	}

	@Override
	public void delete(Integer s) {
		System.out.println(s+" Deleted ...");
	}

	@Override
	public void update(Product t) {
		System.out.println(t+" Updated ...");
		
	}

	@Override
	public Product select(Integer s) {
		
		return new Product(s,"바지",10000);
	}

	@Override
	public ArrayList<Product> select() {
		ArrayList<Product> list = 
				new ArrayList<>();
		list.add(new Product(100,"바지",10000));
		list.add(new Product(101,"바지",20000));
		list.add(new Product(102,"바지",30000));
		list.add(new Product(103,"바지",40000));
		list.add(new Product(104,"바지",50000));
		return list;
	}

}




