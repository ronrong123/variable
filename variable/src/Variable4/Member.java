package Variable4;

public class Member {
	private String memName;
	private int memNo;
	private String memp;
	private String memc;
	public String getMemName() {
		return memName;
	}
	
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int mNo) {
		memNo = mNo;
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
		return "Member [회원이름: " + memName + ", 회원번호: " + memNo + ", 연락처: " + memp + ", 강좌: " + memc + "]";
	}
	
	
}
