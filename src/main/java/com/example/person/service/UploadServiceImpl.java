package com.example.person.service;

import com.example.person.dto.PersonDetailDto;
import com.example.person.entity.PersonDetail;
import com.example.person.entity.PersonGeneralInformation;
import com.example.person.mapper.PersonDetailMapper;
import com.example.person.repository.PersonDetailRepository;
import com.example.person.repository.PersonGeneralInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    PersonDetailMapper personDetailMapper;

    @Autowired
    PersonDetailRepository personDetailRepository;

    @Autowired
    PersonGeneralInformationRepository personGeneralInformationRepository;

    String line;

    @Override
    public void uploadFile() {

        try{
            BufferedReader br= new BufferedReader(new FileReader("I:/persons.csv"));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                PersonDetail p = new PersonDetail();
                p.setEventName(data[0].trim());
                p.setScannedDate(LocalDateTime.parse(data[1].trim(), formatter));
                p.setScannedTime(data[2]);
                p.setCompany(data[8]);
                p.setJobTitle(data[9]);
                p.setAddress1(data[10]);
                p.setAddress2(data[11]);
                p.setAddress3(data[12]);
                p.setCity(data[13]);
                p.setStateId(data[14]);
                p.setZip(data[15]);
                p.setCountryId(data[16]);
                p.setPhoneNumber(data[17]);
                p.setPhoneNumber2(data[18]);
                p.setFaxNumber(data[19]);
                p.setQuestion(data[20]);
                p.setResponse(data[21]);
                p.setNote(data[22]);
                p.setCollateral(data[23]);
                p.setQualifiedDisqualified(data[24]);
                p.setScannedBy(data[25]);
                personDetailRepository.save(p);
                PersonDetailDto personDetailDto= personDetailMapper.toDto(personDetailRepository.save(p));

                PersonGeneralInformation pl = new PersonGeneralInformation();
                pl.setFirstName(data[3]);
                pl.setMiddleInitial(data[4]);
                pl.setLastName(data[5]);
                pl.setEmail(data[6]);
                pl.setEmail2(data[7]);
                pl.setEmail2(data[8]);
                pl.setPersonDetail(p);
                personGeneralInformationRepository.save(pl);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
