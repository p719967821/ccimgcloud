package com.xz.utils.oss.controller;



import com.xz.common.utils.Result;
import com.xz.utils.oss.service.OssService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * oss对象存储模块
 */
@RestController
@RequestMapping("/fileoss")
public class OssController {

    @Autowired
    private OssService ossService;

    //上传文件
    @PostMapping("uploadOssFile")
    public Result<?> uploadOssFile(MultipartFile file) {
        String url = ossService.uploadFile(file);
        return new Result<String>().ok(url);
    }

    //上传多张图片
    @PostMapping("uploadOssFiles")
    public Result<?> uploadOssFiles(MultipartRequest request, Integer num) {

        List<String> paths = ossService.uploadFiles(request, num);

        return new Result<List<String>>().ok(paths);
    }

    //删除文件
    @RequestMapping("deleteFile")
    public Result<?> deleteFile(String fileName) {
        ossService.deleteFile(fileName);
        return new Result<>().ok();
    }

    //删除文件
    @RequestMapping("deleteFiles")
    public Result<?> deleteFiles(String[] fileNames) {
        ossService.deleteFiles(fileNames);
        return new Result<>().ok();
    }
}
