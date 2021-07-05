import sys
count = int(sys.stdin.readline())

for i in range(1, count + 1):
    input = sys.stdin.readline().split()
    template = 'Case #{0}: {1} + {2} = {3}'
    print(template.format(i, input[0], input[1], sum(map(int, input))))