package com.sms;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystem implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystem.class,args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1=new Student("Yuv Raj","Srivastava","yuvraj@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2=new Student("Karan","Srivastava","karan@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3=new Student("Abu","Zafar","abu@gmail.com");
//        studentRepository.save(student3);
    }
}
