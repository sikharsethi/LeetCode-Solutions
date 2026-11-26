class Solution {
    public boolean canAliceWin(int n) {
       int stonesToRemove = 10;
       int moves = 0;
       while(n >= stonesToRemove && stonesToRemove > 0) {
        n -= stonesToRemove;
        stonesToRemove--;
        moves++;
       } 
       return moves % 2 == 1;
    }
}