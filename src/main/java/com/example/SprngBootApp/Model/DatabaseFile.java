package com.example.SprngBootApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import java.util.Arrays;

@Entity
@Table(name = "filedb")

public class DatabaseFile {
    @Id
    @GeneratedValue(generator =  "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String Id;

    private String fileName;

    private String fileType;

    private byte[] data;

    public DatabaseFile(String id, String fileName, String fileType, byte[] data) {
        Id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.data = data;
    }

    public DatabaseFile(String filename, String contentType, byte[] bytes) {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public DatabaseFile() {
    }

    @Override
    public String toString() {
        return "DatabaseFile{" +
                "Id='" + Id + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public String getfileName() {
        return null;
    }
}
