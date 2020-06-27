package com.practice.SpringWithXml.Repository;

import java.util.ArrayList;
import java.util.List;

import com.practice.SpringWithXml.Model.Student;

public class ScienceStudents implements IStudentRepository {

	public List<Student> findAllStudent() {
		
		List<Student> students = new ArrayList<Student>();

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Anamitra Dey");
		student1.setDepartment("Science");

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Abhishek Murmu");
		student2.setDepartment("Science");

		students.add(student1);
		students.add(student2);

		return students;
	}

}
