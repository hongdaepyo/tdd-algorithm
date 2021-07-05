count = int(input())
def cal():
    for _ in range(count):
        print((lambda a: int(a[0]) + int(a[1]))(input().split()))

cal()