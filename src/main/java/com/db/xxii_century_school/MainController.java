package com.db.xxii_century_school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cont")
public class MainController {
    @Autowired
    private  TeacherLoginDao teacherLoginDao;

    @RequestMapping(path = "/work")
    public  boolean working(){
        return  true;
    }

    @RequestMapping(path = "/getId")
    public int getId(){
        return  123;
    }

    @RequestMapping(path = "/new2")
    public Teacher addRandomTeacher(){
        Teacher teacher = new Teacher(21, "meow@woof.com");
        return teacherLoginDao.save(teacher);
    }
}















