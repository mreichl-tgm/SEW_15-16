import java.io.File;

public class FileR {
    public static void main(String[] args) {
        System.out.println(getParentR(new File(System.getProperty("user.dir"))));
    }

    public static File getParentR(File f) {
        if (f.getParent() == null) return f;
        else return getParentR(f.getParentFile());
    }
}