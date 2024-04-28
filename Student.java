package mzn;
import java.util.Scanner;

public class Student {
	public String term;      //学期
	public int    banji;    //班级
	public String name;      //学生姓名
    public String id;        //学生学号
    public float sports;    //体育
    public float math;      //高等数学
    public float english;   //大学英语
    public float computer;  //计算机基础成绩
	public Student(String term, int banji, String name, String id, float sports, float math, float english,
			float computer) {
		super();
		this.term = term;
		this.banji = banji;
		this.name = name;
		this.id = id;
		this.sports = sports;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public int getBanji() {
		return banji;
	}
	public void setBanji(int banji) {
		this.banji = banji;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getSports() {
		return sports;
	}
	public void setSports(float sports) {
		this.sports = sports;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	
	@Override
	public String toString() {
		return "学期:"+term +" "+ "班级:"+banji +" " + "姓名:"+name +" " + "学号:"+id+" "  + sports+" "
				+ math+" " + english+" "  + computer ;
	}
	public float getaverage() {
		return (sports+math+english+computer)/4;
	}
	public float getall() {
		return sports+math+english+computer;
	}
	public String failingcourse() {
		String fail = null;
		if (sports<=60) { 
			fail = fail +"Sport";
		}
		if (math<=60) { 
			fail = fail +"Math";
		}
		if (english<=60) { 
			fail = fail +"English";
		}
		if (computer<=60) { 
			fail = fail +"Computer";
		}
		return fail;
	
		
	}
	
	
    
}
