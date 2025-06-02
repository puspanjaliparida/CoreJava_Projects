/*3.Creation of Stream using of()*/
package com.nt;

import java.util.stream.Stream;

public class TestStream3 {
    public static void main(String[] args) {
		Stream<String> stream=Stream.of("k","p","o","m");
		stream.forEach(System.out::println);
	}
}
