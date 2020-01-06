# 2581 - 소수

m = int(input())
n = int(input())

lst = []

for i in range(2,10001):
    lst.append(i)

for i in range(2, 10001):
    for z in range(2, int(10000/i)+1):
        if i*z in lst:
            lst.remove(i*z)

minValue = 0
result = 0

for i in reversed(lst):
    if m<=i and n>=i:
        minValue = i
        result= result + i

if minValue == 0 and result == 0:
    print(-1)
else:
    print(result)
    print(minValue)