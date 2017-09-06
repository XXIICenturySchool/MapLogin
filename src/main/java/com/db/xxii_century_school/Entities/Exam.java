package com.db.xxii_century_school.Entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exam {

    @Id
    @GeneratedValue
    private int id;
    private int teacherId;
    private String url;

    @SneakyThrows
    public static void main(String[] args) {
        Exam exam = new Exam(1, 2, "americantest");
        ObjectMapper mapper= new ObjectMapper();
        System.out.println(mapper.writeValueAsString(exam));
    }
}
