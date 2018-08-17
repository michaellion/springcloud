import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileTest {
    public static void main(String [] args){
        String path = "D:\\ResourceTest\\";
        FileTest ft = new FileTest();
       // ft.getVideoList(path);
        ft.searchByName(path,"python");
    }



    //得到所有的视屏文件
    public  List<String> getVideoList(String strPath) {
        File dir = new File(strPath);
        List<String> filelist = new ArrayList<>();
        File[] files = dir.listFiles();           // 该文件目录下文件全部放入数组
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    getVideoList(files[i].getAbsolutePath()); // 获取文件绝对路径
                } else if (fileName.endsWith("avi") || fileName.endsWith("3gp") || fileName.endsWith("wmv") || fileName.endsWith("flv")
                        || fileName.endsWith("swf") || fileName.endsWith("rmvb") || fileName.endsWith("mov") ||fileName.endsWith("fla")) { // 判断文件名是否以.avi结尾
                    String strFileName = files[i].getAbsolutePath();
                    System.out.println("---" + strFileName);
                    filelist.add(strFileName);
                } else {
                   /* String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);

                    System.out.println("文件::: "+fileName);
                    System.out.println("文件的名字::: "+fileName);
                    System.out.println("后缀名::: "+suffix);*/
                     continue;
                }
            }

        }
        return filelist;
    }

    //按名字搜索
    public List<String> searchByName(String strPath,String searchedName){
        File dir = new File(strPath);
        List<String> filelist = new ArrayList<>();
        File[] files = dir.listFiles();           // 该文件目录下文件全部放入数组

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) { // 判断是文件还是文件夹
                    searchByName(files[i].getAbsolutePath(),searchedName); // 获取文件绝对路径
                } else if (fileName.contains(searchedName)) { // 判断文件名是否以.avi结尾
                    String strFileName = files[i].getAbsolutePath();
                    System.out.println("---" + strFileName);
                    filelist.add(strFileName);
                } else {
                   /* String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);*/


                    continue;
                }
            }
        }
        return filelist;
    }

}
