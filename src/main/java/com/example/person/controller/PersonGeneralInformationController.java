package com.example.person.controller;

import com.example.person.dto.PersonGeneralInformationDto;
import com.example.person.service.PersonGeneralInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonGeneralInformationController {

    @Autowired
    PersonGeneralInformationService personGeneralInformationService;

    @GetMapping(value="/getperson")
    public ResponseEntity<?> getDataExceptUS (){
        List<PersonGeneralInformationDto> personGeneralInformationDto = personGeneralInformationService.getPersonListExceptNotUS();
        return new ResponseEntity<>(personGeneralInformationDto, HttpStatus.OK);
    }

    @GetMapping(value = "/getSortedData")
    public ResponseEntity<?> getSortedDataBasedOnQualification (){
        List<PersonGeneralInformationDto> personGeneralInformationDto = personGeneralInformationService.sortBasedOnQualification();
        return new ResponseEntity<>(personGeneralInformationDto, HttpStatus.OK);
    }

    @PutMapping(value = "/getSortedData/{qualification}")
    public ResponseEntity<?> getSortedDataBasedOnQualification (@PathVariable String qualification){
        List<PersonGeneralInformationDto> personGeneralInformationDto = personGeneralInformationService.sortBasedOnQualification(qualification);
        return new ResponseEntity<>(personGeneralInformationDto, HttpStatus.OK);
    }

    @GetMapping(value="/getscannedperson/{scannedBy}")
    public ResponseEntity<?> getDataBasedOnScannedBy (@PathVariable String scannedBy){
        List<PersonGeneralInformationDto> personGeneralInformationDto = personGeneralInformationService.getPersonBasedOnScannedBy(scannedBy);
        return new ResponseEntity<>(personGeneralInformationDto, HttpStatus.OK);
    }

    @PostMapping(value="/savegeneralinformation")
    public ResponseEntity<?> save (PersonGeneralInformationDto personGeneralInformationDto){
        personGeneralInformationDto = personGeneralInformationService.save(personGeneralInformationDto);
        return new ResponseEntity<>(personGeneralInformationDto, HttpStatus.OK);
    }

}
