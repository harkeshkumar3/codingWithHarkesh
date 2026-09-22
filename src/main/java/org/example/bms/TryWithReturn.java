package org.example.bms;

public class TryWithReturn {

    public static void main(String[] args) {

        int a =10;
        try{
            if (a!=10){
                System.out.println("After try block ");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Block");
        }

      //  System.out.println("After try block ");
    }
}
