package r01c;

import java.io.File;

public class r01c {
    public static void main(String[] args) {
        File argFile = new File(args[0]);
        String[] dir = argFile.list();
        if (dir != null) {
            for (int i = 0; i < dir.length; i++) {
                File f = new File(argFile, dir[i]);
                if (f.isDirectory())
                    System.out.println("Directory " + dir[i]);
                if (f.isFile())
                    System.out.println("File " + dir[i]);
            }
        }
    }
}