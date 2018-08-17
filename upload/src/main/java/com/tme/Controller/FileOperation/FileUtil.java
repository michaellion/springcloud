package com.tme.Controller.FileOperation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    String path = "F:\\lijiangnan";
    public List<String> getAllFile(String path){
        List<String> list = new ArrayList<String>();
        File file = new File(path);
        File [] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
              System.out.println("文     件：" + files[i]);
                list.add(files[i].toString());
            }
            if (files[i].isDirectory()) {
              System.out.println("文件夹：" + files[i]);
            }
        }
        return list;
    }

    public boolean createDirectory(String path){
        File file = new File(path);
        File [] files = file.listFiles();
        for(int i =0; i < files.length;i++){
            if (files[i].isDirectory()) {
                System.out.println("文件夹：" + files[i]);
            }
        }

        return false;
    }

    public static void main(String [] args){
        String path = "F:\\lijiangnan";
        FileUtil fileUtil = new FileUtil();
        fileUtil.getAllFile(path);
    }
}
