package dao;

import frame.Dao;

public class ProductMySQLDao implements Dao {

	@Override
	public void insert(Object obj) {
		System.out.println(obj+" MySQL Inserted");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj+" MySQL Deleted");

	}

	@Override
	public void update(Object obj) {
		System.out.println(obj+" MySQL Updated");

	}

	@Override
	public void select(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
