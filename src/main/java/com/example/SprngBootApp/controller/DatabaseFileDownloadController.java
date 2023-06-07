package com.example.SprngBootApp.controller;



import com.example.SprngBootApp.Model.DatabaseFile;
import com.example.SprngBootApp.Service.DatabaseFileService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DatabaseFileDownloadController {
    @Autowired
    public DatabaseFileService databaseFileService;

    @GetMapping("/downloadFile/{fileName:.+}")

    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request){
        DatabaseFile databaseException = databaseFileService.getFile(fileName);

        return  ResponseEntity.ok().
                contentType(MediaType.parseMediaType(databaseException.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment;filename=\""+databaseException.getFileName()+"\"")
                .body(new ByteArrayResource(databaseException.getData()));

    }
}
