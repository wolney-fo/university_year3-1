def quicksort(list_):
    if len(list_) <= 1:
        return list_
    
    pivot = list_[len(list_) // 2]
    
    left = [value for value in list_ if value < pivot]
    middle = [value for value in list_ if value == pivot]
    right = [value for value in list_ if value > pivot]

    return quicksort(left) + middle + quicksort(right)


print(quicksort([1,0,4,9,6,5,8,2,3,7,0,9,1,7,6,4,8,2,3,5,3,7,4,6,0,1,9,8,2,5]))