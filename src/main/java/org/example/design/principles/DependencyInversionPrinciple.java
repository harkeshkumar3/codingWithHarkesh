//package org.example.design.principles;
//
//
///*
//    Entities must depend on abstractions not on concretions.
//    It states that the high level module must not depend on the low level module, but they should depend on abstractions.
//
//
// * */
//
//
//import static sun.nio.ch.IOStatus.EOF;
//
//interface ReaderDIP {
//    char read();
//}
//
//interface WriterDIP {
//    char write(char ch);
//}
//
//class Copy {
//    void copy(ReaderDIP read, WriterDIP write) {
//        char ch;
//        while ((ch = read.read()) != EOF) {
//            write.write(ch);
//        }
//    }
//}
//
//public class DependencyInversionPrinciple {
//}
//
