package jobtwo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class JobTwoTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student1 = new Student("张三",20);
	    Student student2 = new Student("李四",19);
	    Student student3 = new Student("王八",21);
	    Student student4 = new Student("小七",18); 
	    ArrayList<Student>list = new ArrayList<Student>();
	    list.add(student1);
	    list.add(student2);
	    list.add(student3);
	    list.add(student4);
	    int size = list.size();
	    System.out.println("请输入学生姓名");
	    for (Student student : list) {
	    	System.out.println(student);
		}
	    		
	}

}
