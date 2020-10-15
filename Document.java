/*
Find Docs with Odd Pages

Create class Document with below attributes

id - int
title - String
folderName - String
pages - int

Write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement static method - docsWithOddPages in Solution class.

This method will take array of Document objects and return another array with Document objects which has odd number of pages.

This method should be called from main method and display values of returned objects as shared in the sample (in ascending order of id attribute).

Before calling this method, use Scanner object to read values for four Document objects referring attributes in the above sequence.

Next call the method and display the result.

Consider below sample input and output:

Input:


1
resume
personal
50
2
question1
exams
55
3
question2
exams
45
4
India
misc
40

output:

id=2, title='question1', folderName='exams', pages=55
id=3, title='question2', folderName='exams', pages=45

 */



import java.util.ArrayList;
import java.util.Scanner;

public class Document {

    private  int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id, String title, String folderName, int pages) {
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
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

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", title='" + title + '\'' +
                ", folderName='" + folderName + '\'' +
                ", pages=" + pages
                ;
    }
}


class solutionDocument{

    public static Document[] docsWithOddPages(Document[] docsArray){
        var ar=new ArrayList<Document>();
        for(Document document:docsArray){
            if(document.getPages()%2!=0){
                ar.add(document);
            }
        }

        Document[] oddArray=new Document[ar.size()];
        ar.toArray(oddArray);
        return oddArray;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

Document[] docsArray=new Document[4];

for(int i=0;i<docsArray.length;i++){
    int id=sc.nextInt();
    String title=sc.next();
    String folderName=sc.next();
    int pages=sc.nextInt();

    docsArray[i]= new Document(id,title,folderName,pages);
}
    Document[] resArray=docsWithOddPages(docsArray);

    for(Document document:resArray){
        System.out.println(document.toString());
    }
    }



}