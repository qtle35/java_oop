package codedevl;

public class TranDau {
	private String maTD;
	private long soCDV, doanhthu;
	private CauLacBo cauLacBo;
	public TranDau(String maTD, long soCDV) {
		super();
		this.maTD = maTD;
		this.soCDV = soCDV;
		
	}
	public void setCauLacBo(CauLacBo cauLacBo) {
		this.cauLacBo = cauLacBo;
		this.doanhthu = cauLacBo.getGiave()*soCDV;
	}
	public String getTen() {
		return cauLacBo.getTenCLB();
	}
	
	public long getDoanhthu() {
		return doanhthu;
	}
	@Override
	public String toString() {
		return maTD+" "+cauLacBo.getTenCLB()+" "+doanhthu;
	}
	
}
