package org.example.core.Interface;

//
//interface addInt {
//    Integer sum(int a, int b);
//}
//interface addFloat {
//    Float sum(int a, int b);
//}
//
//public class Culculator  implements addFloat, addInt{
//
//
//    @Override
//    public Integer sum(int a, int b) {
//        return null;
//    }
//}


 interface InterfaceA {
    public void print();
}


 interface InterfaceB {
  //  public int print();
}

 class ClassAB implements InterfaceA, InterfaceB {

     @Override
     public void print() {

     }
 }

