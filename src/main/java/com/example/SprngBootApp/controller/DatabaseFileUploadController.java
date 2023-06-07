package com.example.SprngBootApp.controller;


import com.example.SprngBootApp.Model.DatabaseFile;
import com.example.SprngBootApp.Model.Response;
import com.example.SprngBootApp.Service.DatabaseFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController

public class DatabaseFileUploadController {
    @Autowired
    private DatabaseFileService databaseFileService;

    @PostMapping("/uploadFile")

    public com.example.SprngBootApp.Model.Response uploadFile(@RequestParam("file") MultipartFile file) {
        DatabaseFile filename = databaseFileService.storeFile(file);

        String fileDownloadUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path(filename.getfileName())
                .toUriString();


        return new Response(filename.getFileName(), fileDownloadUrl, file.getContentType(), file.getSize());


    }
}
