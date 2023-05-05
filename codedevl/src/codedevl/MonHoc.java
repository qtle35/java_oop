package codedevl;

import java.util.Objects;

public class MonHoc implements Comparable<MonHoc> {
	private String mamon, tenmon, ht;
	public MonHoc(String mamon, String tenmon, String ht) {
		super();
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.ht = ht;
	}
	public String getMamon() {
		return mamon;
	}
	public String getTenmon() {
		return tenmon;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mamon);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonHoc other = (MonHoc) obj;
		return Objects.equals(mamon, other.mamon);
	}
	
	@Override
	public String toString() {
		return mamon+" "+tenmon+" "+ht;
	}
	@Override
	public int compareTo(MonHoc o) {
		return mamon.compareTo(o.getMamon());
	}
	
}
