package variable5;

public class Member {
	private String memName;
	private int memNo;
	private String memp;
	private String memc;

	public Member() { // 기본생성자:매개변수x
				
	}
	
	public Member(String memName, int memNo) {
		this.memName = memName;
		this.memNo = memNo;
	}

	public Member(int memNo, String memName, String memp, String memc) {
		this.memNo = memNo;
		this.memName = memName;
		this.memp = memp;
		this.memc = memc;		
	}

	public String getMemName() {
		return memName;
	}

	public int getMemNo() {
		return memNo;
	}

	public String getMemp() {
		return memp;
	}

	public String getMemc() {
		return memc;
	}

}
