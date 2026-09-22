**What is true about threads?**


- Threads consumes CPU in best possible manner
- Threads enables multi processing.
- Multi threading reduces idle time of CPU
- All

***Ans - ALL***

**A thread can acquire a lock by using which reserved keyword?**

- volatile
- synchronized
- locked
- none

***Ans - synchronized***



Q3 - Q15, 13 MEDIUM level difficulty questions 2 mark each. 2 * 13 = 26 marks

How many threads can a process contain?

- 1
- 2
- multiple
- none

***Ans - multiple***

What is sometimes also called a lightweight process?

- Thread
- Process
- JVM
- 

***Ans - Thread***

What are valid points about thread

- Thread are subdivision of Process.
- One or more Threads runs in the context of process.
- Threads can execute any part of process. And same part of process can be executed by multiple Threads.
- All

***Ans - All***

What are valid point about processes

- Processes have their own copy of the data segment of the parent process
- Threads have direct access to the data segment of its process
- Processes have their own address
- All of these

***Ans - All of these***

Which is thread safe?

- StringBuffer
- StringBuilder
- All
- None

***Ans - StringBuffer***

How can we create Thread

- By Extending Thread class
- Implementing Runnable interface
- By using Executor framework - which can internally form threads
- All

***Ans - All***

Which of these is not a Thread state?

- New
- Runnable
- sleep
- terminated

***Ans - sleep***

synchronized instance methods acquire lock on?

- object
- class
- All
- None

***Ans - object***

What state does Thread enter in when it has been created and started?

- New
- Runnable
- Running
- Waiting

***Ans - Runnable***

Which method can be used to find whether Thread hasn't entered dead state?

- isAlive()
- isRunning()
- isNotDead
- All

***Ans - isAlive()***

What is valid about threads

- Threads have their own heap allocated are- 
- Threads have their own stack.
- Threads doesn't have own stack.
- None

***Ans - Threads have their own stack.***

How can you ensure all threads that started from main must end in order in which they started and also main should end in last

- join() method
- sleep() method
- wait() method
- run() method

***Ans - join() method***

Which of these is valid about threads in java

- Thread behaviour is unpredictable
- execution of Threads depends on Thread scheduler
- Same threading program may produce different output in subsequent executions even on same platform
- All

***Ans - All***



Q16 - Q20, 5 HARD level difficulty questions 3 mark each.       3 * 5 = 15 marks

Which method restarts the thread

- start()
- restart()
- restartThread()
- none

***Ans - none***

What is true about acquiring object lock before calling wait(), notify() and notifyAll()?

- it’s mandatory to acquire object lock before calling wait(), notify() and notifyAll() methods on object
- If we call wait(), notify() and notifyAll() methods without acquiring object lock i.e. from outside synchronize block then jav- lang.IllegalMonitorStateException is thrown at runtime.
- wait(), notify() and notifyAll() methods are always called from Synchronized block only
- all

***Ans - all***


What is difference between starting thread with run() and start() method?

- There is no difference
- When you call start() method, main thread internally calls run() method to start newly created Thread
- run() calls start() method internally
- None

***Ans - When you call start() method, main thread internally calls run() method to start newly created Thread***

What are valid statements for suspend() and resume() method?

- Suspend() method is deadlock prone.
- If the target thread holds a lock on object when it is suspended, no thread can lock this object until the target thread is resume- 
- If the thread that would resume the target thread attempts to lock this monitor prior to calling resume, it results in deadlock formation.
- All

***Ans - All***

How can Thread go from waiting to runnable state?

- notify/notifyAll
- When sleep time is up````
- Using resume() method when thread was suspended
- All

***Ans - All***


Part -2
-------------------------------------
##### Q1 - Q2, 2 EASY level difficulty questions 1 mark each. 1 * 2 = 2 marks

wait(), notify() & notifyAll() are methods of which class or interface?

- Thread class
- Runnable interface
- Object
- None

***Ans - Object***

When start() method is called on thread it enters ______ state.

- running
- runnable
- new
- waiting

***Ans - runnable***


Q3 - Q15, 13 MEDIUM level difficulty questions 2 mark each. 2 * 13 = 26 marks

What is time slicing in threads

- In time slicing, a thread executes for a certain predefined time and then enters runnable pool.
- Thread in runnable pool can enter running state when selected by thread scheduler.
- All
- None

***Ans - All***

Significance of Volatile keyword in java

- If a field is declared volatile, in that case the Java memory model ensures that all threads see a consistent value for the variable.
- Volatile caches methods
- All of these
- None

***Ans - If a field is declared volatile, in that case the Java memory model ensures that all threads see a consistent value for the variable.***

What is name of thread which calls main method

- mainThread
- Thread
- Thread-0
- main

***Ans - main***


Significance of synchronized variable

- synchronized variable doesn't exist
- synchronized variable are used in multi threading environment
- Prevents concurrent access to variables
- None

***Ans - synchronized variable doesn't exist***


What is pre-emptive scheduling in threads

- In pre-emptive scheduling, the highest priority thread executes until it enters into the waiting or dead state
- In pre-emptive scheduling, the low priority thread executes until it enters into the waiting or dead state
- In pre-emptive scheduling, the medium priority thread executes until it enters into the waiting or dead state
- Anyone may happen

***Ans - In pre-emptive scheduling, the highest priority thread executes until it enters into the waiting or dead state***


What will happen if two threads try to read same resource without synchronization in java

- It is not allowed in java
- It doesn't create any race condition
- Will create race condition
- None


***Ans - It doesn't create any race condition***

What are valid statements for daemon threads?

- User created threads are non daemon threads.
- JVM can exit when only daemon threads exist in system.
- Daemon threads are low priority threads which runs intermittently in background for doing garbage collection.
- All of these

***Ans -  All of these***


What will happen if two threads try to write to same resource without synchronization in java

- It is not allowed in java
- It doesn't create any race condition
- It will create race condition
- None

***Ans - It will create race condition***


How to use volatile methods in java?

- Prevents concurrent access to shared resources
- volatile methods are used in non-multithreading environment
- volatile methods doesn't exist
- None

***Ans - volatile methods doesn't exist***


Which tools could be used to analyse thread dumps

- VisualVM
- jstack
- All
- none

***Ans - All***


Which method can make Thread to go from running to waiting state

- wait()
- resume()
- notify()
- alive()

***Ans - wait()***


How Can we acquire lock on class?

- By acquiring lock on variables.
- By acquiring lock on instance variables.
- By acquiring lock on static method
- By acquiring lock on instance method

***Ans - By acquiring lock on static method***


What are valid statements for sleep method?

- when sleep() is called on thread it goes from running to waiting state and can return to runnable state when sleep time is up.
- sleep() is a static method, causes the currently executing thread to sleep for the specified number of milliseconds.
- thread need not to to acquire object lock before calling sleep() method
- All

***Ans - All***




Q16 - Q20, 5 HARD level difficulty questions 3 mark each.       3 * 5 = 15 marks

Which method can make Thread to go from running to waiting state?

- wait()
- sleep()
- suspend()
- All

***Ans - All***


What are valid statements for yield method?

- yield() method when called on thread gives a hint to the thread scheduler that the current thread is willing to yield its current use of a processor. The thread scheduler is free to ignore this hint.
- yield() method stops thread for unpredictable time.
- yield() is a static method, hence calling Threa- yield() causes currently executing thread to yiel- 
- All

***Ans - All***


What are valid statements about Constructor and synchronization in java?

- We can enclose constructor in try-catch block
- We can use use synchronized code in constructor
- Constructor can be synchronized
- None

***Ans - We can use use synchronized code in constructor***


Which method can be used to find that thread holds lock

- holdLock()
- lockHold()
- holdsLock(object)
- lockHold(object)

***Ans - holdsLock(object)***


What is addShutdownHook method in java

- addShutdownHook method registers a new virtual-machine shutdown hook.
- A shut down hook is a uninitialized and unstated threa- 
- When JVM initialises it will start all registered shutdown hooks
- None
***Ans - addShutdownHook method registers a new virtual-machine shutdown hook***


Set 3
--------

Can multiple threads exist on one object?

- Multiple threads can exist on same object
- Multiple threads cannot exist on same object
- Only 2 threads can exist on same object
- None

***Ans - Multiple threads can exist on same object***


What is deadlock in java?

- Deadlock is a situation where two threads on same object are waiting for each other to release lock holded by them on resources
- Deadlock is a situation where threads on different object are waiting for each other to release lock holded by them on resources
- None

***Ans - Deadlock is a situation where two threads on same object are waiting for each other to release lock holded by them on resources***




Q3 - Q15, 13 MEDIUM level difficulty questions 2 mark each. 2 * 13 = 26 marks

Which method can be used to handle uncaught runtime exception generated in run method?

- exceptionHandler()
- defaultExceptionHandler()
- setDefaultUncaughtExceptionHandler()
- catchException()

***Ans - setDefaultUncaughtExceptionHandler()***


What is valid statement about ThreadGroup

- When program starts JVM creates a ThreadGroup named main
- Unless specified, all newly created threads become members of the main thread group
- All
- None

***Ans - All***


What is minimum thread priority in java?

- -1
- 0
- 1
- 5

 ***Ans - 1***


What is maximum thread priority

- 10
- 12
- 5
- 8

***Ans - 10***

Q1 - Q2, 2 EASY level difficulty questions 1 mark each. 1 * 2 = 2 marks 
---

***What is race condition in java***

- Two threads try to execute earlier form sort of race.
- Race condition doesn't allow two threads to access same resource
- When more than one thread try to access same resource without synchronization causes race condition.
- None

***Ans -When more than one thread try to access same resource without synchronization causes race condition.***

***Which package consists of all inbuilt java exceptions?***

- java.lang.Thread
- java.io.Thread
- java.thread.Thread
- java.util.Thread

***Ans -java.lang.Thread***



Q3 - Q15, 13 MEDIUM level difficulty questions 2 mark each. 2 * 13 = 26 marks

***How Can we acquire lock on object?***

- By acquiring lock on instance variables.
- By acquiring lock on instance method
- By acquiring lock on static method
- By acquiring lock on static variables.

***Ans -By acquiring lock on instance method***

***What is valid about ThreadLocal***

- Every thread has its own ThreadLocal value that makes ThreadLocal value thread safe as well.
- Thread holds ThreadLocal value till it hasn’t entered dead state.
- ThreadLocal variables are thread safe and thread can see only it’s ThreadLocal value.
- All

***Ans -All***

***What is default priority of thread?***

- 5
- 0
- 1
- 10

***Ans -5***

***What is busy spin in java?***

- Applications must promote busy spin usage
- When one thread loops continuously waiting for another thread to signal.
- Busy spin is very good from performance point of view
- None

***Ans - When one thread loops continuously waiting for another thread to signal.***


***Green threads are not at all dependent on OS thread scheduler***
- true
- false

***Ans -True***

***Can we use this keyword in static method?***

- this keyword can be used in static method to access static variables only
- this keyword can't be used in static method
- this keyword can be used in static method
- None

***Ans - this keyword can't be used in static method***

***What are green threads in java?***

- Green threads are user-level threads
- Green threads are high level threads
- Green threads are OS level threads
- None

***Ans - Green threads are user-level threads***

***What is true about green threads in java?***

- Green threads were used till Java 2. Green threads are not at all dependent on OS thread scheduler
- Green threads provides multi-threading capabilities on platforms that don't provide multi-threading capability.
- Non-green threads have their own stack, but for Green threads memory is allocated from heap area.
- All

***Ans - All***



