package com.sds.frame;

import java.util.ArrayList;

public interface Service<T,S> {
	public void register(T t);
	public void remove(S s);
	public void modify(T t);
	public T get(S s);
	public ArrayList<T> get();
}
