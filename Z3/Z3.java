package pl.imiajd.jurewicz;

import java.io.File;
import java.util.Arrays;

public class Z3 {
    public static String[] fileList(File file, String extension){
        return file.list(((dir, name) -> !name.endsWith(extension)));
    }
    public static void main(String[] args){
        File file = new File("src");

        System.out.println(Arrays.toString(fileList(file, ".java")));
    }
}
