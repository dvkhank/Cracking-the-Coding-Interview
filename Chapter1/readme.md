# Arrays and Strings

---

## Hash Table

A hash table is a data structure that maps **keys to values** (like dictionnary)

- **Look up time** : **Ideal** : O(1), **Worst** : O(N) - N is number of keys
- **Hash function** : Convert values to key (Mostly use % modulo)
  - **Good hash function** :
    - **Easy to compute**
    - **Evenly distributed**
    - **Colision rarely occurs**
- **Process** :
  - Compute the hash codes by using hash function
  - Map the hash code to an index in array (2 different hash codes maybe have the same index). Because values are infinite (123, "A",909...) but key (index) is finite (Array[7])
    ![Hình ảnh đẹp](/images/demo-hashkey.png)
- **Collsion** : 2 different keys have the same hash code

  - #### Notes :
    - When we use **modulo(%) P(prime)**, the result will only between **0 and P-1**
  - **How to solve collsion ?**

    - **Chaining method** : Use linked list. Every index (bucket) in array is a linked list
      ![Hình ảnh đẹp](/images/demo-chaining.png)

      - Direct chaining :
      - Unite chaining :

    - **Open adressing** :

---

# ArrayList and Resizable Arrays

- **Array** : The size is defined and **fixed** when created
- **ArrayList** : The size is **resizable** when created
- When array is full, another array will double in size and copy that array. Each doubling takes **O(n) time**. However, the doubling occurs rarely so amortized (thời gian trung bình) insertion time is still O ( 1)
- For example : When **array1[100]** is full, we create another array that doubles in size and **copy array - O(100) time**. Because we rarely double size and more in doing insertion. The result **array2[200]**.Then we can **insert 1-100 values - O(1) time**
- Chi phí trung bình (amortized cost) được tính bằng cách chia **tổng chi phí** cho **tổng số lần thêm phần tử**:
  \[
  \frac{O(100) + O(100)}{100} = O(2) = O(1)
  \]
- > Inserting N elements takes O(N) work total. Each insertion is 0(1) on average, even though some insertions take O (N) time in the worst case.

## Feature

- #### Pros :
  - Look up time fast (**values** that are **stored next to each other** in an array)
- #### Cons :
  - Inserting and deleting are hard

---

# String

- String in Java is a list of Unicode characters (each 2 bytes)
- **Immutable :** Values (Heap) will not be changed. If we do change (concat) then Java will create another object in memory area to store the result. Therefore, we have to use another variable to get the result after processing string.
  - In fact, **immutable can save our data**
  - For example : We have 3 variables a, b, c that are "Hello". When we create a string variable, Java will find in String Pool if that string is existed. If so, that will have the reference of existed string.
    ![Hình ảnh đẹp](/images/stringpool.jpg)
  - **What happen if string is mutable ? :** If variable C change the value of string to "Hi". Then **all variables have the same reference** : a,b,c **are changed**
- **Mutable :** Values(Heap) will be changed. If we do change(concat) then Java will change values on that object and don't create any new object in memory area.

### Problem when we concat string :

- [Review Heap and Stack](https://github.com/dvkhank/Cracking-the-Coding-Interview/tree/main/Java)
  ![Hình ảnh minh họa](/images/problem-concat.jpg)
- When we change values of string, it is not change on that string. In fact, it creates another string and references to variable on stack.

#### => Solution : use StringBuilder

#### => Note 27/07 : Find Shortcut, key features...

- Books:

  - Effective Java
  - 23 design patterns, Gang of four.

- https://beratyesbek.medium.com/item-2-effective-java-consider-a-builder-when-faced-with-many-constructor-parameters-2ba602cee996
- Objects and string equality in Java.
- Early return: https://www.reddit.com/r/coding/comments/i44y0k/return_early_pattern/?rdt=56463
- https://viblo.asia/p/tim-hieu-ve-radix-sort-va-cach-implement-thuat-toan-nay-trong-swift-E375zk0PKGW
- https://stackoverflow.com/questions/20443997/how-to-use-jmh-with-gradle
- https://leetcode.com/problems/valid-anagram/solutions/3687854/3-method-s-c-java-python-beginner-friendly

Home works:

- study above links and concepts.
- rework all the current algorithm and test cases, learn a bit about related features (Stream, JUnit parameterize tests).
- rewrite the benchmark of `CheckPermutation` using JMH to better understand the different in time and memory usage.
- Learn to use IDE shortcut, productivity features more efficient.
