# problem 1931

N = int(input())
conference = []

for _ in range(N):
    o, t = map(int, input().split())
    conference.append((o, t))

conference.sort(key=lambda x: (x[1], x[0]))

last = 0
cnt = 0
for i, j in conference:
    if i >= last:
        cnt += 1
        last = j
print(cnt)

# for i in conference:
#     print(i)
