# 🔍 Java Search Algorithms

This repository contains basic implementations of search algorithms in Java. Each algorithm is implemented in a separate file and demonstrates how to search for an element in an array.

---

## 📁 Files Included

| File Name           | Description                                |
|---------------------|--------------------------------------------|
| `linearSearch.java` | Implements Linear Search                   |
| `binarySearch.java` | Implements Binary Search (Iterative/Recursive) |

---

## 🔎 Search Algorithms Explained

### 1. 📘 Linear Search
- **Description**: Scans each element in the array until the target is found.
- **Time Complexity**:
  - Best Case: O(1)
  - Average/Worst Case: O(n)
- **Space Complexity**: O(1)
- **Sorted Array Required**: ❌ No
- **Stable**: ✅

### 2. 📗 Binary Search
- **Description**: Efficient search on sorted arrays by repeatedly dividing the search interval in half.
- **Time Complexity**:
  - Best Case: O(1)
  - Average/Worst Case: O(log n)
- **Space Complexity**:
  - Iterative: O(1)
  - Recursive: O(log n) (due to call stack)
- **Sorted Array Required**: ✅ Yes
- **Stable**: Not applicable

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/java-search-algorithms.git
   cd java-search-algorithms
   ```

2. Compile the Java files:
   ```bash
   javac *.java
   ```

3. Run the program:
   ```bash
   java linearSearch
   java binarySearch
   ```

---

## 🧠 Example Use Case

For both programs, the user is prompted to enter:
- The size of the array
- The elements of the array
- The target element to search for

Output:
- The index (position) of the element if found
- Message saying "Element not found" otherwise

---

## 📚 References

- [GeeksforGeeks - Linear Search](https://www.geeksforgeeks.org/linear-search/)
- [GeeksforGeeks - Binary Search](https://www.geeksforgeeks.org/binary-search/)

