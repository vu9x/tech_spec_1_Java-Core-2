package org.example;

import lombok.*;
import java.util.List;
import java.util.stream.DoubleStream;

@Data // + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private String name;
    private List<Double> grades;
    private String speciality;

//    Student(String name, List<Double> grades, String speciality){
//        this.name = name;
//        this.grades = grades;
//        this.speciality = speciality;
//    }

    public String getSpeciality() {
        return speciality;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
         return getGrades().stream()
                 .mapToDouble(x -> x / getGrades().size())
                 .reduce(0.0,Double::sum);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", speciality='" + speciality + '\'' +
                ", average grade = " + getAverageGrade() +
                '}' + "\n";
    }
}
