package mzn;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class Main  {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		int i;         //存放功能序号
		Way way = new Way();
		Filew filework = new Filew();
		Map <String,Student>hashMap = new HashMap<>(); 
//		filework.dateload();//将文件中date加载到hashMap
		while (true) {
			way.iterface();
			System.out.print("请输入操作序号:");
			 i = sc1.nextInt();  
			switch (i) {
			case 1://OK添加学生成绩
				 Student s = way.setstudent();
				 hashMap.put(s.id,s);
				 System.out.println(hashMap);//成功
				break;
			case 2://OK修改学生成绩
				System.out.print("请输入要修改学生学号:");
				String id2 = sc1.next();
				hashMap.remove(id2);
				System.out.print("请输入新的学生成绩:");
				Student s1 = way.setstudent();
				 hashMap.put(s1.id,s1);
				 System.out.println(hashMap);//成功
				break;
			case 3://OK删除学生成绩
				System.out.print("请输入删除学生学号:");
				String id3 = sc1.next();
				hashMap.remove(id3);
				break;
			case 4://OK查询班级成绩
				System.out.print("请输入班级号:");
				int classid = sc1.nextInt();
				for(Map.Entry<String, Student>entry:hashMap.entrySet()) {
					Student stu = entry.getValue();
					if (stu.banji==classid) {
						System.out.print(stu.toString());
					}
				}
				break;
			case 5://OK查询学生成绩 
				System.out.print("请输入学生学号:");
				String id5 = sc1.next();
			    Student t= hashMap.get(id5);
				System.out.println(t);	
				System.out.println("总成绩:"+t.getall()+"平均分:"+t.getaverage()+"不及格:"+t.failingcourse());	
				break;
			case 6://OK 查询学生名单
				for(Map.Entry<String, Student>entry:hashMap.entrySet()) {
					Student stu = entry.getValue();
					System.out.print(stu.toString());
				}
				break;
			case 7:
				filework.datesave(hashMap);//将hashMap保存到文件中
				System.exit(0); //退出程序
			default:
				break;
				}
			}		
	}
}
