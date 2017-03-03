package com.pknu.collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.pknu.generic.Elec;
import com.pknu.generic.Mp3;
import com.pknu.generic.Tv;

public class ArrayListTest {	
	ArrayList<Elec> ar ;
	long time;
	
	public void test(){		
		time=System.currentTimeMillis();
		System.out.println(time);
//		ar= new ArrayList<Elec>();
//		JDK 1.7���� ��� ����
		ar= new ArrayList<>();
		ar.add(new Tv());
		ar.add(new Mp3());		
		ar.add(new Mp3());		
		ar.add(new Mp3());			
		System.out.println(ar.size());
		
		for(int i =0; i<ar.size(); i++){			
			System.out.println(ar.get(i));
		}	
		
		for(Elec aa : ar){			
			aa.up();
			aa.down();
		}		
	//Iterator�� �̿��ϴ� ���
		Iterator<Elec> it= ar.iterator();
		while(it.hasNext()){
			Elec ei= it.next();
			System.out.println("Iterator�̿�"+ei);
			ei.up();
			ei.down();
			if(ei instanceof Tv ){
				//�ٿ�ĳ����
				Tv tv =(Tv)ei;
				tv.up();
				tv.down();
				System.out.println("tv�Դϴ�");
			}else{
				Mp3 radio =(Mp3)ei;
				radio.up();
				radio.down();
				System.out.println("MP3�Դϴ�");
			}
		}		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis()-time);
	}
	
	public void test1(){
		time=System.currentTimeMillis();
		System.out.println(time);
		for(int i=0;i<10_000;i++){
			System.out.println(i);
		}
		System.out.println(System.currentTimeMillis());	
		System.out.println(System.currentTimeMillis()-time);
	}
	
	public static void main(String[] args) {
		ArrayListTest ct= new ArrayListTest();
		ct.test();
		ct.test1();
	}

}
