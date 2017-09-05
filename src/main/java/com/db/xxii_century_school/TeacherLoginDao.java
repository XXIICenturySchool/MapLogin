package com.db.xxii_century_school;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import static javafx.scene.input.KeyCode.T;

public interface TeacherLoginDao extends MongoRepository<Teacher,Integer>{
    @RestResource(path = "/findByName")
    Teacher findByName(@Param("name") String name);



}
