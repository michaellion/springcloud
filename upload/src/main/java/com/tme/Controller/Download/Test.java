
package com.tme.Controller.Download;

import java.io.File;
import java.io.IOException;

public class Test{
/**
     * @param args the command line arguments 
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {  
        String lsSrcFile = "D:\\jdk-10.0.1_windows-x64_bin.exe";
        String lsDstDir = "D:\\tmp\\split";  
        String lsDstFile = "D:\\tmp\\split\\jdk-10.0.1_windows-x64_bin.exe";
        File loDstFile = new File(lsDstDir);  
        if (!loDstFile.exists()) {  
            loDstFile.mkdir();  
        }  
  
        long liStartTime = System.currentTimeMillis();  
        FileSplitter loSplitter = new FileSplitter(lsSrcFile, lsDstDir, "cut");  
        String[] laPartFiles = loSplitter.start();  
        while (loSplitter.isBusy()) {  
            Thread.sleep(200);  
        }  
        FileUnifier loUnifier = new FileUnifier(laPartFiles, lsDstFile);  
        loUnifier.start();  
        while (loUnifier.isBusy()) {  
            Thread.sleep(200);  
        }  
        System.out.println("done, spend " + (System.currentTimeMillis() - liStartTime) + " milsecs");  
    }  
}