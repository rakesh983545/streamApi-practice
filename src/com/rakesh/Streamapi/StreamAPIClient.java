package com.rakesh.Streamapi;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIClient {

	public static void main(String[] args) {


		Stream<String> build=Stream.<String>builder().add("rK").add("man").add("PK").build();
		build.forEach(System.out::println);
		
		Stream<String> generate=Stream.generate(()->"hello").limit(10);
		generate.forEach(System.out::println);
		
		System.out.println("--------------------");
		Stream<Integer> iterate=Stream.iterate(10, i->i+2).limit(10);
		iterate.forEach(System.out::println);
		System.out.println("--------------------");
		
		IntStream range=IntStream.rangeClosed(3,9);
		range.forEach(System.out::println);
		
		System.out.println("--------------------");
		Random random=new Random();
		DoubleStream doubles= random.doubles(5);
		doubles.forEach(System.out::println);
	}

}
