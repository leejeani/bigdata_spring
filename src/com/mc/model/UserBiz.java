package com.mc.model;

import java.util.List;

import com.mc.frame.Biz;
import com.mc.frame.Dao;

public class UserBiz implements Biz<User, String> {

	Dao<User, String> dao;
	
	public UserBiz() {
		dao = new UserDao();
	}
	
	@Override
	public void register(User t) {
		dao.insert(t);
	}

	@Override
	public void remove(String s) {
		dao.delete(s);

	}

	@Override
	public void modify(User t) {
		dao.update(t);
	}

	@Override
	public User get(String s) {
		return dao.select(s);
	}

	@Override
	public List<User> get() {
		return dao.select();
	}

}





