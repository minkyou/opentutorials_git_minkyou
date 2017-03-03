package com.pknu.design;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Design extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3709534852880798117L;
	JButton east, west, north, south, center;
	
	public Design() {
		super();
		design();
	}
	
	public Design(String title) {
		super(title);
		design();
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
		
		east.addActionListener(this);			// this : �ڽ� Ŭ������ ����Ŵ
		west.addActionListener(this);
		north.addActionListener(this);
		south.addActionListener(this);
		center.addActionListener(this);
		
//		ct.add(new JButton("1"), BorderLayout.EAST);
//		ct.add(new JButton("2"), BorderLayout.WEST);
//		ct.add(new JButton("3"), BorderLayout.NORTH);
//		ct.add(new JButton("4"), BorderLayout.SOUTH);
//		ct.add(new JButton("5"), BorderLayout.CENTER);
	}
	
//	
	@Override
	public void actionPerformed(ActionEvent e) {
//		e.getActionCommand()�� JButton�� String�� ����
//		System.out.println(e.getActionCommand());
		
//		Ŭ������ �и��ؾ� OOP
		if(e.getSource() == east) {
			System.out.println("����");
		} else if(e.getSource() == west) {
			System.out.println("����");
		} else if(e.getSource() == north) {
			System.out.println("����");
		} else if(e.getSource() == south) {
			System.out.println("����");
		} else if(e.getSource() == center) {
			System.out.println("�߾�");
		} 
	}
}
