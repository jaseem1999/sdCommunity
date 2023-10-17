package sdCommunity.user.notification;

public class DTOlikePost {
	private int notiId;
	private int userId;
	private int postId;
	private int likeUid;
	private String notification;
	
	public int getLikeUid() {
		return likeUid;
	}
	public void setLikeUid(int likeUid) {
		this.likeUid = likeUid;
	}
	public int getNotiId() {
		return notiId;
	}
	public void setNotiId(int notiId) {
		this.notiId = notiId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
}
