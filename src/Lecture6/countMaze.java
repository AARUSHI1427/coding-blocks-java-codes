package Lecture6;

import java.util.ArrayList;

public class countMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(countMazePath(2, 2, 0, 0));
		// System.out.println(getMazePath(2,2,0,0));
		// System.out.println(countMazePathD(2, 2, 0, 0));
		 System.out.println(getMazePathD(2,2,0,0));
		boolean board[][] = new boolean[4][4];
		System.out.println(countNqueens(board, 0));
	}

	public static int countMazePath(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count = count + countMazePath(er, ec, cr, cc + 1);
		count = count + countMazePath(er, ec, cr + 1, cc);
		return count;
	}

	public static ArrayList<String> getMazePath(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> hResult = getMazePath(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePath(er, ec, cr + 1, cc);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}
		return myResult;
	}

	public static int countMazePathD(int er, int ec, int cc, int cr) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count = count + countMazePathD(er, ec, cr, cc + 1);
		count = count + countMazePathD(er, ec, cr + 1, cc + 1);
		count = count + countMazePathD(er, ec, cr + 1, cc);

		return count;
	}

	public static ArrayList<String> getMazePathD(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> hResult = getMazePathD(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePathD(er, ec, cr + 1, cc);
		ArrayList<String> dResult = getMazePathD(er, ec, cr + 1, cc + 1);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}
		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}
		for (int i = 0; i < dResult.size(); i++) {
			myResult.add("D" + dResult.get(i));
		}
		return myResult;
	}

	public static int countNqueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (check(board, row, col) == true) {
				board[row][col] = true;
				count = count + countNqueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return count;

	}

	public static boolean check(boolean[][] board,int row,int col){
		for(int i=row;i>=0;i--){
			if(board[i][col]==true){
				return false;
			}
		}
		for(int i=row, j=col;i>=0&&j<board.length;i--,j++){
			if(board[i][j]==true){
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j>=0;i--,j--){
			if(board[i][j]==true){
				return false;
			}
		}
		return true;
	}
}
