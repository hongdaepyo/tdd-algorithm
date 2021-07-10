import sys
next = -1
input = int(sys.stdin.readline())
prev = input
result = 0;
while input != next:
    if prev < 10:
        next = prev * 11
    else:
        next = (prev % 10) * 10 + sum(map(int, list(str(prev)))) % 10
    prev = next
    result += 1

print(result)