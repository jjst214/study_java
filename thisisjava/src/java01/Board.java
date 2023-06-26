package java01;

import java.util.Objects;

public class Board {
	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(subject, content, writer);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board b) {
			return b.subject.equals(subject) && b.content.equals(content) &&
					b.writer.equals(writer);
		}
		return false;
	}
	
}
