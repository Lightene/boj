# problem 11399

N = int(input())
P = list(map(int, input().split()))

P.sort()

result = 0
waiting = 0

for item in P:
    waiting += item
    result += waiting

print(result)
