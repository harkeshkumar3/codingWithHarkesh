OutOfMemoryError in java
---
![Image of error](https://lh6.googleusercontent.com/Frevpl54Sj-ozsXhPwMXwSaFntVrzx0bqnhJYulZ85VIKEz90kZDzGFLWsuNWME0ARLBlgQJc0eTLLuV5PBxeYAl91hFBlIB3FmPd2GH05ijpDKP9vdtvFtQ6eaVyPceAKU0Xg2j)

***JVM Heap memory (Hotspot heap structure)  in java consists of following elements>***

- Young Generation
    - 1a) Eden,
    - 1b) S0 (Survivor space 0)
    - 1c) S1 (Survivor space 1)
- Old Generation (Tenured)
- Permanent Generation.


#####Exception in thread: java.lang.OutOfMemoryError: - Java heap space
__OutOfMemoryError__ : Java heap space - is thrown whenever there is insufficient space to allocate an object in the Java heap.


Is Exception in thread threadName - java.lang.OutOfMemoryError - Java heap space
Indicates memory leak?
No, this OutOfMemoryError does not necessarily means that it is memory leak.
>__Solution__
>
>You may need to increase the heap size using -Xms and -Xmx jvm parameters as a solution to this issue.

#####Exception in thread: java.lang.OutOfMemoryError: GC Overhead limit exceeded

__OutOfMemoryError__: GC Overhead limit exceeded - indicates that the garbage collector is running all the time and Java program is making very slow progress.


After a GC (garbage collection), if the garbage collector is spending more than 98% of its time in doing garbage collection and if less than 2% of the java heap memory space is reclaimed, then OutOfMemoryError - GC Overhead limit exceeded - is thrown in java. 


This OutOfMemoryError is generally thrown because all the live objects are not getting garbage collected properly and java heap space is not available for new objects.

>You must increase the heap size to avoid OutOfMemoryError - GC Overhead limit exceeded in java as a solution to this issue..
#####Exception in thread: java.lang.OutOfMemoryError: Requested array size exceeds VM limit
OutOfMemoryError: Requested array size exceeds VM limit - indicates that the java application tried to allocate an array larger than the heap size. 
>You must increase the heap size to avoid OutOfMemoryError - Requested array size exceeds VM limit. 


#####Exception in thread: java.lang.OutOfMemoryError: Metaspace
java.lang.OutOfMemoryError:Metaspace is thrown when there is no space to allocate metaspace for java class metadata.
>You may increase the value of metaspace by passing the above VM argument (-XX:MaxMetaspaceSize).


#####Exception in thread: java.lang.OutOfMemoryError: request size bytes for reason. Out of swap space?
OutOfMemoryError: “request size bytes for reason. Out of swap space” indicates that allocation from the native heap failed. 


#####Exception in thread: java.lang.OutOfMemoryError: Compressed class space
If you working on 64-bit platforms a pointer to class metadata can be represented by a 32-bit offset (by using vm option UseCompressedClassPointers - This vm option is enabled by default).

If vm option is kept enabled then amount of space available for class metadata is fixed (i.e. specified by vm option)

If amount of space available for class metadata is exceeds CompressedClassSpaceSize, then java.lang.OutOfMemoryError Compressed class space is thrown.


#####Exception in thread: java.lang.OutOfMemoryError: reason stack_trace_with_native_method
Whenever this OutOfMemoryError is thrown >
a stack trace is printed
In this stack top frame is a native method
Then this OutOfMemoryError indicates that a native method has encountered an allocation failure.


#####Out of memory:Kill process or sacrifice child
OutOfMemoryError : kill process or sacrifice occurs when one of the process consumes too much virtual memory and makes OS unstable, than OS decides to kills that process.
>Increasing swap space can solve this OutOfMemoryError.

#####Exception in thread : java.lang.OutOfMemoryError: permgen
Generally when we are facing java.lang.OutOfMemoryError - Java permgen space, then we need to change permgen size of tomcat or eclipse or JVM wherever you are facing this error.
