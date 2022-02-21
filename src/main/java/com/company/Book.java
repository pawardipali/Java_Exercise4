package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public double publicationYear;
    public double rating;
    String line = "";
    String splitBy = ";";
    int iteration = 0;
    List<Book> book = new ArrayList<Book>();

    public Book(String title, String author, double publicationYear, double rating) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = rating;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public String findAuthor(String title) {
        return author;

    }

    public void getAlphabetically() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);
            }
            Library library = new Library(book);
            List<Book> books1
                    = library.getListOfBooksInLibrary();
            books1.sort(Comparator.comparing(Book::getTitle));

            System.out.println("List of books sorted by alphabetical order");
            for (Book bk : books1) {

                // Print and display the title and author of
                // books inside List object

                System.out.println("Title : " + bk.title
                        + " and "
                        + " Author : " + bk.author);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getByPublication() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);
            }
            Library library = new Library(book);
            List<Book> books2
                    = library.getListOfBooksInLibrary();
            books2.sort(Comparator.comparing(Book::getPublicationYear));
            System.out.println("List of books sorted by publication year");
            for (Book bk : books2) {

                // Print and display the title and author of
                // books inside List object

                System.out.println("Title : " + bk.title
                        + " and "
                        + " Author : " + bk.author + " Year : " + bk.publicationYear);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getByRating() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);
            }
            Library library = new Library(book);
            List<Book> books3
                    = library.getListOfBooksInLibrary();
            books3.sort(Comparator.comparing(Book::getRating));
            System.out.println("List of books sorted by rating");
            for (Book bk : books3) {

                // Print and display the title and author of
                // books inside List object

                System.out.println("Title : " + bk.title
                        + " and "
                        + " Author : " + bk.author + " Rating :" + bk.rating);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findByBook() {
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);


            }
            Library library = new Library(book);

            List<Book> books1
                    = library.getListOfBooksInLibrary();
            List<Book> findByBook = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            System.out.print("Type the title of the book: ");
            String givenBook = scan.nextLine();
            for (Book b : books1) {
                if (b.getTitle().equals(givenBook)) findByBook.add(b);

            }

            for (Book newbk : findByBook) {
                System.out.println("Author of book is " + newbk.author);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void findByYear() {
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);


            }
            Library library = new Library(book);

            List<Book> books1
                    = library.getListOfBooksInLibrary();
            List<Book> findByYear = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            System.out.print("Type the publication year of the book: ");
            Double givenYear = scan.nextDouble();
            scan.nextLine();
            for (Book b : books1) {
                if (b.getPublicationYear() == givenYear) findByYear.add(b);

            }


            for (Book b2 : findByYear) {
                System.out.println("Books in the given publication year are " + b2.title);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void countBooksByAuthor() {
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);


            }
            Library library = new Library(book);

            List<Book> books1
                    = library.getListOfBooksInLibrary();
            List<Book> countBooksByAuthor = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            System.out.print("Type the author of the book: ");
            String givenAuthor = scan.nextLine();
            for (Book b : books1) {
                if (b.getAuthor().equals(givenAuthor)) countBooksByAuthor.add(b);

            }
            int count = 0;
            for (Book b3 : countBooksByAuthor) {
                count++;
                System.out.println("Books written by author are " + b3.title);

            }
            System.out.println("The count of book is " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void findProlificAuthor() {
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Exercise4/src/main/resources/Books.csv"));

            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                if (iteration == 0) {
                    iteration++;
                    continue;
                }
                String[] books = line.split(splitBy);// use comma as separator
                String bookTitle = books[8];
                String bookAuthor = books[6];
                double year = Double.parseDouble(books[7]);
                double avgRating = Double.parseDouble(books[10]);

                Book b1 = new Book(bookTitle, bookAuthor, year, avgRating);
                book.add(b1);


            }
            Library library = new Library(book);
            List<Book> books3
                    = library.getListOfBooksInLibrary();
            System.out.println("Most Prolific Author is -> " + (books3.get(books3.size() - 1)).author);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String toString() {
        return getTitle() + " " + getAuthor() + " " + getPublicationYear() + " " + getRating();
    }
}
