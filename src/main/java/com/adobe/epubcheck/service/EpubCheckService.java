package com.adobe.epubcheck.service;

import com.adobe.epubcheck.tool.EpubChecker;
import org.springframework.stereotype.Service;


@Service
public class EpubCheckService {


  public int checkService(String filePath) {

    EpubChecker epubChecker = new EpubChecker();
    String[] checkFile = new String[1];
    checkFile[0] = filePath;

    return epubChecker.run(checkFile);
  }


}
