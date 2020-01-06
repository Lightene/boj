# 4673 - 셀프넘버

solo = []
count_a = 10000
# 40000 byte
def functions(n):
    global solo
    b = 0
    c = 0
    if(n <= count_a):
        for i in str(n):
            b = b + int(i)
            c = b
        b = n + b
        solo.append(b)
    else:
        return
    n = b
    functions(n)

for i in range(1, count_a+1):
    functions(i)

list_solo = list(set(solo))
list_sort = sorted(list_solo)

for i in range(1,count_a+1):
    try:
        if(list_sort.index(i) == ValueError):
            pass
    except:
        print(i)