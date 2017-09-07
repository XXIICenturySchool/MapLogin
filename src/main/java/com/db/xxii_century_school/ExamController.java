package com.db.xxii_century_school;

import com.db.xxii_century_school.Entities.Exam;
import com.db.xxii_century_school.MyServices.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    private ExamService examService;

    @Autowired
    private DiscoveryClient discoveryClient;
    @PostConstruct
    public void init(){
        System.out.println();
    }


    @RequestMapping(path = "/work")
    public boolean working() {
        return true;
    }

    @PostMapping("/saveExam")
    public int save(@RequestBody Exam exam) {
        return examService.saveExam(exam);
    }

}
