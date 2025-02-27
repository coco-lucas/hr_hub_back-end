package com.lucas.hr_hub.backend.Employee;

import java.time.LocalDate;
import java.util.List;

import com.lucas.hr_hub.backend.Department.Department;
import com.lucas.hr_hub.backend.Employee.Enums.PositionEnum;
import com.lucas.hr_hub.backend.Employee.Enums.StatusEnum;
import com.lucas.hr_hub.backend.Payroll.Payroll;
import com.lucas.hr_hub.backend.TimeBank.TimeBank;
import com.lucas.hr_hub.backend.User.User;

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
@Table(name = "employee")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Builder @ToString
public class Employee {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private PositionEnum position;

    private Department department;

    private LocalDate hireDate;

    private StatusEnum status;

    private Double baseSalary;

    private Double baseMonthWorkHours;

    private List<Payroll> payrolls;
    
    private List<TimeBank> timeBanks;
}
