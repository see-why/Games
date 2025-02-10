package test;

public class Array<T> {
	private T[] array;
	private int position;

	@SuppressWarnings("unchecked")
	public Array(int size) {
		array = (T[])new Object[size];
	}
	
	public void add(T t) {
		if (position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		array[position++] = t;
	}
	
	public T get(int index) {
		return array[index];
	}

}
