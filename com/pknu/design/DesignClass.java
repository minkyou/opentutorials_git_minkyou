package com.pknu.design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DesignClass extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3709534852880798117L;
	JButton east, west, north, south, center;
	
	public DesignClass() {
		super();			// �θ�Ŭ����
		design();
	}
	
	public DesignClass(String title) {
		super(title);
		design();
//		this.addWindowListener(new WindowEventTest());			// �θ��������̽�
//		this.addWindowListener(new WindowAdapterTest());		// �θ�Ŭ����
		this.addWindowListener(new WindowAdapterTest() {		// �͸�Ŭ���� > ���� ���� �޸𸮿� �ö󰣴�.
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("��");
				System.exit(0);
			}
		});
	}
	
	public void design() {
		Container ct = this.getContentPane();
		
		east = new JButton("East");
		west = new JButton("West");
		north = new JButton("North");
		south = new JButton("South");
		center = new JButton("Center");
		
		ct.add(east, BorderLayout.EAST);
		ct.add(west, BorderLayout.WEST);
		ct.add(north, BorderLayout.NORTH);
		ct.add(south, BorderLayout.SOUTH);
		ct.add(center, BorderLayout.CENTER);
		
		east.addActionListener(new East());			// this : �ڽ� Ŭ������ ����Ŵ
		west.addActionListener(new West());
		north.addActionListener(new North());
		south.addActionListener(new South());
		center.addActionListener(new Center());
		
//		ct.add(new JButton("1"), BorderLayout.EAST);
//		ct.add(new JButton("2"), BorderLayout.WEST);
//		ct.add(new JButton("3"), BorderLayout.NORTH);
//		ct.add(new JButton("4"), BorderLayout.SOUTH);
//		ct.add(new JButton("5"), BorderLayout.CENTER);
	}
}
