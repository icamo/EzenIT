
public class Board {
	// 멤버 필드
	// 생성자
	// 메서드
	String subject;
	String content;
	String writer;
	String enterDate;
	public Board(String subject, String content,
			String writer, String enterDate) {
		this(subject, content);
		this.writer = writer;
		this.enterDate = enterDate;
	}
	
	public Board(String subject, String content) {
		this.subject = subject;
		this.content = content;
	}

}
