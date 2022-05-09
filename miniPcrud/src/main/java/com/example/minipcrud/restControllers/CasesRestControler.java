package com.example.minipcrud.restControllers;


import com.example.minipcrud.entity.Case;
import com.example.minipcrud.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cases")
public class CasesRestControler {
    private CaseService caseService;

    @Autowired
    public CasesRestControler(CaseService theCaseService){
        caseService = theCaseService;
    }

    //  Add mapping for Create (POST method)
    @PostMapping
    public Case createCase(@RequestBody Case theCase){
        // what to do if we pass an id in the body ? we hard code the id to be null so that it dosent update an already existant id
        theCase.setCaseId(null);
        caseService.saveCase(theCase);
        return theCase;
    }


    // Add mapping for testing all cases
    @GetMapping
    public List<Case> findAll(){
        return caseService.findAll();
    }

    //  Add mapping for Read (GET method)
    @GetMapping("/{caseId}")
    public Case readOneCase(@PathVariable Long caseId){
        Case theCase = caseService.readOneCase(caseId);
        if (theCase == null) {
            throw new RuntimeException(
                    "the caes id " + caseId + "is not found"
            );
        }
        return theCase;
    }

    // Add mapping for Update (PUT method)
    @PutMapping("/{caseId}")
    public Case updateCase(@RequestBody Case theCase, @PathVariable Long caseId ){
        theCase.setCaseId(caseId);
        theCase.setCreationDate(caseService.readOneCase(caseId).getCreationDate());
        return caseService.saveCase(theCase);
//        return theCase;
    }

    // Add mapping for Delete (DELETE method).
    @DeleteMapping("/{caseId}")
    // the caseId should match the @PathVariable idCase name
    public String deleteCase(@PathVariable Long caseId) {
        Case theCase = caseService.readOneCase(caseId);
        // if it's null then throw exception
        if (theCase == null) {
            throw new RuntimeException(
                    "The case id not found " + caseId
            );
        }
        caseService.deleteCase(caseId);
        return "Deleted case succefully, the case id: " + caseId;
    }
    }
