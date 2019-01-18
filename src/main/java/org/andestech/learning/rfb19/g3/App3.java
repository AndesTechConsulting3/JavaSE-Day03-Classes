package org.andestech.learning.rfb19.g3;

public class App3 {

    public static void main(String[] args)
    {
        Book book1 = new Book();
        book1.year=1892;
        book1.Author = "Джек Лондон";
        book1.Title = "Белое безмолвие";
        book1.ISBN = "ND823674876-G65";

//
//        String bookInfo =
//                "Author: " + book1.Author +
//                ", Title: " + book1.Title + ", year:" + book1.year + ", ISBN: " +book1.ISBN + ".";

//        System.out.println(bookInfo);

      System.out.println( "invN:" + book1.getInvNumber());
      book1.getBookInfo();

    }
}
