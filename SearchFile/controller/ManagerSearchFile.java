package SearchFile.controller;

import java.util.Scanner;

import SearchFile.common.Algorithm;
import SearchFile.common.Library;
import SearchFile.view.Menu;



public class ManagerSearchFile extends Menu<String> {

    static Scanner sc = new Scanner(System.in);

    static String[] mc = {"Count Word In File", "Find File By Word", "Exit"};

    protected Library library;
    protected Algorithm al;
    String path;
    String word;

    public ManagerSearchFile() {
        super("============ Search Program =========", mc);
        library = new Library();
        al = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Enter Path: ");
                path = sc.nextLine();
                System.out.print("Enter Word: ");
                word = sc.nextLine();
                int count = al.countWordInFile(path, word);
                System.out.println("Count: " + count);
                break;
            case 2:
                System.out.print("Enter Path: ");
                path = sc.nextLine();
                System.out.print("Enter Word: ");
                word = sc.nextLine();
                al.getFileNameContainsWordInDirectory(path, word);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }

}

