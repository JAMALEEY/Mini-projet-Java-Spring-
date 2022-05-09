package com.example.minipcrud.service;

import com.example.minipcrud.entity.Case;

import java.util.List;

public interface CaseService {
    public List <Case> findAll();
    public Case saveCase(Case theCase);
    public Case readOneCase(Long idCase);
    public void deleteCase(Long idCase);
}
