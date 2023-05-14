package Phase1VirtualKey;

import java.io.IOException;
import java.util.Scanner;

public class VirtualKeyApp {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ******************* Virtual Key *******************\n");
        System.out.println("\n ************************** Nitish Kumar Kushwaha ************\n");

        VirtualKeyOption vk = new VirtualKeyOption();

        while(true){
            System.out.println("\n ******** Select the Following Option ***********\n");
            System.out.println("\n -> 1 Show all the files in Ascending Order \n");
            System.out.println("\n -> 2 Business Level Operation\n");
            System.out.println("\n -> 3 Exit the application\n");

            int ch = sc.nextInt();

            if (ch == 3) {
                System.out.println("thank you for using  !!!!!");
                System.exit(0);
            }

            switch (ch) {
                case 1:
                    vk.showFiles();
                    break;
                case 2:
                    while (true) {
                        System.out.println("\n Select one of the below options\n");
                        System.out.println("-> 1 Add the file to the location");
                        System.out.println("-> 2 Delete the File to the location");
                        System.out.println("-> 3 Search the files to the location");
                        System.out.println("-> 4 Back");
                        int choice = sc.nextInt();
                        String name;

                        if (choice == 4) {
                            break;
                        }

                        switch (choice) {
                            case 1:
                                System.out.println("Give the name of the file:");
                                name = sc.next();
                                vk.AddFiles(name);
                                break;
                            case 2:
                                System.out.println("Name the file to delete : ");
                                name = sc.next();
                                vk.deleteFile(name);
                                break;
                            case 3:
                                System.out.println("Name the file to search : ");
                                name = sc.next();
                                vk.searchFile(name);
                                break;   

                        }
                    }
                       
            }
        }
    }
}
