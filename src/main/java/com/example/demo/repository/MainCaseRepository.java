package com.example.demo.repository;

import com.example.demo.modle.MainCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MainCaseRepository extends JpaRepository<MainCase,Long> {
    List<MainCase> findByCaseName(String caseName);

    List<MainCase> findAllByOrderByCaseTimeDesc();
}
