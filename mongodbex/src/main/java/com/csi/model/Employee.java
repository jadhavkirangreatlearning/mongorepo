package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private int empId;

    private String empName;

    private double empSalary;

    private long empContactNumber;


}
