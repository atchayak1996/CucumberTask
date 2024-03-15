package org.fileoperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperation {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\java\\datas1.txt");
	FileUtils.write(f, "welcome to databasse");
	FileUtils.write(f, "welcome to java class");
	//boolean b = f.createNewFile();
	//System.out.println(b);
	//boolean canRead = f.canRead();
	//System.out.println(canRead);
	//boolean canWrite = f.canWrite();
	//System.out.println(canWrite);\
	String[] list = f.list();
	//for (String string : list) {
		//System.out.println(string);
	//}
	//File[] listFiles = f.listFiles();
	//for (File file : listFiles) {
		//System.out.println(file);
	//}
}
}
