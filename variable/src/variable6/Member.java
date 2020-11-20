package variable6;

public class Member {
	private String memName;
	private int memNo;
	private String memp;
	private String memc;
	
	
	
	public Member(String memName, int memNo, String memp, String memc) {
		super();
		this.memName = memName;
		this.memNo = memNo;
		this.memp = memp;
		this.memc = memc;
	}
	
	
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public String getMemp() {
		return memp;
	}
	public void setMemp(String memp) {
		this.memp = memp;
	}
	public String getMemc() {
		return memc;
	}
	public void setMemc(String memc) {
		this.memc = memc;
	}
	@Override
	public String toString() {
		return "Member [memName=" + memName + ", memNo=" + memNo + ", memp=" + memp + ", memc=" + memc + "]";
	}
	
	

}
