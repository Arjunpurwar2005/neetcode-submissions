class Solution {
    public boolean isValidSudoku(char[][] board) {
        return isRow(board) && isColumn(board) && isSquare(board);
        

        
    }
    public boolean isRow(char[][] board) {
    HashSet<Character> rowSet = new HashSet<>();
    
    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            char val = board[r][c];
            
            if (val == '.') {
                continue;
            }
            
            if (rowSet.contains(val)) {
                return false;
            }
            
            rowSet.add(val);
        }
        rowSet.clear();
    }
    return true;
}

public boolean isColumn(char[][] board) {
    HashSet<Character> columnSet = new HashSet<>();
    
    for (int c = 0; c < 9; c++) {
        for (int r = 0; r < 9; r++) {
            char val = board[r][c];
            
            if (val == '.') {
                continue;
            }
            
            if (columnSet.contains(val)) {
                return false;
            }
            
            columnSet.add(val);
        }
        columnSet.clear();
    }
    return true;
}
public boolean isSquare(char[][] board) {
    
    // key = boxIndex (r/3 aur c/3 se banaya gaya), value = us box mein abhi tak dekhe gaye digits
    Map<String, Set<Character>> squares = new HashMap<>();
    
    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            
            char val = board[r][c];
            
            if (val == '.') {
                continue;
            }
            
            String key = (r / 3) + "," + (c / 3);
            
            if (!squares.containsKey(key)) {
                squares.put(key, new HashSet<>());
            }
            
            if (squares.get(key).contains(val)) {
                return false;
            }
            
            squares.get(key).add(val);
        }
    }
    return true;
}
}
