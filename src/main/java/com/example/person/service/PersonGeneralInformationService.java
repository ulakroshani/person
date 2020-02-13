package com.example.person.service;

import com.example.person.dto.PersonGeneralInformationDto;

import java.util.List;

public interface PersonGeneralInformationService {

    PersonGeneralInformationDto save(PersonGeneralInformationDto personGeneralInformationDto);
    List<PersonGeneralInformationDto> getPersonListExceptNotUS();
    List<PersonGeneralInformationDto> sortBasedOnQualification();
    List<PersonGeneralInformationDto> sortBasedOnQualification(String qualification);
    List<PersonGeneralInformationDto> getPersonBasedOnScannedBy(String scannedBy);
    List<String> getScannedByList();

}
