package com.example.person.mapper;

import com.example.person.dto.PersonDetailDto;
import com.example.person.entity.PersonDetail;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonDetailMapperImpl implements PersonDetailMapper {

    @Override
    public PersonDetailDto toDto(PersonDetail personDetail) {

        PersonDetailDto personDetailDto = new PersonDetailDto();
        personDetailDto.setEventName(personDetail.getEventName());
        personDetailDto.setScannedDate(personDetail.getScannedDate().toString());
        personDetailDto.setScannedTime(personDetail.getScannedTime());
        personDetailDto.setCompany(personDetail.getCompany());
        personDetailDto.setJobTitle(personDetail.getJobTitle());
        personDetailDto.setAddress1(personDetail.getAddress1());
        personDetailDto.setAddress2(personDetail.getAddress2());
        personDetailDto.setAddress3(personDetail.getAddress3());
        personDetailDto.setCity(personDetail.getCity());
        personDetailDto.setStateId(personDetail.getStateId());
        personDetailDto.setZip(personDetail.getZip());
        personDetailDto.setCountryId(personDetail.getCountryId());
        personDetailDto.setPhoneNumber(personDetail.getPhoneNumber());
        personDetailDto.setPhoneNumber2(personDetail.getPhoneNumber2());
        personDetailDto.setFaxNumber(personDetail.getFaxNumber());
        personDetailDto.setQuestion(personDetail.getQuestion());
        personDetailDto.setResponse(personDetail.getResponse());
        personDetailDto.setNote(personDetail.getNote());
        personDetailDto.setCollateral(personDetail.getCollateral());
        personDetailDto.setQualifiedDisqualified(personDetail.getQualifiedDisqualified());
        personDetailDto.setScannedBy(personDetail.getScannedBy());
        return personDetailDto;
    }

    @Override
    public PersonDetail toEntity(PersonDetailDto personDetailDto) {
        PersonDetail personDetail = new PersonDetail();
        personDetail.setEventName(personDetailDto.getEventName());
        personDetail.setScannedDate(LocalDateTime.parse(personDetailDto.getScannedDate()));
        personDetail.setScannedTime(personDetailDto.getScannedTime());
        personDetail.setCompany(personDetailDto.getCompany());
        personDetail.setAddress1(personDetailDto.getAddress1());
        personDetail.setAddress2(personDetailDto.getAddress2());
        personDetail.setAddress3(personDetailDto.getAddress3());
        personDetail.setCity(personDetailDto.getCity());
        personDetail.setStateId(personDetailDto.getStateId());
        personDetail.setZip(personDetailDto.getZip());
        personDetail.setCountryId(personDetailDto.getCountryId());
        personDetail.setPhoneNumber(personDetailDto.getPhoneNumber());
        personDetail.setPhoneNumber2(personDetailDto.getPhoneNumber2());
        personDetail.setFaxNumber(personDetailDto.getFaxNumber());
        personDetail.setQuestion(personDetailDto.getQuestion());
        personDetail.setResponse(personDetailDto.getResponse());
        personDetail.setNote(personDetailDto.getNote());
        personDetail.setCollateral(personDetailDto.getCollateral());
        personDetail.setQualifiedDisqualified(personDetailDto.getQualifiedDisqualified());
        personDetail.setScannedBy(personDetailDto.getScannedBy());
        return personDetail;
    }

    public List<PersonDetailDto> convertToDtoList(List<PersonDetail> entities) {
        return entities.parallelStream().map(this::toDto).collect(Collectors.toList());
    }


}
