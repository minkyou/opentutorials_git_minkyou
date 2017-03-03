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
 * @author 김민규
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
	 * @Date 2017. 2. 21. 오전 9:12:38
	 * @author 김민규
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {

		SumTest st = new SumTest();
		st.test();
		
//		"#,##0.00"
//		이런 포맷으로는 항상 소수점 2자리가 반올림되어 나옵니다.
//		"#,##0"
//		이렇게 하면 소수점 이하가 나오지 않지만, 역시 소수부가 반올림되어 정수부에 반영됩니다.
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
