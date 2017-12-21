package com.mc.model;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mc.frame.Dao;

public class UserDao implements Dao<User, String> {

	static SqlSessionFactory factory;
	SqlSession session;
	
	static{
		try{
			// Mybatis Framework Start ..
			factory = new SqlSessionFactoryBuilder().build(
				Resources.getResourceAsReader("config/mybatis.xml")
			);
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public UserDao(){
		session = factory.openSession();
	}

	
	@Override
	public void insert(User t) {
		session.insert("userdb.insert",t);
		session.commit();
	}
	

	@Override
	public void delete(String s) {
		session.delete("userdb.delete",s);
		session.commit();
	}

	@Override
	public void update(User t) {
		session.update("userdb.update",t);
		session.commit();
	}

	@Override
	public User select(String s) {
		return session.selectOne("userdb.select", s);
	}

	@Override
	public List<User> select() {
		return session.selectList("userdb.selectall");
	}

}











