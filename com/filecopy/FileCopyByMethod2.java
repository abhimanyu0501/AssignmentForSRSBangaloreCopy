package com.filecopy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileCopyByMethod2 {
	public static void main(String[] args)  {
		
		File sourceFile=new File("C:\\Users\\Ganesh\\Documents\\drivers.zip");
		File destinationFile=new File("C:\\Users\\Ganesh\\Documents\\drivers1.zip");
		
		try {
			Files.copy(sourceFile.toPath(),destinationFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");
	}

}
