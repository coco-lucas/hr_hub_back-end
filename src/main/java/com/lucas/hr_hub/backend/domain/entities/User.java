package com.lucas.hr_hub.backend.domain.entities;

import com.lucas.hr_hub.backend.domain.entities.enums.DocumentTypeEnum;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private DocumentTypeEnum documentType;
    private String documentNum;
    private String email;
    private String phone;
    private Address address;

    public User(Long id, String firstName, String lastName, DocumentTypeEnum documentType, String documentNum,
            String email, String phone, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNum = documentNum;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public User() {

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DocumentTypeEnum getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(DocumentTypeEnum documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNum() {
        return this.documentNum;
    }

    public void setDocumentNum(String documentNum) {
        this.documentNum = documentNum;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
