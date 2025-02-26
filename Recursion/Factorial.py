def factorial(b):
    if b == 0: return 1
    return factorial(b-1) * b

print("Enter a base: ")
b = int(input())

print(f"\n{b}! = {factorial(b)}")