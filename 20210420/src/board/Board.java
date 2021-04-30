package board;
public class Board{
	int boardNum;
	String writer;
	String subject;
	String content;
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public int getBoardNum() {
		return this.boardNum;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return this.writer;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getsubject() {
		return this.subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
}