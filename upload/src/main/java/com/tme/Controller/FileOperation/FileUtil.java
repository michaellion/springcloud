package com.tme.Controller.FileOperation;


import com.tme.Bean.FileBean;
import org.springframework.stereotype.Service;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileUtil {
    //删除文件
    public static void main(String[] args) {
        String path = "F:\\lijiangnan";
        String createDirPath = "D:\\tmp\\tmp";
        FileUtil fileUtil = new FileUtil();
        fileUtil.getRootFile();
        //    fileUtil.createDirectory(createDirPath);


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

    public List<FileBean> getRootFile() {
        String path = "F:\\lijiangnan";
        List<FileBean> list = new ArrayList<>();
        File file = new File(path);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                FileBean fileBean = new FileBean();
                System.out.println("文件夹：" + files[i].getName());
                fileBean.setFileName(files[i].getName());
                fileBean.setUrl(files[i].getAbsolutePath());
                list.add(fileBean);
            }
        }
        return list;
    }
}
