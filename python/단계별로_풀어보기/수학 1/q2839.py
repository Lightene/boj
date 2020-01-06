# 2839 - 설탕 배달

kg = int(input())
_kg = 0
i= 1
# 5kg , 3kg
# 5의 배수 체크

while True:
    try:
        # 3의 배수 and 5의 배수 체크
        # 3의 배수 값을 뺀 후 나머지 값을 5의 배수로 체크
        if not kg%5:
            print(int(kg/5))
            break

        if i > 4 or _kg < 0:
            print(-1)
            break
        
        _kg = kg - (3 * i)
        
        if not _kg%5:   #True : 0일 경우
            print(i+int(_kg/5))
            break
        if i > 4 or _kg < 0:
            print(-1)
            break
        else:
            i += 1
            continue
    except:
        break