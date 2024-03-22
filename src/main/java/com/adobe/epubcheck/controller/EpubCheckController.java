package com.adobe.epubcheck.controller;

import com.adobe.epubcheck.tool.EpubChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpubCheckController {

  private static Logger log = LoggerFactory.getLogger(EpubCheckController.class);

  @PostMapping(value = "/epub-check")
  public String checkEpubFile(@RequestParam("path") String path) {
    EpubChecker epubChecker = new EpubChecker();
    String[] files = new String[1];
    files[0] = "C:/Users/bct57/epub/" + path;

    log.info("開始檢查檔案： " + path);

    epubChecker.run(files);
    return "check ";
  }

}
