package com.example.person.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="personal_detail")
public class PersonDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "scanned_date")
    private LocalDateTime scannedDate;

    @Column(name = "scanned_time")
    private String scannedTime;

    @Column(name = "company")
    private String company;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "address3")
    private String address3;

    @Column(name = "city")
    private String city;

    @Column(name = "state_id")
    private String stateId;

    @Column(name = "zip")
    private String zip;

    @Column(name = "country_id")
    private String countryId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "phone_number2")
    private String phoneNumber2;

    @Column(name = "fax_number")
    private String faxNumber;

    @Column(name = "question")
    private String question;

    @Column(name = "response")
    private String response;

    @Column(name = "note")
    private String note;

    @Column(name = "collateral")
    private String collateral;

    @Column(name = "qualified_disqualified")
    private String qualifiedDisqualified;

    @Column(name = "scanned_by")
    private String scannedBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getScannedDate() {
        return scannedDate;
    }

    public void setScannedDate(LocalDateTime scannedDate) {
        this.scannedDate = scannedDate;
    }

    public String getScannedTime() {
        return scannedTime;
    }

    public void setScannedTime(String scannedTime) {
        this.scannedTime = scannedTime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getQualifiedDisqualified() {
        return qualifiedDisqualified;
    }

    public void setQualifiedDisqualified(String qualifiedDisqualified) {
        this.qualifiedDisqualified = qualifiedDisqualified;
    }

    public String getScannedBy() {
        return scannedBy;
    }

    public void setScannedBy(String scannedBy) {
        this.scannedBy = scannedBy;
    }
}
