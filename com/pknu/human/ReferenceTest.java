package com.pknu.human;

import java.math.BigDecimal;

public class ReferenceTest {

	MagicSquare ms = new MagicSquare();
	Today td = new Today();
	
	public void test() {
		ms.size=7;
		ms.start();
		
		System.out.println();
		
		td.human(ms);
		ms.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceTest rt = new ReferenceTest();
//		rt.test();
		
		ReceiveClass rc = new ReceiveClass();
		MagicSquare mg = rc.test2();
		mg.size = 9;
//		mg.start();
		
		Lotto lt = new Lotto();
		lt.length = 10;
		lt.makeLotto();
		
		System.out.println();
		System.out.println(rc.sum(1.0f, 2.0f, 5.1f, 8.3f, 9.2f));
		
		BigDecimal bd = new BigDecimal(rc.sum(1.0f, 2.0f, 5.1f, 8.3f, 9.2f));
		BigDecimal bd1 = new BigDecimal("8.3");
		System.out.println(bd1);
		
		System.out.println(System.currentTimeMillis());
		
		CallClass.staticTest();
	}

}
