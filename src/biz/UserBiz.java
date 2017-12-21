package biz;

import frame.Biz;
import frame.Dao;

public class UserBiz implements Biz {
	Dao dao,dao2;
	
	public UserBiz() {
	}
	
	public UserBiz(String a) {
		System.out.println(a);
	}
	public void setMysql(Dao dao) {
		this.dao2 = dao;
	}
	public void setOracle(Dao dao) {
		this.dao = dao;
	}
	@Override
	public void register(Object obj) {
		dao.insert(obj);
		dao2.insert(obj);
	}

	@Override
	public void remove(Object obj) {
		dao.delete(obj);
	}

	@Override
	public void modify(Object obj) {
		dao.update(obj);
	}

	@Override
	public void get(Object obj) {
		dao.select(obj);
	}

	@Override
	public void get() {
		dao.select();

	}

}
