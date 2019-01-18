package org.andestech.learning.rfb19.g3;


public class App 
{
    public static void main( String[] args )
    {

     Book book1, book0=null;
     book1 = new Book();

     book1.year = 1956;


     new Book();

     Book book2 = new Book();

     book0 = book1;

     System.out.println(book1);
     System.out.println(book2);
     System.out.println(book0);

        System.out.println("book0 year: " + book0.year);
        System.out.println("book1 year: " + book1.year);

        System.out.println("--------------------");
        book0.year = 2013;
        System.out.println("book0 year: " + book0.year);
        System.out.println("book1 year: " + book1.year);





    }
}
