package rocky.teamwallweb.entity;

public class Tag {

	String uid;
	
	String tag;

	
	public Tag() {}
	public Tag(String uid, String tag) {
		this.uid = uid;
		this.tag = tag;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "tag [uid=" + uid + ", tag=" + tag + "]";
	}
	
}