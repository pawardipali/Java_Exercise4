package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookTest {


    @Test
    public void getAlphabetically() {
       
    }

    @Test
    public void getByPublication() {
    }

    @Test
    public void getByRating() {
    }

    @Test
    public void findByBook() {
    }

    @Test
    public void findByYear() {
    }

    @Test
    public void countBooksByAuthor() {
       // Book b5=new Book();
       // b5.countBooksByAuthor();
        //assertEquals();
    }

    @Test
    public void findProlificAuthor() {
        Book b6=new Book();
        b6.findProlificAuthor();
        assertEquals("E.L. James","E.L. James");
    }


}