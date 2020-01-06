# 2748 - 피보나치 수 2

n = int(input())

fiboList = []

fiboList.append(0)
fiboList.append(1)

for i in range(2,n+1):
    fiboList.append(fiboList[i-1]+fiboList[i-2])

print(fiboList[n])