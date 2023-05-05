package codedevl;

public class HocSinh {
	private int id;
    private String idString, name;
    private float diemTB;
    private String xepLoai;
    private int xepHang;

    public HocSinh(int id, String name, float diemTB) {
        this.id = id;
        this.idString = String.format("HS%02d", id);
        this.name = name;
        this.diemTB = diemTB;
        setXepLoai();
    }

    private void setXepLoai() {
        if (diemTB < 5)
            xepLoai = "Yeu";
        else if (diemTB < 7)
            xepLoai = "Trung Binh";
        else if (diemTB < 9)
            xepLoai = "Kha";
        else
            xepLoai = "Gioi";
    }

    public int getId() {
        return id;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public int getXepHang() {
        return xepHang;
    }
    
    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    
    @Override
    public String toString() {
        return idString + " " +  name + " " + diemTB + " " + xepLoai + " " + xepHang;
    }
}
