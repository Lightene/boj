# 2749 - 피보나치 수 3

N = int(input())
N = N % 1500000

lstNum = [0,1]

cnt = 2

for i in range(cnt,N+1):
    lstNum.append(lstNum[i-1]+lstNum[i-2])
    lstNum[i] = lstNum[i]%1000000
print(lstNum[N])