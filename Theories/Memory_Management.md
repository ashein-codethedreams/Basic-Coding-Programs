# Memory Management

Memory management is a critical concept in programming that deals with the allocation and deallocation of memory resources.

## 1. Stack Memory

- Used for static memory allocation.
- Stores local variables and function calls.
- Fast but limited in size.

## 2. Heap Memory

- Used for dynamic memory allocation.
- Stores objects, data structures like linked lists, etc.
- Requires manual allocation and deallocation in languages like C/C++ (`malloc`, `free`), while languages like Java have automatic garbage collection.

## 3. Garbage Collection

- A process by which a programming language automatically reclaims memory that is no longer in use.
- In languages like Java and Python, garbage collection prevents memory leaks by freeing objects that are no longer referenced.

## 4. Memory Leaks

- Occurs when a program fails to release memory that is no longer needed, causing the system to run out of memory over time.

## 5. Pointer Concepts (in C/C++)

- **Pointer**: A variable that stores the memory address of another variable.
- **Null Pointer**: A pointer that points to nothing.
- **Dangling Pointer**: A pointer that references memory that has already been freed.

Example:

```c
int* ptr = (int*) malloc(sizeof(int)); // Allocating memory
*ptr = 10;  // Using the pointer
free(ptr);  // Freeing the memory
ptr = NULL; // Avoiding a dangling pointer
```
