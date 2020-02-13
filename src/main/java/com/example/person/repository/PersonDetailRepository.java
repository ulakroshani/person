package com.example.person.repository;

import com.example.person.entity.PersonDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDetailRepository extends JpaRepository<PersonDetail, Integer> {

}
