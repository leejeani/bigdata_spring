package com.sds.component;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.sds.frame.Dao;
import com.sds.frame.User;
@Repository("userDao")
public class UserDao implements Dao<User, String> {

	@Override
	public void insert(User t) {
		System.out.println(t+" Inserted ...");
	}

	@Override
	public void delete(String s) {
		System.out.println(s+" Deleted ...");
	}

	@Override
	public void update(User t) {
		System.out.println(t+" Updated ...");
		
	}

	@Override
	public User select(String s) {
		
		return new User(s,"pwd88","�̸���");
	}

	@Override
	public ArrayList<User> select() {
		ArrayList<User> list = 
				new ArrayList<>();
		list.add(new User("id01","pwd01","�̸���"));
		list.add(new User("id02","pwd02","�̸���"));
		list.add(new User("id03","pwd03","�̸���"));
		list.add(new User("id04","pwd04","�̸���"));
		list.add(new User("id05","pwd05","�̸���"));
		return list;
	}

}




