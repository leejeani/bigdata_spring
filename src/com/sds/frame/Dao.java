package com.sds.frame;

import java.util.ArrayList;

public interface Dao<T,S> {
	public void insert(T t);
	public void delete(S s);
	public void update(T t);
	public T select(S s);
	public ArrayList<T> select();
}
