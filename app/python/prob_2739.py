left = int(input())
for i in range(9):
    right = i + 1
    result = left * right
    print(('{0} * {1} = {2}').format(left, right, result))