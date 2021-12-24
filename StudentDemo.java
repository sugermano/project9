package project9;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请按照\"学号，姓名,年龄\"输入学生信息，输入\"exit\"退出：");
		Scanner input=new Scanner(System.in);
		String info=input.next();
		String id,name;
		int age;
		Set<Student> stus=new TreeSet<Student>();
		while(!info.equals("exit")) {
			id=info;
			name=input.next();
			age=input.nextInt();
			Student stu=new Student(id,name,age);
			stus.add(stu);
			System.out.print("请按照\"学号，姓名,年龄\"输入学生信息，输入\"exit\"退出：");
			info=input.next();
		}
		System.out.println("SetStudentDemo:");
		Iterator<Student> it = stus.iterator();
		while(it.hasNext()) {
			Student st = (Student)it.next();
			st.showStudent();
		}
	}

}
