package person.bing.testservicetwo.post.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author mengf
 *
 */
@JsonInclude(Include.NON_NULL)
public class PostModel {
	private Integer id;
	private Integer userId;
	private Integer categoryId;
	private String title;
	private byte[] text;
	private String textString;
//	private String text;
	private Date createdDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTextString() {
		return textString;
	}
	public void setTextString(String textString) {
		this.textString = textString;
	}
	public byte[] getText() {
		return text;
	}
	public void setText(byte[] text) {
		this.text = text;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
