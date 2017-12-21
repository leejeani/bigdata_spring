package com.frame;

import java.util.ArrayList;

public interface Biz<T,S> {
	public void register(T t);
	public void remove(S s);
	public void modify(T t);
	public T get(S s);
	public ArrayList<T> get();
}
