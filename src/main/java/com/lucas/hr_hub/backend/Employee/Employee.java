package com.lucas.hr_hub.backend.Employee;

import java.time.LocalDate;

import com.lucas.hr_hub.backend.Enums.DocumentTypeEnum;
import com.lucas.hr_hub.backend.Payroll.Payroll;
import com.lucas.hr_hub.backend.TimeBank.TimeBank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
public class Employee {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstName;
    
    @NotBlank
    private String LastName;
    
    @NotBlank
    private String position;
    
    @NotBlank @Email @Column(unique = true)
    private String email;

    @NotBlank
    private String phone;
    
    @NotNull
    private LocalDate hireDate;

    @NotNull
    private Double baseSalary;

    @NotBlank
    private DocumentTypeEnum documentType;
    
    @NotBlank
    private String documentNum;

    
    private Payroll payroll;
    private TimeBank timeBank;
}
