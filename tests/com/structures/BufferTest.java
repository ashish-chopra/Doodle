package com.structures;

import com.Test;

public class BufferTest implements Test{

	public void run() {
		
		Buffer buffer = new Buffer();
		buffer.insert('a');
		buffer.insert('b');
		buffer.insert('c');
		buffer.insert('d');
		buffer.insert('e');
		buffer.insert('f');
		buffer.insert('g');
		buffer.insert('h');
		buffer.insert('i');
		buffer.insert('j');
		buffer.insert('k');
		buffer.insert('l');
		buffer.insert('m');
		
		assert (buffer.size() == 13);
		buffer.left(3);
		assert (buffer.size() == 13);
		
		try {
			buffer.left(11);
		} catch (IllegalArgumentException e) {
			assert true;
		} catch (Exception e) {
			assert false;
		}
		
		buffer.right(1);
		assert (buffer.size() == 13);
		
		buffer.delete();
		buffer.delete();
		assert (buffer.delete() == 'i');
		assert (buffer.delete() == 'h');
		
		buffer.right(2);
		assert (buffer.delete() == 'm');
		
		try {
			buffer.right(2);
		} catch (IllegalArgumentException e) {
			assert true;
		} catch (Exception e) {
			assert false;
		}
	}
}
