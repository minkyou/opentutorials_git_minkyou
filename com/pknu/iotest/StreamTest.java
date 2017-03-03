/**
 * 
 */
package com.pknu.iotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author ±è¹Î±Ô
 *
 */
public class StreamTest {
	int temp;
	String filePath="D:\\Dev\\2017Se\\.recommenders\\index\\http___download_eclipse_org_recommenders_models_neon_\\";
	String fileName="_8.fdt";
	
	/**
	 * @Date 2017. 2. 20. ¿ÀÈÄ 3:04:28
	 * @author ±è¹Î±Ô
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamTest st = new StreamTest();
		st.fileStreamTest();
//		st.fileReaderTest();
//		st.bufferedTest();
		st.¹öÀü7();
	}
	
	public void fileStreamTest() {
		try {
			FileInputStream fs = new FileInputStream(filePath+fileName);		// 1byte¾¿ ÀÐÀ½
			long before = System.currentTimeMillis();
			
			while((temp=fs.read()) !=-1) {
				System.out.print((char)temp);
			}
			
			long amount = System.currentTimeMillis() - before;
			System.out.println("time: "+amount);
			fs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void fileReaderTest() {
		
		try {
			FileReader fr = new FileReader(filePath+fileName);
			FileWriter fw = new FileWriter(filePath+"test1.txt");

			long before = System.currentTimeMillis();
			while((temp=fr.read()) != -1) {
				fw.write(temp);
			}
			long amount = System.currentTimeMillis() - before;
			System.out.println("time: "+amount);
			fr.close();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void bufferedTest() {
		String tmpStr;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath+fileName));
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePath+"test2.txt"));
			
			long before = System.currentTimeMillis();
			while((tmpStr = br.readLine()) != null) {
				System.out.println(tmpStr);
				bw.write(tmpStr+"\r\n");
			}
			long amount = System.currentTimeMillis() - before;
			
			System.out.println("time: "+amount);
			br.close();
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	// jdk 7ÀÇ ±â´É > try-with-resources¹®
	public void ¹öÀü7() {
		String tmpStr;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath+fileName));
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePath+"test3.txt"))) {
			long before = System.currentTimeMillis();
			while((tmpStr=br.readLine()) != null) {
				System.out.println(tmpStr);
				//bw.write(tmpStr+"\r\n");
			}
			long amount = System.currentTimeMillis() - before;
			
			System.out.println("time: "+amount);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
