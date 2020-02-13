package com.example.person.mapper;

import com.example.person.dto.PersonDetailDto;
import com.example.person.entity.PersonDetail;

public interface PersonDetailMapper {

    PersonDetailDto toDto(PersonDetail personDetail);

    PersonDetail toEntity(PersonDetailDto personDetailDto);


}
