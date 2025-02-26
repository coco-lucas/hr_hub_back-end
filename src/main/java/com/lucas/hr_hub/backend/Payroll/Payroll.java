package com.lucas.hr_hub.backend.Payroll;

import com.lucas.hr_hub.backend.Employee.Employee;
import com.lucas.hr_hub.backend.TimeBank.TimeBank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payroll")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder
public class Payroll {

    TimeBank attendanceLog;
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    private Employee employee;

    @NotNull @Positive
    private Double taxDeductions;
    
    @NotNull @PositiveOrZero
    private Double otherDeductions;
    
    @NotNull @PositiveOrZero
    private Double overtimePay;
    
    @NotNull @Positive
    private Double bonuses;
    
    @PositiveOrZero
    private Double grossSalary;
    
    @Positive @NotNull
    private final Double netSalary = (grossSalary - (taxDeductions - otherDeductions) + (bonuses + overtimePay));
}