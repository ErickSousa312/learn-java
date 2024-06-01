package test;

import java.io.File;
import java.util.Scanner;

public class file_manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        File[] files = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        if(files==null) {
            System.out.println("No files found");
        }else {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

        //create sub past
        boolean success = new File(strPath + "/createbyfunction").mkdir();
        if(success) {
            System.out.println("Folder created");
        }else {
            System.out.println("Folder not created");
        }
    }
}
