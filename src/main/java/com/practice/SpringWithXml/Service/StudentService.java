package com.practice.SpringWithXml.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.practice.SpringWithXml.Model.Student;
import com.practice.SpringWithXml.Repository.IStudentRepository;

public class StudentService implements IStudentService {
	
	private IStudentRepository studentRepository;
	
	public StudentService() {
		
	}
	
	// Constructor Injection
	public StudentService(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	// Setter Injection
	public void setStudentRepository(IStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	// Autowire byName Line number 9 in applicationContext.xml
//	public void setRepository(IStudentRepository studentRepository) {
//		this.studentRepository = studentRepository;
//	}
	
	public List<Student> nameStartingWithA() {
		List<Student> students = studentRepository.findAllStudent();
		return students.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
	}

}
