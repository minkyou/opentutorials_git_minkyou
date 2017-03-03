/**
 * 
 */
package com.pknu.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ±è¹Î±Ô
 *
 */
public class DataTest {

	/**
	 * @Date 2017. 2. 20. ¿ÀÈÄ 1:31:32
	 * @author ±è¹Î±Ô
	 * @param args
	 * @return void
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="D:/Dev/2017Se/2017se/file/";
		String fileName="1byte write.txt";
		BufferedReader br = new BufferedReader(new FileReader(filePath+fileName));
		System.out.println(br.readLine());		// ÇÑ ÁÙ¾¿ ÀÐ¾îµéÀÓ
//		br.readLine();
		br.close();
	}
}
