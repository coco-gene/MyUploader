package cn.attackme.myuploader.controller;

import cn.attackme.myuploader.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 文件上传
 */
@RestController
@RequestMapping("/File")
public class FileUploadController {
    @Autowired
    private FileService fileService;

    @PostMapping("/")
    public void upload(String md5,
                       MultipartFile file) throws IOException {
        fileService.upload(md5,file);
    }
}