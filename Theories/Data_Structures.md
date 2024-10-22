# Data Structures

Data structures are ways to organize and store data so that it can be accessed and modified efficiently.

## 1. Array

- A collection of elements, stored in contiguous memory locations.
- Elements are accessed by their index.
- Example:
  - `int arr[] = {1, 2, 3, 4};`

## 2. Linked List

- A linear data structure where each element (node) points to the next element.
- Types:
  - **Singly Linked List**: Each node points to the next node.
  - **Doubly Linked List**: Each node points to both the next and previous nodes.

## 3. Stack

- A LIFO (Last In, First Out) data structure.
- Operations:
  - **Push**: Add an element to the top.
  - **Pop**: Remove the top element.
  - **Peek**: View the top element without removing it.
- Example: Undo operations in text editors.

## 4. Queue

- A FIFO (First In, First Out) data structure.
- Operations:
  - **Enqueue**: Add an element to the rear.
  - **Dequeue**: Remove the front element.
- Example: Task scheduling, printer queue.

## 5. Hash Table

- Stores key-value pairs using a hash function to compute the index.
- Common operations: Insertion, deletion, and search are generally O(1) on average.

## 6. Binary Tree

- A hierarchical structure where each node has at most two children.
- Types:
  - **Binary Search Tree (BST)**: A tree where the left child is smaller than the parent, and the right child is greater.
  - **Heap**: A tree where the parent is larger (Max-Heap) or smaller (Min-Heap) than its children.

## 7. Graph

- A set of nodes (vertices) connected by edges.
- Types:
  - **Directed**: Edges have a direction.
  - **Undirected**: Edges don't have direction.
- Example: Social networks, maps, etc.
