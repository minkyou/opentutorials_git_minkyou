package com.pknu.human;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IfTest ifTest = new IfTest();
		//ifTest.test(80);
		//ifTest.switchTest(90);
		
		ForTest forTest = new ForTest();
		//forTest.gugu();
		//forTest.drawStar();
		//forTest.drawStarReverse();
		//forTest.drawStarReverse1();
		//forTest.drawDiamond(1);
		
		//forTest.drawDiamond(4);		// size: 변의 길이
		
		//forTest.guguWhile();
		/*
		Data testTmp = new Data();
		System.out.println(copy(testTmp).x);
		*/
		
		ArrayTest arrayTest = new ArrayTest();
//		arrayTest.test();
		Lotto lotto = new Lotto();
//		lotto.makeLotto();
//		lotto.makeLottoContinue();
//		lotto.makeLottoTreeSet();
	
//		arrayTest.arrayTest2D();
		MagicSquare ms = new MagicSquare();
//		ms.maBangJin(5);
//		ms.maBangJinAnother(5);
		ms.maBangJinRevision(11);
		
		print();
	}

	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = 100;
		
		return tmp;
	}
	
	static void print() {
		System.out.println("Static Test");
	}
}
