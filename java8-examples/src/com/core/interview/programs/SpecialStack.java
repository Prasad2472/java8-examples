package com.core.test;

import java.util.EmptyStackException;
import java.util.Stack;

public class SpecialStack {

	/**
	 * Question: Design a Data Structure SpecialStack that supports all the stack
	 * operations like push(), pop(), isEmpty(), isFull() and an additional
	 * operation getMin() which should return minimum element from the SpecialStack.
	 * All these operations of SpecialStack must be O(1). To implement SpecialStack,
	 * you should only use standard Stack data structure and no other data structure
	 * like arrays, list, . etc.
	 * 
	 * 
	 */

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minElement = new Stack<Integer>();

	public Integer push(Integer e) {
		stack.push(e);
		if (minElement.isEmpty())
			minElement.push(e);
		else {
			Integer top = minElement.peek();
			if (e <= top) {
				minElement.push(e);
			}
		}

		return e;
	}

	public Integer pop() {

		if (stack.isEmpty())
			throw new EmptyStackException();

		Integer e = stack.pop();
		Integer minVal = minElement.peek();
		if (minVal == e)
			minElement.pop();
		return e;
	}

	public Integer getMin() {

		return minElement.peek();
	}

	public static void main(String[] args) {
		 SpecialStack s = new SpecialStack();
	        s.push(20);
	        s.push(5);
	        s.push(30);
	        System.out.println(s.getMin());
	        s.pop();
	        s.pop();
	        System.out.println(s.getMin());
	        s.push(5);
	        s.push(2);
	        s.push(3);
	        s.push(2);
	        s.pop();
	        s.pop();
	        s.pop();
	        System.out.println(s.getMin());
	}

}
