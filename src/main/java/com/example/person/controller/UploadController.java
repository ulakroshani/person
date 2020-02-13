package com.example.person.controller;

import com.example.person.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {

    @Autowired
    UploadService uploadService;

    @RequestMapping(path= "upload")
    public void upload(){
        uploadService.uploadFile();
    }

}
