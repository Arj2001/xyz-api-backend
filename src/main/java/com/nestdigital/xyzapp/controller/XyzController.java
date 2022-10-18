package com.nestdigital.xyzapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController

public class XyzController {

    @CrossOrigin(origins = "*")
    @GetMapping("/student")
    public ArrayList student(){
        ArrayList<HashMap> student = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        map.put("name", "Arjun");
        map.put("roll_no", "15");
        student.add(map);
        map.put("name", "Arjun");
        map.put("roll_no", "15");
        student.add(map);
        return student;
    }
}
