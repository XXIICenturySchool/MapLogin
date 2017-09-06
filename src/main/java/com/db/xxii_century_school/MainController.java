package com.db.xxii_century_school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cont")
public class MainController {
    @Autowired
    private  TeacherLoginDao teacherLoginDao;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(path = "/work")
    public  boolean working(){
        return  true;
    }

    @RequestMapping(path = "/getId")
    public int getId(){
        return  123;
    }


    @RequestMapping(path = "/services")
    public List<String> discover(){
        return discoveryClient.getServices();
    }
}
















