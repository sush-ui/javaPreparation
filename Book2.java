/*
Create class Book with below attributes:

id - int
title - String
author - String
price - double

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.



Implement static method - searchTitle in Solution class.



This method will take a parameter of String value along with other parameter as array of Book objects.
It will return array of books where String value parameter appears in the title attribute (with case insensitive search).

This method should be called from main method and display id of returned objects in ascending order.

Before calling this method,
use Scanner object to read values for four Book objects referring attributes in the above sequence.
Next, read the value search parameter.

Next call the method and display the result.

Consider below sample input and output:

Input:

1
hello world
aaa writer
50
2
World cup
bbb writer
55
3
Planet earth
ccc writer
45
4
India's history
ddd writer
40
WORLD
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Book2 {
    private int id;
    private String title;
    private String author;
    private double price;


    public Book2(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
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
                ", price=" + price ;

    }
}


class SolutionBook2{

    public static Book2[] searchTitle(Book2[] booksArray, String givenTitle){

        ArrayList<Book2> ar=new ArrayList<Book2>();


        for(Book2 book:booksArray){
            givenTitle=givenTitle.toLowerCase();
            String check=book.getTitle().toLowerCase();
            if(check.contains(givenTitle)){
                ar.add(book);

            }
        }
Book2[] resArray=new Book2[ar.size()];

        ar.toArray(resArray);

        return resArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book2[] booksArray=new Book2[4];

        for(int i=0;i<booksArray.length;i++){
             int id=sc.nextInt();
             sc.nextLine();
             String title=sc.nextLine();
             String author=sc.nextLine();
             double price=sc.nextDouble();

             booksArray[i]=new Book2(id,title,author,price);
        }
        sc.nextLine();
        String neededTitle=sc.nextLine();

       Book2[] resArray=searchTitle(booksArray,neededTitle);


        if(resArray.length!=0){
            for(Book2 book:resArray){
                System.out.println(book.toString());
            }
        }



    }
}