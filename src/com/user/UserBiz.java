package com.user;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.product.ProductDao;
import com.vo.Product;
import com.vo.User;
@Service("userBiz")
public class UserBiz implements Biz<User, String> {
	@Resource(name="userDao")
	Dao<User, String> userdao;
	@Resource(name="productDao")
	ProductDao productDao;
	
	@Override
	public void register(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(String s) {
		User user = null;
		user = userdao.select(s);
		ArrayList<Product> list = 
				productDao.select(s);
		user.setList(list);
		return user;
	}

	@Override
	public ArrayList<User> get() {
		ArrayList<User> ulist = 
		userdao.select();
		for(User u : ulist) {
			String id = u.getId();
			u.setList(productDao.select(id));
		}
		return ulist;
	}

}







