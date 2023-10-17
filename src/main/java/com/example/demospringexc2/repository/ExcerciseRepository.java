package com.example.demospringexc2.repository;

import com.example.demospringexc2.model.Excercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcerciseRepository extends JpaRepository<Excercise, Long> {
}
