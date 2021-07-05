import sys
count = int(sys.stdin.readline())

for _ in range(count):
    input = sys.stdin.readline()
    print(sum(map(int, input.split())))