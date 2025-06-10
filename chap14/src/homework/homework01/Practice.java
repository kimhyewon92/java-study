package homework.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Practice {
	public void method1(String song) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\test\\sub\\나비야1.dat");
		
		byte[] bytes = song.getBytes("UTF-8");
		fos.write(bytes);
		
		fos.flush();
		fos.close();
	}
	
	public void method2(String song) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\test\\sub\\나비야2.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] bytes = song.getBytes("UTF-8");
		bos.write(bytes);
		
		bos.flush();
		bos.close();
		
	}
}
