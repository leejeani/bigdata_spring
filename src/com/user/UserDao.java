package com.user;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.User;
@Repository("userDao")
public class UserDao implements Dao<User, String> {

	@Override
	public void insert(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User select(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
