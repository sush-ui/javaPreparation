/*
Create class Shirt with attributes:

int tag
String brand
double price
char gender



Create constructor which takes parameters in above sequence. Create getters and setters for these attributes.



Next, in Solution class, define two static methods as below:



public static double getDiscountPrice(Shirt s):



This method will return the discounted price based on gender for the Shirt object which is passed as input parameter.

If gender is 'm' then discount is 10%. For 'f' it is 20% and for 'u' it is 30%.



public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts,double price):



This method will take array of Shirt objects and price value.

The method will return array of Shirt objects with more than specified price in ascending order of price.



Main method already has Scanner code to read values, create objects and test above methods.


Main method reads values for five Shirt objects, followed by price.

Price will be input for method getShirtWithMoreThanSpecificPrice.
 */


import java.util.*;
public class Shirt {
    private int tag;
    private String brand;
    private double price;
    private char gender;

    public Shirt(int tag, String brand, double price, char gender) {
        this.tag = tag;
        this.brand = brand;
        this.price = price;
        this.gender = gender;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class SolutionShirt{

    public static double getDiscountPrice(Shirt s){
        int f=0;

        switch(s.getGender()){
            case 'm':f=10;break;
            case 'f':f=20;break;
            case 'u':f=30;break;
        }

        double p=s.getPrice();
        return p-((p*f)/100);
    }

    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts,double price){
        ArrayList<Shirt> ar=new ArrayList<Shirt>();
        for(Shirt shirt:shirts){
            if(shirt.getPrice()>price){
                ar.add(shirt);
            }
        }


        Collections.sort(ar,Comparator.comparing(Shirt::getPrice));
        Shirt[] resArray=new Shirt[ar.size()];
        ar.toArray(resArray);
return resArray;
    }


    public static void main(String[] args) {
        Shirt[] shirts = new Shirt[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i< shirts.length;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }



        double price = sc.nextDouble();

        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));
        }

        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        System.out.println("________________________________________");
        for(Shirt s: result)
        {  if(s.getTag()!=0)
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }
    }
