def my_sort(list_):

    if len(list_) <= 1:
        return list_

    sortedList = [None for _ in range(len(list_))]

    for i in range(len(list_)):
        toTheLeft = [x for x in list_ if x < list_[i]]
        sortedList[len(toTheLeft)] = list_[i]

    return sortedList
	

if __name__ == "__main__":

    for i in range(10):

        list_ = [int(x) for x in input().split(",")]
        sort_list = my_sort(list_)
        print(','.join(map(str,sort_list)))