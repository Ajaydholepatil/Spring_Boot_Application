package com.example.SprngBootApp.Model;

import java.util.List;
import java.util.stream.Collector;

public class Response {
    private String filename;

    private String fileDownload;
    private String filetype;
    private String filesize;

    public Response(String filename, String fileDownload, String filetype, String size, String filesize) {
        this.filename = filename;
        this.fileDownload = fileDownload;
        this.filetype = filetype;
        this.filesize = filesize;
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

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public Response() {
    }
    public Response(String filename,String fileDownloadUrl,String contentType,long size){

    }

    @Override
    public String toString() {
        return "Response{" +
                "filename='" + filename + '\'' +
                ", fileDownload='" + fileDownload + '\'' +
                ", filetype='" + filetype + '\'' +
                ", size='" + filesize + '\'' +
                '}';
    }

    public Object collect(Collector<Object,?, List<Object>> toList) {
        return null;
    }
}
