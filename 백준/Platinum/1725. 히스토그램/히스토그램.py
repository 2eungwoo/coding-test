def largest_rectangle_divide(hist, left, right):
    if left == right:
        return hist[left]

    mid = (left + right) // 2

    left_area = largest_rectangle_divide(hist, left, mid)
    right_area = largest_rectangle_divide(hist, mid + 1, right)
    max_area = max(left_area, right_area)

    l, r = mid, mid + 1
    height = min(hist[l], hist[r])
    max_area = max(max_area, height * 2)

    while left < l or r < right:
        if r < right and (l == left or hist[l - 1] < hist[r + 1]):
            r += 1
            height = min(height, hist[r])
        else:
            l -= 1
            height = min(height, hist[l])
        
        max_area = max(max_area, height * (r - l + 1))

    return max_area

n = int(input().strip())
hist = []
for _ in range(n):
    hist.append(int(input().strip()))

print(largest_rectangle_divide(hist, 0, n - 1))
