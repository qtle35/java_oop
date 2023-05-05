package codedevl;

class PhanSo {
	private long mau, tu;

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}


	public PhanSo(long tu, long mau) {
		this.mau = mau;
		this.tu = tu;
	}

	public long getMau() {
		return mau;
	}

	public void setMau(long mau) {
		this.mau = mau;
	}

	public long getTu() {
		return tu;
	}

	public void setTu(long tu) {
		this.tu = tu;
	}

	public void kq() {
		long m = gcd(this.tu, this.mau);
		System.out.println((this.tu / m) + "/" + (this.mau / m));
	}
}
