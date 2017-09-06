package com.db.xxii_century_school;

import com.db.xxii_century_school.Entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface TeacherLoginDao extends CrudRepository<Teacher,Integer> {
    @RestResource(path = "/findByName")
    Teacher findByName(@Param("name") String name);




}
