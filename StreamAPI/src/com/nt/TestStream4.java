/*4.Creating Stream by using generate()*/
package com.nt;

import java.util.stream.Stream;

public class TestStream4 {
    public static void main(String[] args) {
    	Stream<Double> randomNumbers=Stream.generate(Math::random).limit(10);
    	randomNumbers.forEach(System.out::println);
    }
}
