# problem  11047

N, K = map(int, input().split())

coin = []
coin_count = 0

for _ in range(N):
    coin.append(int(input()))

for i in coin[::-1]:
    if K == 0:
        break

    if K < i:
        continue

    coin_count = coin_count + (K // i)

    K -= (K // i) * i

print(coin_count)
