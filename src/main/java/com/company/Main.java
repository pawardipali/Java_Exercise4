package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("*******************************************");
        System.out.println("Welcome to the Library Management System");
        System.out.println("*******************************************");
        System.out.println("Press 1 to get List of books sorted by alphabetical order");
        System.out.println("Press 2 to get List of books sorted by publication year");
        System.out.println("Press 3 to get List of books sorted by rating");
        System.out.println("Press 4 to find author of given book");
        System.out.println("Press 5 to get list of all books in given publication year");
        System.out.println("Press 6 to get books written by author and count of books");
        System.out.println("Press 7 to find most prolific author");
        System.out.println("Press 0 to exit");
                while (flag) {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Enter Your Choice : ");
                    int choice = scan.nextInt();
                    scan.nextLine();
                    switch (choice) {
                        case 1:
                            Book b=new Book();
                            b.getAlphabetically();
                            break;
                        case 2:
                             Book b1=new Book();
                             b1.getByPublication();
                            break;
                        case 3:
                            Book b2=new Book();
                            b2.getByRating();

                            break;
                        case 4:
                            Book b3=new Book();
                            b3.findByBook();
                            break;
                        case 5:
                            Book b4=new Book();
                            b4.findByYear();
                            break;
                        case 6:
                            Book b5=new Book();
                            b5.countBooksByAuthor();
                            break;
                        case 7:
                            Book b6=new Book();
                            b6.findProlificAuthor();
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.out.println("Please enter valid choice");
                            break;
                    }
                }


    }
}
