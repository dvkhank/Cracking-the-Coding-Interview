# Arrays and Strings
---
- ## Hash Table
  A hash table is a data structure that maps **keys to values** (like dictionnary)
  - **Look up time** : **Ideal** : O(1), **Worst** : O(N) - N is number of keys
  - **Hash function** : Convert values to key (Mostly use % modulo)
    - **Good hash function** :
          1. **Easy to compute**
          2. **Evenly distributed**
          3. **Colision rarely occurs**
  - **Process** :
      - Compute the hash codes by using hash function
      - Map the hash code to an index in array (2 different hash codes maybe have the same index). Because values are infinite (123, "A",909...) but key (index) is finite (Array[7])
   ![Hình ảnh đẹp](/images/demo-hashkey.png)
  - **Collsion** : 2 different keys have the same hash code
  
    * #### Notes :
      * When we use **modulo(%) P(prime)**, the result will only between **0 and P-1**
    * **How to solve collsion ?**
      * **Chaining method** : Use linked list. Every index (bucket) in array is a linked list
       ![Hình ảnh đẹp](/images/demo-chaining.png)

        * Direct chaining : 
        * Unite chaining :    
      * **Open adressing** :  
  
---
# ArrayList and Resizable Arrays
- The size is defined and **fixed** when created
- When array is full, another array will double in size and copy that array. Each doubling takes **O(n) time**. However, the doubling occurs rarely so amortized (thời gian trung bình) insertion time is still O ( 1)
- For example : When **array1[100]** is full, we create another array that doubles in size and **copy array - O(100) time**. Because we rarely double size and more in doing insertion. The result **array2[200]**.Then we can **insert 1-100 values - O(1) time** 
- Chi phí trung bình (amortized cost) được tính bằng cách chia **tổng chi phí** cho **tổng số lần thêm phần tử**:
\[
\frac{O(100) + O(100)}{100} = O(2) = O(1)
\]
- > Inserting N elements takes O(N) work total. Each insertion is 0(1) on average, even though some insertions take O (N) time in the worst case.
## Feature
* #### Pros :
  * Look up time fast (**values** that are **stored next to each other** in an array)
* #### Cons : 
  * Inserting and deleting are hard
---
# String
- String in Java is a list of Unicode characters (each 2 bytes)
- **Immutable** : Values will not change. If we do change (concat) then Java will create another object in memory area to store the result.
- **Mutable** Values will change on the object. If we do change(concat) then Java will change values on that object and don't create any new object in memory area.
### Problem when we concat string :
![Hình ảnh minh họa](/images/problem-concat.jpg)
When we change values of string, it is not change on that string. In fact, it creates another string and references to variable on stack.
#### => Solution : use StringBuilder
