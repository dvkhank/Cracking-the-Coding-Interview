# Cracking-the-Coding-Interview

## ![](https://images.viblo.asia/87b56be6-44b4-4fa4-8af8-52e88c5e9896.jpg)

# About

- Book : https://github.com/black-shadows/Cracking-the-Coding-Interview
- This repo contains my reading notes and solutions for the exercises.
- The solution code is written in Java

---

# Notes and status

### Data Structures

- [Chapter 1 : Arrays and Strings](https://github.com/dvkhank/Cracking-the-Coding-Interview/tree/main/Chapter1)
- Chapter 2 : Linked Lists
- Chapter 3 : Stacks and Queues
- Chapter 4: Trees and Graphs

### Concepts and Algorithms

- Chapter 5 : Bit Manipulation
- Chapter 6 : Math and Logic Puzzles
- Chapter 7 : Object-Oriented Designe
- Chapter 8 : Recursion and Dynamic Programming
-

---

# Thuật toán

## Độ phức tạp thời gian (Time Complexity)

**Định nghĩa:** Độ phức tạp thời gian là thước đo về số lượng thao tác (hay bước thực thi) mà một thuật toán cần thực hiện để hoàn thành nhiệm vụ của mình khi đầu vào tăng dần.

- Khi nói đến độ phức tạp là O(g(n) nghĩa là chỉ định **thời gian tối đa** của thuật toán khi kích thước **dữ liệu lớn dần**

**Tính hiệu quả:**

- Thường dựa trên thời gian > sử dụng bộ nhớ
- Trường hợp tốt nhất ? xấu nhất ?

**Chi phí thực hiện:** **phép gán, so sánh, đổi chỗ**

## Các loại:

- **O(1) (Hằng số):** Thời gian thực thi **không phụ thuộc vào kích thước đầu vào**. Ví dụ: Truy cập một phần tử trong mảng.
- **O(log n) (Logarit):** Thời gian thực thi **tăng theo logarit** của kích thước đầu vào. Ví dụ: Tìm kiếm nhị phân.
- **O(n) (Tuyến tính):** Thời gian thực thi tăng theo **tỷ lệ tuyến tính** với kích thước đầu vào. Ví dụ: Duyệt mảng.
- **O(n log n):** Thời gian thực thi **tăng theo `n log n`**. Ví dụ: Merge Sort, Quick Sort (trung bình).
- **O(n^2) (Bình phương):** Thời gian thực thi **tăng theo bình phương** của kích thước đầu vào. Ví dụ: Bubble Sort, Selection Sort.
- **O(2^n) (Hàm mũ):** Thời gian thực thi **tăng theo hàm mũ** của kích thước đầu vào. Ví dụ: Giải bài toán tối ưu hóa sử dụng phương pháp quay lui (backtracking).
- **O(n!) (Giai thừa):** Thời gian thực thi **tăng theo giai thừa** của kích thước đầu vào. Ví dụ: Giải bài toán liệt kê hoán vị.
