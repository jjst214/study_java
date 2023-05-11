package day17.ex;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	
	public List<Board> getBoardList() {
		
		List<Board> list = new ArrayList<Board>();
		Board board = new Board("제목1", "내용1");
		Board board2 = new Board("제목2", "내용2");
		Board board3 = new Board("제목3", "내용3");
		
		list.add(board);
		list.add(board2);
		list.add(board3);
		
		return list;
		
	}
}
