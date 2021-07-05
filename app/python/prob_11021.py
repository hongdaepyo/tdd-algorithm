import sys
count = int(sys.stdin.readline())

for i in range(1, count + 1):
    input = sys.stdin.readline().split()
    template = 'Case #{0}: {1}'
    print(template.format(i, sum(map(int, input))))