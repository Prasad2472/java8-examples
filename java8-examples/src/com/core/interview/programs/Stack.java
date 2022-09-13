package com.core.test;

import java.util.ArrayDeque;

public class Stack<E> {

	/**
	 * Implement Stack using Queues
	 */

	private ArrayDeque<E> queue = new ArrayDeque<E>();

	public E push(E e) {
		queue.addFirst(e);
		return e;
	}

	public E pop() {
		return queue.removeFirst();
	}

	public E peek() {
		return queue.getFirst();
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		System.out.println("" + stack.peek());
		System.out.println("" + stack.pop());
		System.out.println("" + stack.pop());
		System.out.println("" + stack.peek());
	}
}
