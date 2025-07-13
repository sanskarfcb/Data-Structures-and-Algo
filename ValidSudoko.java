public class ValidSudoko {
        public boolean isValidSudoku(char[][] board) {
            Set<Character>[] rows = new HashSet[9];
            Set<Character>[] column = new HashSet[9];
            Set<Character>[] boxes = new HashSet[9];

            for(int i =0;i<9;i++){
                rows[i] = new HashSet<>();
                column[i] = new HashSet<>();
                boxes[i] = new HashSet<>();
            }

            for(int i =0;i<9;i++){
                for(int j=0;j<9;j++){
                    char val = board[i][j];

                    if(val == '.'){
                        continue;
                    }
                    int boxIndex = (i/3)*3+(j/3);

                    if(rows[i].contains(val)|| column[j].contains(val)||
                            boxes[boxIndex].contains(val))
                    {
                        return false;
                    }
                    rows[i].add(val);
                    column[j].add(val);
                    boxes[boxIndex].add(val);

                }
            }
            return true;
        }
    }

