class Solution {
    public int countBattleships(char[][] board) {
    // IMPORTANT
    // X represents part of the ship
    // If there is only one X, it is the entire ship
    // If there are multiple X, that means, this ship is long and occupies multiple cells in the array
    // And ship can be straight only, it can't bend
    // Ship can be of width 1 only
    // Either XXXXXX with length 6 and width 1
    // Or
    // X
    // X
    // X
    // Length 3 and width 1 like this
    
    // number of ships ready for battle
    int count = 0;
    
    // For rows
    for(int i=0;i<board.length;i++){
        
        // for columns
        for(int j=0;j<board[0].length;j++){
            
            // Check if there is a ship
            // We only count the head of the ships
            // once we find the head, we dont care how long that ship is
            
            if(board[i][j]=='X') 
                
                // Make sure that either it is the top most index
                // or it has no ships above it
                // If there is a ship above this ship
                if(i==0 || board[i-1][j]!='X'){
                    
                    
                    // make sure that this X was encountered at the left most cell or
                    // there is a gap of atleast one cell between the ship adjacent to it
                    if(j==0 || board[i][j-1]!='X'){
                        
                        // found a battle ship
                        count++;
                    }
                }
        }
            
    }
        
    return count;
}
}
