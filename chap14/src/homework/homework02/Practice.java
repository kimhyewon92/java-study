package homework.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 소요시간 반환
public class Practice {
	public long method1(String file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		
		long begin = System.nanoTime();
		fis.read();
		long end = System.nanoTime();
		
		return end - begin;
		
	}
	
	public long method2(String file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		long begin = System.nanoTime();
		bis.read();
		long end = System.nanoTime();
		
		return end - begin;
	}
}
