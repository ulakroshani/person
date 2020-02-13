package com.example.person.repository;

import com.example.person.entity.PersonGeneralInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonGeneralInformationRepository extends JpaRepository<PersonGeneralInformation, Integer> {

    @Query(value = "select i from PersonGeneralInformation i where i.personDetail.countryId = ?1")
    List<PersonGeneralInformation> getPersonListUs(String country);

    @Query(value = "select i from PersonGeneralInformation i order by i.personDetail.qualifiedDisqualified")
    List<PersonGeneralInformation> getPersonListBasedOnQualification();

    @Query(value = "select i from PersonGeneralInformation i where i.personDetail.qualifiedDisqualified =?1")
    List<PersonGeneralInformation> getPersonListBasedOnQualification(String qualification);

    @Query(value = "select i from PersonGeneralInformation i where i.personDetail.scannedBy = ?1")
    List<PersonGeneralInformation> getPersonListByScannedBy(String scannedBy);

    @Query(value = "select distinct i.personDetail.scannedBy from PersonGeneralInformation i")
    List<String> getScannedByList();

}
