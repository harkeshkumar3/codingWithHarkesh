package org.example.coding;

public class FindIsStringRotationOf {
    public static void main(String[] args) {

        if(isRotation("ABCD", "CDBA")){
            System.out.println("Rotation is True");
        }else {
            System.out.println("Found False");
        }
    }

    private static boolean isRotation(String first , String second){

        if(first.length() == second.length() && (first + first).contains(second)){
            return true;
        }

        return false;
    }
}
