package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void show(){
        System.out.println("show"  );
        throw new RuntimeException();

    }
    public static void main(String[] args) {
        try{
            System.out.println("hi");
            show();
        }catch (Exception e){
            System.out.println("caught");
        }finally {
            System.out.println("finally");
        }
        System.out.println("last");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}