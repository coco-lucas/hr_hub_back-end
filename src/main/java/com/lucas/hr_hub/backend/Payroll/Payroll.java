package com.lucas.hr_hub.backend.Payroll;

import com.lucas.hr_hub.backend.Employee.Employee;

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
import lombok.ToString;

@Entity
@Table(name = "payroll")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder @ToString
public class Payroll {
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
    private Double netSalary;

    public Double calculateGrossSalary(){
        return employee.getBaseSalary() + bonuses + overtimePay;
    }
    public Double calculateNetSalary(){
        return grossSalary - taxDeductions - otherDeductions;
    }
    // public Double calculateTaxDeductions(){
    //     //Tudo sendo calculado considerando o sistema brasileiro
        
    // }
}