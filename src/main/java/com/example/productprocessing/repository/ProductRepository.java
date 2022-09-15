package com.example.productprocessing.repository;


import com.example.productprocessing.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
