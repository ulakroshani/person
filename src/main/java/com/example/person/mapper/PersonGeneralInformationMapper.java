package com.example.person.mapper;

import com.example.person.dto.PersonGeneralInformationDto;
import com.example.person.entity.PersonGeneralInformation;

import java.util.List;

public interface PersonGeneralInformationMapper {
    PersonGeneralInformationDto toDto(PersonGeneralInformation aboutUs);

    PersonGeneralInformation toEntity(PersonGeneralInformationDto aboutUsDto);

    List<PersonGeneralInformationDto> convertToDtoList(List<PersonGeneralInformation> personGeneralInformation);
}
