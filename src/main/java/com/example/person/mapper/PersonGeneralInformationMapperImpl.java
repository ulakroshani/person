package com.example.person.mapper;

import com.example.person.dto.PersonGeneralInformationDto;
import com.example.person.entity.PersonGeneralInformation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonGeneralInformationMapperImpl implements PersonGeneralInformationMapper {
    @Override
    public PersonGeneralInformationDto toDto(PersonGeneralInformation personGeneralInformation) {
        PersonGeneralInformationDto personGeneralInformationDto= new PersonGeneralInformationDto();
        personGeneralInformationDto.setId(personGeneralInformation.getId());
        personGeneralInformationDto.setFirstName(personGeneralInformation.getFirstName());
        personGeneralInformationDto.setMiddleInitial(personGeneralInformation.getMiddleInitial());
        personGeneralInformationDto.setLastName(personGeneralInformation.getLastName());
        personGeneralInformationDto.setEmail(personGeneralInformation.getEmail());
        personGeneralInformationDto.setEmail2(personGeneralInformation.getEmail2());
        personGeneralInformationDto.setPersonDetail(personGeneralInformation.getPersonDetail());
        return personGeneralInformationDto;
    }

    @Override
    public PersonGeneralInformation toEntity(PersonGeneralInformationDto personGeneralInformationDto) {
        PersonGeneralInformation personGeneralInformation = new PersonGeneralInformation();
        personGeneralInformation.setId(personGeneralInformationDto.getId());
        personGeneralInformation.setFirstName(personGeneralInformationDto.getFirstName());
        personGeneralInformation.setMiddleInitial(personGeneralInformationDto.getMiddleInitial());
        personGeneralInformation.setLastName(personGeneralInformationDto.getLastName());
        personGeneralInformation.setEmail(personGeneralInformationDto.getEmail());
        personGeneralInformation.setEmail2(personGeneralInformationDto.getEmail2());
        personGeneralInformation.setPersonDetail(personGeneralInformationDto.getPersonDetail());
        return personGeneralInformation;
    }

    public List<PersonGeneralInformationDto> convertToDtoList(List<PersonGeneralInformation> entities) {
        return entities.parallelStream().map(this::toDto).collect(Collectors.toList());
    }
}
