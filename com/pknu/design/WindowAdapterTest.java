package com.pknu.design;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("³¡");
		System.exit(0);
	}
}
