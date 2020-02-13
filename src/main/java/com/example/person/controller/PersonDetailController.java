package com.example.person.controller;

import com.example.person.dto.PersonDetailDto;
import com.example.person.service.PersonDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PersonDetailController {

    @Autowired
    PersonDetailService personDetailService;

    @PostMapping(value="/savepersondetail")
    public ResponseEntity<?> savePersonDetail(PersonDetailDto personDetailDto) throws IOException {
        personDetailDto = personDetailService.save(personDetailDto);
        return new ResponseEntity<>(personDetailDto, HttpStatus.OK);

    }
}
