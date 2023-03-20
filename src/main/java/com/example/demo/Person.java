package com.example.demo;

import lombok.Data;

import java.util.concurrent.*;
import java.util.concurrent.locks.LockSupport;

@Data
public class Person {
	private int age;
	private String name;

	public static void main(String[] args) {

		new Person().dd();

	}

	public void dd(){
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5,5,5, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5));

		try{
			CountDownLatch countDownLatch = new CountDownLatch(1);
			executor.submit(()->{
				try {
					doService();
				}catch (Exception e){
					e.printStackTrace();
				}
				countDownLatch.countDown();
			});
			countDownLatch.await();
			executor.shutdown();

		}catch (RuntimeException e){
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hihi");

	}

	public void doService(){
		System.out.println("hihihi");
		throw new RuntimeException("hello world");
	}


}

