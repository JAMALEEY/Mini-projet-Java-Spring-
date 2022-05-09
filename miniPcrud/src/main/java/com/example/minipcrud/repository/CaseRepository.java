package com.example.minipcrud.repository;

import com.example.minipcrud.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
    /* the reposotry of SPRNG DATA JPA */
}
