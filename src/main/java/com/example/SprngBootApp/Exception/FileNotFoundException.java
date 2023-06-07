package com.example.SprngBootApp.Exception;

import java.util.List;
import java.util.stream.Collector;

public class FileNotFoundException {
    private String filename;

    private String fileDownload;
    private String filetype;
    private String size;

    public void Response(String filename, String fileDownload, String filetype, String size) {
        this.filename = filename;
        this.fileDownload = fileDownload;
        this.filetype = filetype;
        this.size = size;
    }

    public void Response(String fileName, String fileDownloadUrl, String contentType, long size) {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileDownload() {
        return fileDownload;
    }

    public void setFileDownload(String fileDownload) {
        this.fileDownload = fileDownload;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void Response() {
    }

    @Override
    public String toString() {
        return "Response{" +
                "filename='" + filename + '\'' +
                ", fileDownload='" + fileDownload + '\'' +
                ", filetype='" + filetype + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public Object collect(Collector<Object,?, List<Object>> toList) {
        return null;
    }
}
