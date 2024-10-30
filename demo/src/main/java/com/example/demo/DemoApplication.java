package com.example.demo;

import com.example.demo.hotel_management.entity.RestaurantSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		System.out.println("hi");
//		Test<Integer> ob=new Test<Integer>(15);
//		System.out.println(ob.getObj());
//
//		Test<String> ob1=new Test<String>("geeks");
//		System.out.println(ob1.getObj());
//
//		Test1<Integer,String> x=new Test1<Integer,String>(1,"ddd");
//		x.print();
//
//		Test<int[]> ob3=new Test<int[]>(new int[]{1,2,3});
//		System.out.println(Arrays.stream(ob3.getObj()));
//
//		List<String> l=new ArrayList<>();
//		l.add("foo");
//		String s=l.get(0);
////		Integer i=(Integer) l.get(0);

//		StreamExample streamExample=new StreamExample();
////		streamExample.fun(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
////		streamExample.fun();
//
//		StreamMap  sm=new StreamMap();
//		sm.fun();
//		Laptop.fun();
		System.out.println("hi");
		RestaurantSystem.fun();

	}
}
