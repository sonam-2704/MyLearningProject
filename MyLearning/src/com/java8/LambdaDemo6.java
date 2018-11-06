package com.java8;

public class LambdaDemo6 {

	interface StringToIntMapper {

		public int map(String str);

	}

	public static void main(String[] args) {

		StringToIntMapper mapper = new StringToIntMapper() {

			@Override
			public int map(String str) {

				return str.length();
			}

		};
		
		System.out.println(mapper.map("mndhfgdhgfj"));
	}

}
