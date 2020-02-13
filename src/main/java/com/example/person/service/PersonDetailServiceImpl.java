package com.example.person.service;

import com.example.person.dto.PersonDetailDto;
import com.example.person.entity.PersonDetail;
import com.example.person.mapper.PersonDetailMapper;
import com.example.person.repository.PersonDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonDetailServiceImpl implements PersonDetailService {
    @Autowired
    PersonDetailRepository personDetailRepository;

    @Autowired
    PersonDetailMapper personDetailMapper;

    @Override
    public PersonDetailDto save(PersonDetailDto personDetailDto) {
        PersonDetail personDetail=personDetailMapper.toEntity(personDetailDto);
        return personDetailMapper.toDto(personDetailRepository.save(personDetail));
    }
}
