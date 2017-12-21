package frame;

public interface Dao {
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public void select(Object obj);
	public void select();
}
