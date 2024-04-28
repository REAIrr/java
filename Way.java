package mzn;

import java.util.Scanner;

public class Way {

public void iterface(){
	System.out.println(" ____________________");
	System.out.println("|  学生成绩管理系统   |");
	System.out.println("|   1:添加学生成绩    |");
	System.out.println("|   2:修改学生成绩    |");
	System.out.println("|   3:删除学生成绩    |");
	System.out.println("|   4:查询班级成绩    |");
	System.out.println("|   5:查询学生成绩    |");
	System.out.println("|   6:查询学生名单    |");
	System.out.println("|   7:退出成绩系统    |");
	System.out.println("|____________________| ");
}
public void change() {
	
}
public Student setstudent() {
    Scanner sc = new Scanner(System.in);
	Student stu1 = new Student(null, 0, null, null, 0, 0, 0, 0);
	System.out.print("请输入学生学期:");
	stu1.term = sc.next();
	System.out.print("请输入学生班级:");
	stu1.banji = sc.nextInt();
	System.out.print("请输入学生姓名:");
	stu1.name = sc.next();
	System.out.print("请输入学生学号:");
	stu1.id = sc.next();
	System.out.print("请输入学生体育成绩:");
	stu1.sports = sc.nextFloat();
	System.out.print("请输入学生高等数学成绩:");
	stu1.math = sc.nextFloat();
	System.out.print("请输入学生高等大学英语成绩:");
	stu1.english = sc.nextFloat();
	System.out.print("请输入学生计算机基础成绩成绩:");
	stu1.computer = sc.nextFloat(); 
	System.out.println("----录入成功----");
	return stu1;
}}

