package com.db.xxii_century_school.Services;

import com.db.xxii_century_school.Dao.ExamDao;
import com.db.xxii_century_school.Entities.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamDao examDao;
    @Override
    public int saveExam(Exam exam) {
        return examDao.saveExam(exam);
    }
}
