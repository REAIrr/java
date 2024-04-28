package mzn;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Filew {
	public void datesave(Map <String,Student>hashMap) {
		FileOutputStream fileOut = null;
		fileOut = FileOutputStream("D:/eclipse-基本版/student.txt");
		ObjectOutputStream fput = null;
		try {
			fput = new ObjectOutputStream(new FileOutputStream(new java.io.File("D:/eclipse-基本版/student.txt")));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		for(Map.Entry<String, Student>entry:hashMap.entrySet()) {
			Student stu = entry.getValue();
			try {
				fput.writeObject(stu);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			}
			try {
				fput.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		System.out.println("保存成功");
	}
	private FileOutputStream FileOutputStream(String string) {
		// TODO 自动生成的方法存根
		return null;
	}
	public Map <String,Student> dateload() throws IOException {
		Map<String, Student> returnMap =new HashMap<String, Student>();
		FileInputStream file = new FileInputStream(new File("D:/wwww.txt"));
		try (ObjectInputStream reand = new ObjectInputStream(file)) {
			while(true) {
				try {
					Student student5 =(Student) reand.readObject();
				}catch (IOException | ClassNotFoundException e) {
					System.out.print("读写完成");
				}
				
			}
		}
		return returnMap;}
	}

}
