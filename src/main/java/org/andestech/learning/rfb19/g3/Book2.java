package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class Book2 {

    private static final int minYear=1400, maxYear= 2019;

    private static int counter = 0;
    public static int getCounter(){return counter;}

    private int year;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String isbn, author, title;

    private int invNumber;

    public int getYear(){return year;}
    public void setYear(int year){
        if(year >= minYear && year <= maxYear ) this.year = year;

    }
  // public void setYear(int year2){year = year2;}


    public Book2(){
       // minYear = -100;
        counter++;
        System.out.println("++ ctor, o: " + this);
        //
        invNumber = new Random().nextInt(2500000);
    }


    public int getInvNumber(){return invNumber;}

    private String getReportStr(){
           return
                "author: " + author +
                ", title: " + title +
                ", year:" + year +
                ", isbn: " + isbn + ", invN: "+ invNumber +".";
    }

    public void printBookInfo(){
        System.out.println(getReportStr());
    }

}
