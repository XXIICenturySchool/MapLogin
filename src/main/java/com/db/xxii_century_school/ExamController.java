package com.db.xxii_century_school;

import com.db.xxii_century_school.Entities.Exam;
import com.db.xxii_century_school.Services.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    private ExamService examService;

    @PostMapping("/saveExam")
    public int save(@RequestBody Exam exam) {
        return examService.saveExam(exam);
    }

}
