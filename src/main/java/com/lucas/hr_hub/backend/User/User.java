package com.lucas.hr_hub.backend.User;

import com.lucas.hr_hub.backend.Address.Address;
import com.lucas.hr_hub.backend.Employee.Enums.DocumentTypeEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder @ToString
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private DocumentTypeEnum documentType;
    private String documentNum;
    private String email;
    private String phone;
    private Address address;
}
