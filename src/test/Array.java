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
	
	public int size() {
		return position;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getName()).append('@').append(Integer.toHexString(hashCode()));
		sb.append("\n");
		for (T t: array) {
			sb.append(t.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public void addAll(Array<? extends T> arr) {
		for (int i=0; i<arr.size(); i++) {
			add(arr.get(i));
		}
	}

}
