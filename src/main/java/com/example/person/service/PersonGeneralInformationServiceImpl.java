package com.example.person.service;

import com.example.person.dto.PersonGeneralInformationDto;
import com.example.person.entity.PersonGeneralInformation;
import com.example.person.mapper.PersonGeneralInformationMapper;
import com.example.person.repository.PersonGeneralInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonGeneralInformationServiceImpl implements PersonGeneralInformationService{

    @Autowired
    PersonGeneralInformationRepository personGeneralInformationRepository;

    @Autowired
    PersonGeneralInformationMapper personGeneralInformationMapper;
    @Override
    public PersonGeneralInformationDto save(PersonGeneralInformationDto personGeneralInformationDto) {
        PersonGeneralInformation personGeneralInformation=personGeneralInformationMapper.toEntity(personGeneralInformationDto);
        return personGeneralInformationMapper.toDto(personGeneralInformationRepository.save(personGeneralInformation));
    }

    @Override
    public List<PersonGeneralInformationDto> getPersonListExceptNotUS() {
        List<PersonGeneralInformation> personGeneralInformation = personGeneralInformationRepository.getPersonListUs("United States");
        return personGeneralInformationMapper.convertToDtoList(personGeneralInformation);
    }

    @Override
    public List<PersonGeneralInformationDto> sortBasedOnQualification() {
        List<PersonGeneralInformation> personGeneralInformation = personGeneralInformationRepository.getPersonListBasedOnQualification();
        return personGeneralInformationMapper.convertToDtoList(personGeneralInformation);
    }

    @Override
    public List<PersonGeneralInformationDto> sortBasedOnQualification(String qualification) {
        List<PersonGeneralInformation> personGeneralInformation = personGeneralInformationRepository.getPersonListBasedOnQualification(qualification);
        return personGeneralInformationMapper.convertToDtoList(personGeneralInformation);
    }

    @Override
    public List<PersonGeneralInformationDto> getPersonBasedOnScannedBy(String scannedBy) {
        List<PersonGeneralInformation> personGeneralInformation = personGeneralInformationRepository.getPersonListByScannedBy(scannedBy);
        return personGeneralInformationMapper.convertToDtoList(personGeneralInformation);
    }

    @Override
    public List<String> getScannedByList() {
        List<String> list = personGeneralInformationRepository.getScannedByList();
        return list;
    }
}
