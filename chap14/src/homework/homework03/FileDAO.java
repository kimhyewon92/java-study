package homework.homework03;

import java.io.File;

public class FileDAO {
	public boolean checkName(String file) {
		String filePath = "C:/TempTest/" + file;
		File file1 = new File(filePath);
		return file1.exists();
	}
//	
	public void fileSave(String file, String s) {
		
	}
	
	public StringBuilder fileOpen(String file) {
		return null;
		
	}
	
	public void fileEdit(String file, String s) {
		
	}
}
