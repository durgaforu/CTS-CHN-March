package com;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {

		String msg = "I am Praveen I belongs to Hyd I love Java";

		StringTokenizer st = new StringTokenizer(msg, " ");

		String data[] = new String[st.countTokens()];

		for (int i = 0; st.hasMoreTokens(); i++) {
			String token = st.nextToken();
			data[i] = token;
		}

		for (String s1 : data) {
			System.out.println(s1);
		}

	}

}
