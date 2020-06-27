package com.practice.SpringWithXml.Repository;

import java.util.List;

import com.practice.SpringWithXml.Model.Student;

public interface IStudentRepository {

	List<Student> findAllStudent();
}
