
public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	//Construct a stack with the default capacity 16 
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}

	//Construct a stack with the specified maximum capacity 
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	//Push a new integer to the top 
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	//Return and remove the top element
	public int pop() {
		return elements[--size];
	}

	//Return the top element 
	public int peek() {
		return elements[size - 1];
	}

	//Test whether stack is empty
	public boolean empty() {
		return size == 0;
	}

	//Return the number of elements 
	public int getSize() {
		return size;
	}

}
