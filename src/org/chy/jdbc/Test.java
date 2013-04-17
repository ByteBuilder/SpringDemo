package org.chy.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("jdbc1.xml"); 

		Teacher teacher1 = new Teacher();
		teacher1.setName("teacher1");
		teacher1.setAge(10);
		teacher1.setAge(1);
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("Tech2");
		teacher2.setAge(20);
		teacher2.setAge(1);
		
		Teacher teacher3 = new Teacher();
		teacher3.setName("T3");
		teacher3.setAge(30);
		teacher3.setAge(1);
		
		TeacherService teacherService = (TeacherService)context.getBean("teacherService");
		teacherService.insertAll(teacher1, teacher2, teacher3);
	}

}
