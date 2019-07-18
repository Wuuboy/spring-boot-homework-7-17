package com.example.demo.repository;

import com.example.demo.modle.Procuratorate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProcuratorateRepository extends JpaRepository<Procuratorate,Long> {
    Procuratorate findByprocuratorateName(String procuratorateA);
}
