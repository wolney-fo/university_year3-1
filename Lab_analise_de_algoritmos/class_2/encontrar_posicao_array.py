def getIndex():
    while True:

        num = int(input())

        if num == -1:
            break

        array = list(map(int, input().strip().split()))

        if num > array[-1]:
            return len(array)

        for i in range(0, len(array)):
            if array[i] >= num:
                return i
                break

print(getIndex())
