package org.library;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args)throws InterruptedException {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Main Menu:");
        System.out.println("1  Show Available Books");
        System.out.println("2 Show Checked Out Books");
        System.out.println("X close application");
        System.out.println("Please make a choice(1,2,X)");

        String input = scanner.nextLine();

        if (input.equals("1")){ // go to available books screen
            available();
        }
         else if(input.equals("2")){ // go to checked out screen
           checkedOut();
        }
        else {
            System.exit(0); // exit program
        }
    }

    public static void available()throws InterruptedException  {
        System.out.println("you selected \"available\"");
        Scanner scanner = new Scanner(System.in);
        Book[] books = Inventory.Inventory;

        System.out.println("Current available books:");
        for (int i = 0; i < books.length; i++){
            if (books[i].isCheckedOut() == false){
                System.out.println(
                        "[" + i + "] " + books[i].getTitle() + "ID: " + books[i].getId() + "ISBN: " + books[i].getIsbn());
            }
        }
        System.out.println(
                "[X] " + "Go back to Main Menu"
        );



















