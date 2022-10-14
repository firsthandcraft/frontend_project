package vo;

public class Teacher extends Person{

	private String subject;
	public Teacher(String tel, String name, String address,String subject) {
		super(tel, name, address);
		// TODO Auto-generated constructor stub
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", getTel()=" + getTel() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	
}
