/**
 * 
 */
package com.pknu.thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author ��α�
 *
 */
public class Main extends JFrame implements Runnable {
	static long total;
	static long total1;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jt;
	
	/**
	 * @Date 2017. 2. 21. ���� 9:12:38
	 * @author ��α�
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {

		SumTest st = new SumTest();
		st.test();
		
//		"#,##0.00"
//		�̷� �������δ� �׻� �Ҽ��� 2�ڸ��� �ݿø��Ǿ� ���ɴϴ�.
//		"#,##0"
//		�̷��� �ϸ� �Ҽ��� ���ϰ� ������ ������, ���� �Ҽ��ΰ� �ݿø��Ǿ� �����ο� �ݿ��˴ϴ�.
		DecimalFormat df = new DecimalFormat(String.valueOf("#,##0"));	// #,##0.00
		System.out.println(df.format(total1));
		
		SumTestThread stt = new SumTestThread(3_000_000_000L);
		stt.start();
		
		SumTestThread stt1 = new SumTestThread(6_000_000_000L);
		stt1.start();
		
		SumTestThread stt2 = new SumTestThread(9_000_000_000L);
		stt2.start();
		
	}
	
	public Main() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		design();
	}
	
	public void design() {
		Container ca = this.getContentPane();
		jt = new JTextField(20);
		ca.add(jt, BorderLayout.CENTER);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			jt.setText(String.valueOf(i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
