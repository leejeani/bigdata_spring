package com.sds.component;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sds.frame.Dao;
import com.sds.frame.Service;
import com.sds.frame.User;

@org.springframework.stereotype.Service("userService")
public class UserService implements Service<User, String> {
	@Autowired
	@Qualifier("userDao")
	Dao<User,String> dao;
    
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
	public ArrayList<User> get() {
		return dao.select();
	}

}
