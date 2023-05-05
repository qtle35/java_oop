package codedevl;

public class CauLacBo {
	private String maCLB, tenCLB;
	private long giave;
	public CauLacBo(String maCLB, String tenCLB, long giave) {
		super();
		this.maCLB = maCLB;
		this.tenCLB = tenCLB;
		this.giave = giave;
	}
	public long getGiave() {
		return giave;
	}
	public String getMaCLB() {
		return maCLB;
	}
	public String getTenCLB() {
		return tenCLB;
	}
	
}
