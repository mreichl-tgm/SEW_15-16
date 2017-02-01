package r01d;

import java.io.File;

public class r01d {
    public static void main(String[] args) {
        ls(args[0]);
    }

    static void ls(String dir) {
        File dirFile = new File(dir);
        String[] dirList = dirFile.list();
        if (dirList != null) {
            for (String subDir : dirList) {
                File f = new File(dirFile, subDir);
                if (f.isFile()) System.out.println("f -> " + f);
                if (f.isDirectory()) ls(f.toString());
            }
        }
    }
}
