package com.company;

import java.util.Arrays;

public class SorroundedRegions {
    public static char[][]solve(char[][] board) {
        char[][] out=new char[board.length][board.length];
        for(int i=0;i<board.length;i++){
            Arrays.fill(out[i],'X');
        }
        for(int i=0;i<board.length;i++){
            out=updateBoard(0,i,board);
        }
    }

    public static char[][] updateBoard(int x,int y,char[][] board){
        char [][] temp =board;
        if(x<0 || x>=board.length || y<0 || y>=board.length){
            return board;
        }
        else{
            if(board[x][y]=='O'){
                temp[x][y]='O';
            }
            temp=updateBoard(x+1,y,temp);
            temp=updateBoard(x-1,y,temp);
            temp=updateBoard(x,y+1,temp);
            temp=updateBoard(x,y-1,temp);
            return temp;
        }
    }

}
