# 1003 - 피보나치 함수

lstNum = [1,0]

for i in range(2,42):
    lstNum.append(lstNum[i-2] + lstNum[i-1])


N = int(input())
for i in range(0,N):
    s = int(input())
    print(lstNum[s], lstNum[s+1])