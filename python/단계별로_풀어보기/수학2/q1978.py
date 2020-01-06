# 1978 - 소수찾기

valueNum = int(input())
ListNum = list(map(int,input().split()))

lst = []

for i in range(2, 1001):
    lst.append(i)

for i in range(2, 1001):
    for z in range(2, int(1000/i)+1):
        if i*z in lst:
            lst.remove(i*z)

n = 0
for i in ListNum:
    if i in lst:
        n = n + 1

print(n)
        