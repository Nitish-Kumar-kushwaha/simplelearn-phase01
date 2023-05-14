package Phase1VirtualKey;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class VirtualKeyOption {
    private String directory = "/home/nitish/Desktop/java-Eclipse /vs code/simpleLearn/src/Phase1VirtualKey/operation/";

    void showFiles() {
        File dir = new File("src/Phase1VirtualKey/operation/");
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("The folder is empty!!!!");
        } else {
            Arrays.sort(files);
            System.out.println("The Files : ");
            for (String str : files) {
                System.out.println(str);
            }
        }
    }

    void AddFiles(String filename) throws IOException {
        File dir = new File("src/Phase1VirtualKey/operation/" + filename);
        String[] files = dir.list();
        // for (String str : files) {
        //     if (filename.equals(str)) {
        //         System.out.println("File" + filename + "already exists");
        //         return;
        //     }
        // }
        dir.createNewFile();
        System.out.println("File " + filename + " is added!!!!");
    }

    void searchFile(String filename) {
        File dir = new File("src/Phase1VirtualKey/operation/");
        String[] list = dir.list();

        for (String file : list) {
            if (filename.equals(file)) {
                System.out.println("File is Found !!!!!");
                return;

            }
        }
        System.out.println("File is not Found !!!!");
    }

    void deleteFile(String filename) {
        File dir = new File("src/Phase1VirtualKey/operation/");
        File[] list = dir.listFiles();
        for (File file : list) {
            if (filename.equals(file.getName())) {
                file.delete();
                System.out.println("File is Deleted !!!!");
                return;
            }
        }
        System.out.println("Delete operation failed : FILE NOT FOUND !!!!!");
    }
}
