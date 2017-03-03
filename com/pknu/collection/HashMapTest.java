package com.pknu.collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.pknu.generic.Elec;
import com.pknu.generic.Mp3;
import com.pknu.generic.Tv;

public class HashMapTest {
	HashMap<String,Elec> hm;
	public void test(){
		hm= new HashMap<String,Elec>();
		hm.put("1st", new Mp3()); 
		hm.put("2st", new Tv());		
		
	//1. key���� Iterator�� ���Ϲ���
		Set<String> ss =hm.keySet();
		Iterator<String> it=ss.iterator();
//		Iterator<String> it=hm.keySet().iterator();
		while(it.hasNext()){
			System.out.println("key���� ���"+it.next());
		}
	//2. value ���� Iterator�� ���Ϲ���
		Collection<Elec> cc= hm.values();
		Iterator<Elec> itt= cc.iterator();
//		Iterator<Elec> itt=hm.values().iterator();
		while(itt.hasNext()){
			Elec ha=itt.next();			
			ha.up();
		}		
	//3. Ư�� key���� �־����� key���� �ش��ϴ� value�� ��������
		Iterator<String> it2=hm.keySet().iterator();
		while(it2.hasNext()){
			Elec ha1=hm.get(it2.next());
			ha1.up();
			ha1.down();
		}
		
//		4.entrySet()���
		Set<Map.Entry<String, Elec>> hms=hm.entrySet();
		Iterator<Map.Entry<String, Elec>> its=hms.iterator();
		while(its.hasNext()){
			Map.Entry<String, Elec> me=its.next();
			System.out.print(me.getKey()+"   ");
			System.out.println(me.getValue());
		}
	}
	
	public static void main(String[] args) {
		HashMapTest ct= new HashMapTest();
		ct.test();
	}

}
