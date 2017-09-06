package com.db.xxii_century_school.Dao;

import com.db.xxii_century_school.Entities.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDao extends CrudRepository<Teacher, Integer>{
    default int saveTeacher(Teacher teacher){
        teacher = save(teacher);
        return teacher.getId();
    }
}
