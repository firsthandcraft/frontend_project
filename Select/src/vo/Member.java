package vo;

public class Member {
	protected String id ;//protected 상속
	protected String name ;
	protected String tel ;
	private String addr ;
	protected int type ;
	// etc 는 상속이 필요 없다. type까지만
	
	
	public Member(String id, String name, String tel, String addr, int type) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.type = type;
	}
	public Member() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", tel=" + tel + ", addr=" + addr + ", type=" + type + "]";
	}

	
}
