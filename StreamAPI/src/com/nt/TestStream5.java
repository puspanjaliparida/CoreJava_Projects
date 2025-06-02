/*5.Create a stream using splitAsStream()*/
package com.nt;

import java.util.regex.Pattern;

public class TestStream5 {
    public static void main(String[] args) {
		String sentence="I am a very good person.";
		Pattern.compile(" ").splitAsStream(sentence).forEach(System.out::println);
	}
}
