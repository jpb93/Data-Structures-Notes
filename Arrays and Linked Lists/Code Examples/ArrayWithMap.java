// Silly example making more array-like structures this time with a hash map
// Better to just use a hash map honestly :)

import java.util.HashMap;

public class ArrayWithMap<T> {
	private int length;
	private HashMap<Integer, T> data = new HashMap<Integer, T>();
	
	public ArrayWithMap() {
		this.length = 0;
		this.data =  new HashMap<Integer, T>();
	}
	
	public T get(int index) {
		return data.get(index);
	}
	
	public void push(T item) {
		data.put(length, item);
		length++;
	}
	
	public T pop() {
		T lastItem = data.get(length - 1);
		data.remove(length - 1);
		length--;
		return lastItem;
	}
	
	public void delete(int index) {
		this.shiftItems(index);
	}
	
	private void shiftItems(int index) {
		for (int i = index; i < length - 1; i++) {
			data.put(i, data.get(i + 1));
		}
		
		data.remove(length - 1);
		length--;
	}
	
	public int size() {
		return length;
	}
}









