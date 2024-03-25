package com.adobe.epubcheck.controller;

import com.adobe.epubcheck.service.EpubCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpubCheckController {

  @Autowired
  private EpubCheckService epubCheckService;

  @PostMapping(value = "/epub-check")
  public String checkEpubFile(@RequestParam("path") String path, @RequestParam("fileName") String fileName) {

    if (path.isEmpty() || fileName.isEmpty()) {
      return "Param error, please set path & fileName！";
    }

    System.out.println("開始檢查檔案： " + fileName);

    return " check result：" + epubCheckService.checkService(path + fileName + ".epub");
  }

}
