# TODO: 세번째 안

from operator import itemgetter

city = int(input())  # 도시 수

L = list(map(int, input().split()))  # 도시 이동시 필요한 리터
L_pay = list(map(int, input().split()))  # 도시에서 판매하는 리터당 가격

temp = L_pay[0]
result = 0

for i in range(city-1):
    if temp > L_pay[i]:
        temp = L_pay[i]
    result += temp * L[i]
print(result)

# city_ = 100001
# for i in range(0, city-1):
#     if city_ > L_pay[i]:
#         city_ = L_pay[i]
#     result += city_ * L[i]
#
# print(result)

# -------------------------

# TODO: 두번째 안

# from operator import itemgetter
#
# cityNum = int(input())  # 도시 수
#
# move_liter = list(map(int, input().split()))  # 도시 이동시 필요한 리터
# city_liter_pay = list(map(int, input().split()))  # 도시에서 판매하는 리터당 가격
#
# city_pay_to_dict = {name: index for index, name in enumerate(city_liter_pay[1:cityNum - 1])}
# # TODO: 요놈이 문제이므로 Tuple 형태로 바꾸고 sort 변수의 Sorted 방식도 tuple로 한다면 tuple 에 맞게 sort 해줘야 하지 않을까 싶다.
# # (도시 기름 가격 : 도시 위치 값 - 1)
#
# sort = sorted(city_pay_to_dict.items())
# city_max_value = max(sort, key=itemgetter(1))[1]
# # 처음 시작하는 도시의 가격보다 가격이 낮은 도시들 중,
# # 가격이 낮은 순서로 정렬 된 상태에서 처음 도시보다 제일 멀리있는 도시 뒤에 있는 값들은 버린다.
#
# city = [item for item in sort if city_liter_pay[0] >= item[0] and city_max_value >= item[1]]
#
# result = city_liter_pay[0] * sum(move_liter[0:city[0][1] + 1])
# for i in range(len(city)-1):
#     result += city[i][0] * sum(move_liter[city[i][1] + 1:city[i+1][1] + 2])
#
# print(result)
#
# # TODO: 위의 코드가 안되는 이유는 dictionary 로 변환하면서
# # TODO: key값이 중복되기 때문에 dictionary 의 특성으로 인해서 중복 key 는 저장이 안되므로
# # TODO: 프로그램이 비정상적으로 돌아감.




# -------------------------
# TODO: 첫번째 안

# 최소 값 전의 이득을 볼 수 있는 장소에 대해서 생각하지 않았다...

# cityNum = int(input())  # 도시 수
#
# move_liter = list(map(int, input().split()))  # 도시 이동시 필요한 리터
# city_liter_pay = list(map(int, input().split()))  # 도시에서 판매하는 리터당 가격
# city_liter_pay_sort = sorted(city_liter_pay[0:cityNum-2])
#
# result = 0
#
# for i in range(cityNum - 1):
#     if city_liter_pay[i] == city_liter_pay_sort:
#         result += sum(move_liter[i:cityNum - 1]) * city_liter_pay[i]
#     else:
#         result += city_liter_pay[i] * move_liter[i]

# print(result)
