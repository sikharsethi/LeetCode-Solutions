class Solution {
    public void duplicateZeros(int[] arr) {
       int possibleZeros = 0;
       int length = arr.length - 1;

       for (int left = 0; left <= length - possibleZeros; left++) {
        if (arr[left] == 0) {

            if (left == length-possibleZeros) {
                arr[length] = 0;
                length -= 1;
                break;
            }

            possibleZeros++;
        }
       }
       int last = length - possibleZeros;
       for (int i = last; i >= 0; i--) {

        if (arr[i] == 0) {
            arr[i + possibleZeros] = 0;
            possibleZeros--;
            arr[i + possibleZeros] = 0;
        } else {
            arr[i + possibleZeros] = arr[i];
        }

       }
    }
}