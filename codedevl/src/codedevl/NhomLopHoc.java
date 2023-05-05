package codedevl;

public class NhomLopHoc {
	private String manhom, mamon, tengv, phonghoc, tenmon;
	private int ngayday, kiphoc;
	public NhomLopHoc(String mamon, int ngayday, int kiphoc, String tengv, String phonghoc) {
		
		this.mamon = mamon;
		this.tengv = tengv;
		this.phonghoc = phonghoc;
		this.ngayday = ngayday;
		this.kiphoc = kiphoc;
	}
	
	public void setTenmon(String tenmon) {
		this.tenmon = tenmon;
	}

	public String getMamon() {
		return mamon;
	}

	public void setManhom(String manhom) {
		this.manhom = manhom;
	}
	
	public String getManhom() {
		return manhom;
	}

	public String getTengv() {
		return tengv;
	}

	public String getPhonghoc() {
		return phonghoc;
	}

	public int getNgayday() {
		return ngayday;
	}

	public int getKiphoc() {
		return kiphoc;
	}

	@Override
	public String toString() {
		return manhom + " "+tenmon+" " + ngayday + " " + kiphoc  + " " + phonghoc;
	}
	
}
