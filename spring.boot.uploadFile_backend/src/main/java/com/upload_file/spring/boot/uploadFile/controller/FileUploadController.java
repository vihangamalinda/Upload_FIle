package com.upload_file.spring.boot.uploadFile.controller;

import com.upload_file.spring.boot.uploadFile.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/uploadFile")
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/add")
    public ResponseEntity<String> addFile(@RequestParam("file") MultipartFile file) throws IOException {
      String ok =  fileUploadService.addFile(file);

      return ResponseEntity.ok(ok);
    }

}
