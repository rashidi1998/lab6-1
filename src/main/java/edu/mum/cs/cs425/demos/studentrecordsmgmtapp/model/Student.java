package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String studentId;
    private String name;
    private LocalDate dateOfAdmission;

}
