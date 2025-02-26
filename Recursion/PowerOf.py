def power(b,p):
    if p == 1: return b
    
    t = power(b,int(p/2)) * power(b,int(p/2))
    
    if(p % 2 == 0):
        return t
    else:
        return t * b

print("Enter a base: ")
b = int(input())
print("Enter a power: ")
p = int(input())

print(f"\n{b}^{p} = {power(b,p)}")