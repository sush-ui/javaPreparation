/*
Sort Books by Price

Create class Book with below attributes:

id - int
title - String
author - String
price - double

Write getters, setters and parameterized constructor.

Create class Solution with main method.

Implement static method - sortBooksByPrice in Solution class.
This method will take a parameter as array of Book objects.
It will return array of books which is sorted in ascending order of book price.
 Assume that no two books will have same price.

This method should be called from main method and display values of returned objects as shared in the sample.

Before calling this method,
 use Scanner object to read values for four Book objects referring attributes in the above sequence.

Next call the method and display the result.

Consider below sample input and output:

Input:

1
hello
writer1
40
2
cup
writer2
55
3
Planet
writer3
45
4
India
writer4
40
5
Australia
Writer5
40




sample solution 1:



import java.util.*;

public class Book implements Comparator<Book> {
    private int id;
    private  String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price
                ;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return (int)(o1.price-o2.price);
    }
}

class BookSolution{

    public static Book[] sortBooksByPrice(Book[] booksArray){
        ArrayList<Book> ar=new ArrayList<Book>(Arrays.asList(booksArray));
        ar.sort(new Book());
        Book[] resArray=new Book[ar.size()];
        ar.toArray(resArray);
        return resArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book[] booksArray=new Book[5];

        for(int i=0;i<booksArray.length;i++){
           int id=sc.nextInt();
           String title=sc.next();
           String author=sc.next();
           double price=sc.nextDouble();

           booksArray[i]=new Book(id,title,author,price);
        }
        Book[] resArray=sortBooksByPrice(booksArray);
        for(Book book:resArray){
            System.out.println(book.toString());
        }
    }
}
 */
import java.util.*;

import static java.util.Collections.*;

public class Book {
    private int id;
    private  String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", price=" + price
                ;
    }


}

class BookSolution{

    public static Book[] sortBooksByPrice(Book[] booksArray){
        ArrayList<Book> ar=new ArrayList<Book>(Arrays.asList(booksArray));

        ar.sort(Comparator.comparing(Book::getPrice).thenComparing(Book::getTitle));



        Book[] resArray=new Book[ar.size()];
        ar.toArray(resArray);
        return resArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book[] booksArray=new Book[5];

        for(int i=0;i<booksArray.length;i++){
            int id=sc.nextInt();
            String title=sc.next();
            String author=sc.next();
            double price=sc.nextDouble();

            booksArray[i]=new Book(id,title,author,price);
        }
        Book[] resArray=sortBooksByPrice(booksArray);
        for(Book book:resArray){
            System.out.println(book.toString());
        }
    }
}


