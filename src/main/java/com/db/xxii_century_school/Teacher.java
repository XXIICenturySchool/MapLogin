package com.db.xxii_century_school;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    private Integer id;
    private String name;
    private String mails;

    public Teacher(int teacherId, String mails){
        this.id = teacherId;
        this.mails = mails;
    }

    public Teacher(String name, String mails){
        this.name = name;
        this.mails = mails;
    }

    public static void main(String[] args) throws JsonProcessingException {
        Teacher bka = new Teacher(1, "bka","adsa");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(bka));
    }
}
