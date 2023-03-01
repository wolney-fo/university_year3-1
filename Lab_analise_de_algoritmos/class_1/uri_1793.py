# Escada Rolante

STAIR_RUNNING_TIME = 10     # seconds

def escalator():
    while True:

        qty_of_peolpe = int(input())

        if (qty_of_peolpe == 0):
            break

        times = list(map(int, input().split()))

        time_sum = 0

        for i in range(len(times)):
            # last index
            if (i == len(times)-1):
                time_sum += STAIR_RUNNING_TIME
                break

            # interfere in the next
            if (times[i+1] < (times[i] + STAIR_RUNNING_TIME)):
                time_sum += times[i+1] - times[i]

            # does not interfere in the next
            else:
                time_sum += STAIR_RUNNING_TIME
        
        print(time_sum)


escalator()