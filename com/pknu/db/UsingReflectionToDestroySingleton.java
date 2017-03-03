package com.pknu.db;

import java.lang.reflect.Constructor;

public class UsingReflectionToDestroySingleton {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		EagerInitialization instance = EagerInitialization.getInstance();
		EagerInitialization instance2 = null;
		
		try {
			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
			for ( Constructor constructor : constructors ) {
				constructor.setAccessible(true);
				instance2 = (EagerInitialization)constructor.newInstance();
			}
		} catch (Exception e) {
			
		}
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
