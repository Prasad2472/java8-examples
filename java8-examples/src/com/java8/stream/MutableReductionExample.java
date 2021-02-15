package com.java8.stream;

public class MutableReductionExample {

	public static void main(String[] args) {
		/**
		 * A mutable reduction operation accumulates input elements into a mutable
		 * result container, such as a Collection or StringBuilder, as it processes the
		 * elements in the stream.
		 */
		/**
		 * The mutable reduction operation is called collect(), as it collects together
		 * the desired results into a result container such as a Collection. A collect
		 * operation requires three functions: a supplier function to construct new
		 * instances of the result container, an accumulator function to incorporate an
		 * input element into a result container, and a combining function to merge the
		 * contents of one result container into another. The form of this is very
		 * similar to the general form of ordinary reduction:
		 */
		/**
		 *  <R> R collect(Supplier<R> supplier,
               BiConsumer<R, ? super T> accumulator,
               BiConsumer<R, R> combiner);
		 */

	}

}
