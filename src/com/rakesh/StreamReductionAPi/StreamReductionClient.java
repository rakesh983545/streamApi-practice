package com.rakesh.StreamReductionAPi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReductionClient {

	public static void main(String[] args) {
		List<Product> list=Arrays.asList(new Product(1,"bag"),new Product(2,"powerbank"),new Product(7,"cheez"));
		
		//list.forEach(System.out::println);
		List<String> collect=list.stream().map(Product::getPname).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		System.out.println("000000000000000000000000000000000000000000000000000000000");
		
		String collect2=list.stream().map(Product::getPname).collect(Collectors.joining(",", "[", "]"));
		System.out.println(collect2);
		System.out.println("000000000000000000000000000000000000000000000000000000000");
		
		Double avgprice=list.stream().collect(Collectors.averagingInt(Product::getId));
		System.out.println(avgprice);
	}

}
