package com.baidu.test;

public class TestInsert {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new InsertDataTest());
			thread.start();
		}
	}
}
