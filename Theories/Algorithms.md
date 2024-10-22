# Algorithms

Algorithms are step-by-step instructions to solve problems.

### Sorting Algorithms:

- **Bubble Sort**: Repeatedly swaps adjacent elements if they are in the wrong order.
  Example:

  ```java
  for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
          }
      }
  }

  ```

- **Quick Sort**: Selects a pivot element and partitions the array around the pivot.
  Example:

  ```java

  void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
  }


  ```

- **Merge Sort**: Divides the array into halves, sorts each half, then merges them.
  Example:

  ```java
  void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          int pi = partition(arr, low, high);
          quickSort(arr, low, pi - 1);
          quickSort(arr, pi + 1, high);
      }
  }

  ```

### Searching Algorithms:

- **Linear Search**: Scans each element until the desired one is found.
  Example:

  ```java
  int linearSearch(int[] arr, int key) {
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == key) {
              return i;
          }
      }
      return -1;
  }
  ```

- **Binary Search**: Efficiently searches in a sorted array by dividing the search space in half.
  Example:

  ```java
  int binarySearch(int[] arr, int key) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
  }

  ```

### Time Complexity:

- **O(1)**: Constant time (no matter input size).
- **O(n)**: Linear time (grows with input size).
- **O(log n)**: Logarithmic time (efficient, divides problem size each step).
