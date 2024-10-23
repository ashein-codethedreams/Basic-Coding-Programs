# Python program to print a right-angled triangle pattern

rows = int(input("Enter the number of rows: "))

# for i in range(1, rows + 1):
#     for j in range(1, i + 1):
#         print("*", end=" ")
#     print()


for i in range(rows, 0,-1):
    for j in range(1, i + 1):
        print("*", end=" ")
    print()   