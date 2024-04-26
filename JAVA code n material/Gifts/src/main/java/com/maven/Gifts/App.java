package com.maven.Gifts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

interface Sweets{
    String getName();
    double getSize();
    int getWeight();
    int getSweetness();

}

class Chocolate implements Sweets{
    private int sweetness, weight;
    private double size;

    Chocolate(double s1, int s2, int w) {
        sweetness = s2;
        size = s1;
        weight = w;
    }
    @Override
    public String getName() { return "Chocolate"; }
    @Override
    public double getSize(){ return size ; }
    @Override
    public int getWeight(){ return weight ; }
    @Override
    public int getSweetness() { return sweetness; }
}

class Rasmalai implements Sweets{
    private int sweetness, weight;
    private double size;

    Rasmalai(double s1, int s2, int w) {
        sweetness = s2;
        size = s1;
        weight = w;
    }
    @Override
    public String getName() { return "Rasmalai"; }
    @Override
    public double getSize(){ return size ; }
    @Override
    public int getWeight(){ return weight ; }
    @Override
    public int getSweetness() { return sweetness; }
}

class Kajukatli implements Sweets{
    private int sweetness, weight;
    private double size;

    Kajukatli(double s1, int s2, int w) {
        sweetness = s2;
        size = s1;
        weight = w;
    }
    @Override
    public String getName() { return "Kaju-Katli"; }
    @Override
    public double getSize(){ return size ; }
    @Override
    public int getWeight(){ return weight ; }
    @Override
    public int getSweetness() { return sweetness; }
}

class Barfi implements Sweets{
    private int sweetness, weight;
    private double size;

    Barfi(double s1, int s2, int w) {
        sweetness = s2;
        size = s1;
        weight = w;
    }
    @Override
    public String getName() { return "Barfi"; }
    @Override
    public double getSize(){ return size ; }
    @Override
    public int getWeight(){ return weight ; }
    @Override
    public int getSweetness() { return sweetness; }
}

public class App
{
    public static void main( String[] args )
    {
        List<List<Sweets>> gifts = new ArrayList<>();
        List<Sweets> g1;

        Scanner input = new Scanner(System.in);
        int i = 1, sweetness, weight, totalwgt = 0, wgt, n;
        String more,name;
        double size;
        do {
            System.out.println("Gift " + i + " :");
            g1 = new ArrayList<Sweets>();
            wgt = 0;
            do {
                more = "sad";
                System.out.print("What is it?\n1. Chocolate\t2. Rasmalai \t 3. Barfi\t 4. Kaju-Katli : ");
                n = input.nextInt();

                System.out.print("Sweetness : ");
                sweetness = input.nextInt();
                System.out.print("Size : ");
                size = input.nextDouble();
                System.out.print("Weight : ");
                weight = input.nextInt();

                wgt += weight;

                switch (n){
                    case 1 :
                        g1.add(new Chocolate(size,sweetness,weight));
                        break;

                    case 2 :
                        g1.add(new Rasmalai(size,sweetness,weight));
                        break;

                    case 3 :
                        g1.add(new Barfi(size,sweetness,weight));
                        break;

                    case 4 :
                        g1.add(new Kajukatli(size,sweetness,weight));
                        break;

                    default:
                        System.out.println("Wrong Input");
                }

                System.out.print("More? (y/n) : ");
                more = input.next();

            } while (!more.equals("n"));
            gifts.add(g1);
            System.out.print("Okay...\nMore Gifts? (y/n) : ");
            more = input.next();
            totalwgt += wgt;
            ++i;
        } while (!more.equals("n"));

        boolean br = false;
        do {
            System.out.println("What do you want to do?\n 1. Get total weight\n 2. Sort the Sweets and get output\n 3. Search for sweets in the Gifts\n 4. Exit");
            int k = input.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Total weight of all the gifts combined = " + totalwgt);
                    break;

                case 2:
                    System.out.println("How do you want to sort the chocolate in the gifts? \n 1. Size\n 2. Sweetness\n 3. Weight");
                    i = input.nextInt();
                    switch (i) {
                        case 1:
                            showSizeSort(gifts);
                            break;

                        case 2:
                            showSweetSort(gifts);
                            break;

                        case 3:
                            showWgtSort(gifts);
                            break;

                        default:
                            System.out.println("Select from 1 or 2 from above... Retry");
                    }
                    break;

                case 3:
                    System.out.println("What is it?\n1. Chocolate\t 2. Rasmalai\t 3. Barfi\t 4. Kaju Katli : ");
                    n = input.nextInt();
                    switch (n) {
                        case 1:
                            name = "Chocolate";
                            break;

                        case 2:
                            name = "Rasmalai";
                            break;

                        case 3:
                            name = "Barfi";
                            break;

                        case 4:
                            name = "Kaju-Katli";
                            break;

                        default:
                            name = "Unknown";
                    }
                    searchingSweet(gifts, name);
                    break;

                case 4:
                    br = true;
                    break;

                default:
                    System.out.println("Please enter your selection number(1/2/3) from above... \nRetry");
            }

        } while (!br);
    }

    private static void searchingSweet(List<List<Sweets>> gifts, String name){
        int nos,i=1,totsweets = 0;
        for(List<Sweets> s : gifts){
            nos = sS(s, name);
            System.out.println("Number of requested sweets present in the gift "+i+" is : "+nos);
            ++i;
            totsweets += nos;
        }

        System.out.println("Total no. of requested sweet present in all the presents is : "+totsweets);
    }

    private static int sS(List<Sweets>s, String sweet){
        int nos = 0;
        for(Sweets k : s){
            if(sweet.equals(k.getName())){
                ++nos;
            }
        }

        return nos;
    }


    private static void showSizeSort(List<List<Sweets>> gifts){
        int i = 1;
        System.out.println("Sorting according to Size : ");
        for(List<Sweets> s : gifts){
            s = sizeSort(s);
            System.out.println("Sorted gift "+i+" :");
            for(Sweets k : s){
                System.out.print(k.getName()+",");
            }
            System.out.println("\b");
            ++i;
        }
    }

    private static void showWgtSort(List<List<Sweets>> gifts){
        int i = 1;
        System.out.println("Sorting according to Weight : ");
        for(List<Sweets> s : gifts){
            s = wgtSort(s);
            System.out.println("Sorted gift "+i+" :");
            for(Sweets k : s){
                System.out.print(k.getName()+",");
            }
            System.out.println("\b");
            ++i;
        }
    }

    private static void showSweetSort(List<List<Sweets>> gifts){
        int i = 1;
        System.out.println("Sorting according to Sweetness : ");
        for(List<Sweets> s : gifts){
            s = sweetSort(s);
            System.out.println("Sorted gift "+i+" :");
            for(Sweets k : s){
                System.out.print(k.getName()+",");
            }
            System.out.println("\b");
            ++i;
        }
    }

    private static List<Sweets> sizeSort(List<Sweets> s){
        Collections.sort(s, new Comparator<Sweets>() {
            @Override
            public int compare(Sweets sweets, Sweets t1) {
                return Double.compare(sweets.getSize(), t1.getSize());
            }
        });

        return s;
    }

    private static List<Sweets> sweetSort(List<Sweets> s){
        Collections.sort(s, new Comparator<Sweets>() {
            @Override
            public int compare(Sweets sweets, Sweets t1) {
                return sweets.getSweetness()-t1.getSweetness();
            }
        });

        return s;
    }

    private static List<Sweets> wgtSort(List<Sweets> s){

        Collections.sort(s, new Comparator<Sweets>() {
            @Override
            public int compare(Sweets sweets, Sweets t1) {
                return sweets.getWeight()-t1.getWeight();
            }
        });

        return s;
    }
}