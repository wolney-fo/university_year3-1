def my_sort(unsorted_list):
    n = len(unsorted_list)
    sorted_list = unsorted_list.copy()
    
    for i in range(1, n):
        j = i - 1
        key = sorted_list[i]
        while j >= 0 and key < sorted_list[j]:
            sorted_list[j+1] = sorted_list[j]
            j -= 1
        sorted_list[j+1] = key
    
    return sorted_list

	

if __name__ == "__main__":

    for i in range(10):

        list_ = [int(x) for x in input().split(",")]
        sort_list = my_sort(list_)
        print(','.join(map(str,sort_list)))