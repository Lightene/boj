# 1065 - 한수

a = int(input()) #input 값
list_ = []

def Checking(place):
    if place[2] < place[0]:
        temp = place[0]
        place[0] = place[2]
        place[2] = temp
    value = int(place[1] - place[0])
    value = value + place[1]
    return 1 if value == place[2] else 0

if(a <= 99):
    print(a)
else:
    cnt = 99

    if 1000 == a: a = a-1

    for i in range(100,a+1):
        place_value = []
        place_value.append(int(i/100))
        i = i-(place_value[0]*100)
        
        place_value.append(0 if i < 10 else int(i/10))
        i = i-(place_value[1]*10)
        
        place_value.append(i)
        
        cnt = cnt + Checking(place_value)
    print(cnt)