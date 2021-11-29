package com.upload_file.spring.boot.uploadFile.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileUploadService {
    String addFile(MultipartFile file) throws IOException;
}
