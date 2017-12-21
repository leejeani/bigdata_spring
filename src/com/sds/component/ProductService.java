package com.sds.component;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sds.frame.Dao;
import com.sds.frame.Product;
import com.sds.frame.Service;
import com.sds.frame.User;

@org.springframework.stereotype.Service("productService")
public class ProductService 
implements Service<Product, Integer> {
    @Resource(name="productDao")
	Dao<Product,Integer> dao;
    
	@Override
	public void register(Product t) {
		
		dao.insert(t);
	}

	@Override
	public void remove(Integer s) {
		dao.delete(s);
	}

	@Override
	public void modify(Product t) {
		dao.update(t);
	}

	@Override
	public Product get(Integer s) {
		System.out.println("Product get....");
		return dao.select(s);
	}

	@Override
	public ArrayList<Product> get() {
		return dao.select();
	}

}
