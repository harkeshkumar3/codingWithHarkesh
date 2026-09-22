package org.example.Exception;

public class ExceptionExample1 {

    //Explanation: Constructors cannot be enclosed in try/catch block.
     /*   try{
        public Test() //**************{  Constructors cannot be enclosed in try/catch block.}
        {
            System.out.println("GeeksforGeeks");
            throw new Exception();
        }
    } catch(Exception e)    {
        System.out.println("GFG");
    }*/

    public static void main(String[] args) throws  Exception {
        ExceptionExample1 test = new ExceptionExample1();
    }

}
