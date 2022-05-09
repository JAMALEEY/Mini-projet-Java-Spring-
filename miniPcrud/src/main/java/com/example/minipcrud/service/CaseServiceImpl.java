package com.example.minipcrud.service;

import com.example.minipcrud.entity.Case;
import com.example.minipcrud.repository.CaseRepository;
import com.example.minipcrud.restControllers.CasesRestControler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// we add @service annotation to enable service
@Service
public class CaseServiceImpl implements CaseService{
    // set up constructor injection using the caseRepository
    private CaseRepository caseRepository;
    @Autowired
    public CaseServiceImpl(CaseRepository caseRepository){
        this.caseRepository = caseRepository;
    }

    @Override
    public List<Case> findAll() {
        return caseRepository.findAll();
    }

    @Override
    public void saveCase(Case theCase) {
        caseRepository.save(theCase);
    }

    // working with Optional (introduced in java8)
    @Override
    public Case readOneCase(Long idCase) {
        Optional<Case> result = caseRepository.
                findById(idCase);
        Case theCase = null;
        if (result.isPresent()) {
            theCase = result.get();
        } else {
            // if we didnt find the case
            throw new RuntimeException("Cannot find the case - case id : " + idCase );

        }
        return theCase;
    }

    @Override
    public void deleteCase(Long idCase) {
    caseRepository.deleteById(idCase);
    }
}
