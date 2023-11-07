package sdCommunity.admin.user;

public class CommentDTO {
	private int cmtId;
	private int postId;
	private int cmtUid;
	private String comment;
	private String status;
	public int getCmtId() {
		return cmtId;
	}
	public void setCmtId(int cmtId) {
		this.cmtId = cmtId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public int getCmtUid() {
		return cmtUid;
	}
	public void setCmtUid(int cmtUid) {
		this.cmtUid = cmtUid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
