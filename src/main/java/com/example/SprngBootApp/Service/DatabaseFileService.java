package com.example.SprngBootApp.Service;




import com.example.SprngBootApp.Model.DatabaseFile;
import com.example.SprngBootApp.Repository.DatabaseFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service

public class DatabaseFileService {

    @Autowired
    private DatabaseFileRepository databaseFileRepository;

    public DatabaseFile storeFile(MultipartFile file) {

        String filename = StringUtils.cleanPath(file.getOriginalFilename());

        try {


            if (filename.contains("......")) {
                //throw new FileStorageException("Sorry!!! File storage exception to enable data" + filename);

            }

            DatabaseFile dbFile = new DatabaseFile(filename, file.getContentType(), file.getBytes());
            return databaseFileRepository.save(dbFile);

        } catch (IOException ex) {
            //throw new FileStorageException("could not store file "+ "plezz tray again"+ex);
        }
        return null;
    }

    public DatabaseFile getFile(String fileName) {
        return null;
    }
}
