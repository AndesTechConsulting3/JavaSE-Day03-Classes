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


      //----------------------------------

       Book2 book2 = new Book2();
       book2.setYear(1935);
       book2.setAuthor("Алексей Толстой");
       book2.setTitle("Аэлита");
       book2.setIsbn("HA876487687-hg22");

       book2.printBookInfo();

        System.out.println(Math.random());
        System.out.println("count: " + Book2.getCounter());

        new Book2(); new Book2();
        System.out.println("count: " + Book2.getCounter());

        //----------------------------------------------

        Book3 book3 =
        new Book3(1878,"GG-864876","Лев Толстой","Война и Мир");
        book3.printBookInfo();

        Book3 book4 =
                new Book3(1865,"GT-823464876","Лев Толстой","Крейцерова соната");

        book4.printBookInfo();
        System.out.println("counter: " + Book3.getCounter());





    }
}
