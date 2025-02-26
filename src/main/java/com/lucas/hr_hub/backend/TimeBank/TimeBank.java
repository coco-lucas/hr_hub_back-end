package com.lucas.hr_hub.backend.TimeBank;

import java.time.LocalDate;

import com.lucas.hr_hub.backend.Employee.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

@Entity
@Table(name = "timebank")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class TimeBank {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Employee employee;

    private Double workedHours;
    
    private Double overtimeHours;
    
    private LocalDate periodStart;

    private LocalDate periodEnd;
}