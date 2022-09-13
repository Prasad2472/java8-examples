package com.core.test;

import java.util.Stack;

public class Queue<E> {

	private final Stack<E> enQueue = new Stack<E>();
	private final Stack<E> deQueue = new Stack<E>();

	public E offer(final E e) {
		enQueue.push(e);
		return e;
	}

	public E poll() {
		if (deQueue.isEmpty() && enQueue.isEmpty()) {
			return null;
		}
		if (deQueue.isEmpty()) {
			while (!enQueue.isEmpty()) {
				deQueue.push(enQueue.pop());
			}
		}
		return deQueue.pop();
	}

	public static void main(final String[] args) {
		final Queue<Integer> queue = new Queue<Integer>();
		queue.offer(10);
		queue.offer(2);
		queue.offer(4);
		queue.offer(9);
		queue.offer(3);

		System.out.println("poll:" + queue.poll());
		queue.offer(12);
		queue.offer(15);

		System.out.println("poll:" + queue.poll());
		System.out.println("poll:" + queue.poll());
		System.out.println("poll:" + queue.poll());
		System.out.println("poll:" + queue.poll());

	}

}
