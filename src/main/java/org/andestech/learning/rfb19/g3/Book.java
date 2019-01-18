package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class Book {

    public int year;
    public String ISBN, Author, Title;

    private int invNumber;

    public Book(){
        System.out.println("++ ctor, o: " + this);
        //
        invNumber = new Random().nextInt(2500000);
    }


    public int getInvNumber(){return invNumber;}

    private String getReportStr(){
           return
                "Author: " + Author +
                ", Title: " + Title +
                ", year:" + year +
                ", ISBN: " + ISBN + ", invN: "+ invNumber +".";
    }

    public void getBookInfo(){
        System.out.println(getReportStr());
    }

}
