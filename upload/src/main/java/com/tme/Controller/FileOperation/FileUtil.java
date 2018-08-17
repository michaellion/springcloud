package com.tme.Controller.FileOperation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    //找到所有的文件
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

    //创建文件夹
    public boolean createDirectory(String destDirName){
        File dir = new File(destDirName);
        if (dir.exists()) {
            System.out.println("创建目录" + destDirName + "失败，目标目录已经存在");
            return false;
        }
        if (!destDirName.endsWith(File.separator)) {
            destDirName = destDirName + File.separator;
        }
        //创建目录
        if (dir.mkdirs()) {
            System.out.println("创建目录" + destDirName + "成功！");
            return true;
        } else {
            System.out.println("创建目录" + destDirName + "失败！");
            return false;
        }
    }

    //删除文件
    public static void main(String [] args){
        String path = "F:\\lijiangnan";
        String createDirPath = "D:\\tmp\\tmp";
        FileUtil fileUtil = new FileUtil();
        fileUtil.getAllFile(path);
        fileUtil.createDirectory(createDirPath);


    }
}
