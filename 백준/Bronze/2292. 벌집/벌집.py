# 벌집

put = int(input())

layer = 2
cnt = 7

if 1 <= put or put <= 1000000000:
    if put == 1:
        print(1)
    else:
        while cnt < put:
            cnt = cnt + layer * 6
            layer = layer + 1
        print(layer)