package person.bing.testservicetwo.comment.bean;

import java.util.Date;

public class CommentModel {
	
	private Integer id;
	private byte[] commentText;
	private String commentTextString;
	private Integer postId;
	private Integer userId;
	private Date createdDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getCommentText() {
		return commentText;
	}
	public void setCommentText(byte[] commentText) {
		this.commentText = commentText;
	}
	public String getCommentTextString() {
		return commentTextString;
	}
	public void setCommentTextString(String commentTextString) {
		this.commentTextString = commentTextString;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
