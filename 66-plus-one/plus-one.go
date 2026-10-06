package main

func plusOne(digits []int) []int {
    // Iterate from the last digit to the first
    for i := len(digits) - 1; i >= 0; i-- {
        // If the digit is less than 9, increment it and return
        if digits[i] < 9 {
            digits[i]++
            return digits
        }
        // If the digit is 9, it becomes 0
        digits[i] = 0
    }

    // If the loop finishes, all digits were 9 (e.g., [9, 9, 9] ->)
    // We prepend 1 to the beginning of the slice
    return append([]int{1}, digits...)
}
