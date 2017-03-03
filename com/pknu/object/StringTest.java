package com.pknu.object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		StringTest st = new StringTest();
//		st.strTest();
//		st.strBufferTest();
//		st.strBuilderTest();
//		st.queryTest();
//		st.strTokenizerTest();
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
	}
	
	public void strTest() {
		String str = "a";
		String str1 = "a";
		System.out.println(str.hashCode());
		str += "b";
		System.out.println(str1.hashCode());
		System.out.println(str.hashCode());
	}
	
	public void strBufferTest() {
		StringBuffer sb = new StringBuffer();		// default capacity : 16
		sb.append("12345678");
		System.out.println(sb.hashCode());
		sb.append('1');
		System.out.println(sb.hashCode());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.substring(0, sb.length()-1));
	}
	
	public void strBuilderTest() {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode());
		sb.append("abc");
		System.out.println(sb.hashCode());
		sb.append(2);
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
	}
	
	public void queryTest() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ");
		sb.append("FROM BBS");
		sb.append("WHERE ID = ?");
		System.out.println(sb);
	}
	
	public void strTokenizerTest() {
//		StringBuilder str = new StringBuilder("");
		String str = "123123123&23123123&23132&#123ㅁㄴㅇ";
		String str1 = "222\n33\t33\n4 44\n";
		StringTokenizer strTknr = new StringTokenizer(str, "&");
		StringTokenizer strTknr1 = new StringTokenizer(str1);
		
		// The tokenizer uses the default delimiter set, which is " \t\n\r\f"
		while(strTknr.hasMoreTokens()) {
			System.out.println(strTknr.nextToken());
		}
		
		while(strTknr1.hasMoreTokens()) {
			System.out.println(strTknr1.nextToken());
		}
		
		// jdk1.5 > Iterator 사용 권장 <-> Enumeration
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(10);
		Iterator<Integer> iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
