package com.upload_file.spring.boot.uploadFile.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadServiceImpl  implements FileUploadService{

    @Override
    public String addFile(MultipartFile file) throws IOException {
        file.transferTo(new File("C:\\Users\\vihan\\Desktop\\Spring\\Upload_FIle\\spring.boot.uploadFile_backend\\src\\main\\resources\\static\\UploadedFiles\\"+ file.getOriginalFilename()));
        String check = "Uploaded the File: "+ file.getOriginalFilename();
        return check;
    }


}
