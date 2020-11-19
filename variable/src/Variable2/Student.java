package Variable2;

public class Student {
	
	//필드
	private String name;//이름
    private int sno;//학번
    private int ens;//영어점수
    private int ms;//수학점수
    
    //메소드
    public void studentInfo() {
		System.out.println("이름: " + name + " " + "학번: "  + sno + "입니다.");
	}
    public void totalScore() {
    	System.out.println("수학 :" + ms + " 영어: " + ens + " 합: " + (ms+ens) );    
    }
    
    public int totalScore2() {
    	int totalscore2;
    	totalscore2 = this.ens+this.ms;
    	return totalscore2;
    }
    public int totalScore3() {
    	return ms + ens;
    }
    
//    public void totalScore() {
//    	System.out.println(ens + ms);
//    }
    

    public void setName(String name) {
    	this.name = name;
    }
    public void setSno(int sno) {
    	this.sno = sno;
    }
    public void setEns(int ens) {
    	this.ens = ens;
    }
    public void setMs(int ms) {
    	this.ms = ms;
    }
}
