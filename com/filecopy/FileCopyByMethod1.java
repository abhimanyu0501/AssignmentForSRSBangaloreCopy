package com.filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByMethod1 {

	public static void main(String[] args) 
	{
//		File file=new File("C:\\Users\\Ganesh\\Downloads\\coding_assignment_java.txt");
		File file=new File("C:\\Users\\Ganesh\\Downloads\\Questions.docx");
		FileInputStream fin=null;
		FileOutputStream fout=null;
		try {
			fin = new FileInputStream(file);
		
		
		byte[] bytes=new byte[(int)file.length()];
		System.out.println((int)file.length());
		int temp=0;
		int i=0;
		while(temp!=-1)
		{
			temp=fin.read();
			if(temp!=-1)
			bytes[i++]=(byte)temp;
		}
		
		//File file1=new File("C:\\Users\\Ganesh\\Downloads\\coding_assignment_java1.txt");
		File file1=new File("C:\\Users\\Ganesh\\Downloads\\Questions1.docx");
		
		 fout=new FileOutputStream(file1);
		
		fout.write(bytes);
		
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		finally {
			try {
				if(fin!=null && fout!=null)
				{
				fin.close();
				fout.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		System.out.println("done");
	}

}
