# problem 1541 ... 콜렉트 콜..

line = input().split('-')
result = 0

if line[0].find('+'):
    result = sum(map(int, line[0].split('+')))
else:
    result = int(line[0])


for i in line[1:]:
    result -= sum(map(int, i.split('+')))

print(result)
