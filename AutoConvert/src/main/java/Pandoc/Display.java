package Pandoc;

import Pandoc.Native.Operations;
import javafx.application.Application;

public class Display {
    public static void displayMenu(){
        System.out.println("Welcome to Pandoc-Tools AutoConvert");
        System.out.println("Select an input format:");
        System.out.println("1. .md");
        System.out.println("2. .docx");
        System.out.println("3. .pdf");
    }

    public static void checkPandocPresent(){
        if (!Operations.checkForPandoc())
        {
            System.out.println("Pandoc not found in the path value. Please install pandoc to use this tool.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(1);
        }
    }
}