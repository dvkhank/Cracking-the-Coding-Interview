# JAVA

---

## Java Virtual Machine

### Notes

- **Complile** : turns your source code into machine code (0 and 1) in a file. Then we start program on that file
- **Interpret** : reads and executes the source code line by line, turning it into machine code (0 and 1) on the fly.
- **Objects** : Include properties and behaviors

### => JAVA is both

## How JVM works :

![Hình ảnh minh họa](/Java//images//JVM.jpg)

- We only need to bring bytecode file (.class) to execute on any machines that installed JVM
- JVM excecutes the program on bytecode (.class)

## What does JVM include ?

![Hình ảnh minh họa](/Java//images/insideJVM.png)

- **Class Loader :** loads class file (.class - bytecode) to JVM memory
- **JVM Memory (Runtime Data Areas) :** Memory areas at runtime which is provided by OS
  - Method Area : **Store** information about loaded **classes**.
    - For example : name of class, methods, properties...
    - 1 JVM provides Method Area
  - **Heap Area :** Store **objects** like string, array, instance of class
    - 1 JVM provides Heap Area
    - Big size, based on objects in runtime
  - **Stack Area :** Store local variables
    - Every single **thread** has its own **Stack**
    - When **a method is called**, JVM creates a **stack frame** for that method. In that frame, **store local variables** for that method. When method is **not used** anymore, it **automatically deleted**
    - Small size
    - For example : byte, int, long, float, double, char and **bits that references to objects on Heap Area**.
  - PC Register : Stores the address of the current instruction (lệnh) being executed and let JVM knows what next
    - Every single thread in JVM has it own PC Register **(Multi-Thread)**
  - Native Method Stack: Supports the execution of native methods (written by C, C++). Methods are worked directly with OS
    - For example : `System.out.println` là một phương thức gốc, vì thực hiện các thao tác I/O trực tiếp với hệ điều hành. JVM sẽ sử dụng Native Method Stack để thực thi phương thức này
  - Execution Engine : Converts bytecode to machine code and executes them
  - Garbage Collector : automatically reclaims memory by deleting objects that are no longer in use (i.e., objects with no references) **from the Heap**, making that memory available for new objects.

## Heap and Stack in JVM

- When we start program, JVM require OS provide memory on RAM to work.
- After that, JVM will devide memory into 2 type : **Stack** and **Heap**
  ![Hình ảnh minh họa](/Java//images/demo-stackandheap.jpg)

---
