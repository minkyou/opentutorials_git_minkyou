package com.pknu.string;

public class String_Main {
	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.test();
		
		StringBuffer sb = new StringBuffer();
		sb.append("TEST"	);
		st.testCharSeq(sb);
		
		st.test1();
	}
}
