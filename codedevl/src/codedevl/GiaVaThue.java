package codedevl;
import java.util.HashMap;

class GiaVaThue {
    private String id, name;
    private int amount;
    private long donGia, thue;
    private long thanhTien;
    
    public GiaVaThue(String id, int amount) {
        this.id = id;
        this.amount = amount;
        setTien();
        setName();
    }

    private void setName() {
        String tmp = id.substring(id.length() - 2);
        if (tmp.equals("BP"))
            name = "British Petro";
        else if (tmp.equals("ES"))
            name = "Esso";
        else if (tmp.equals("SH"))
            name = "Shell";
        else if (tmp.equals("CA"))
            name = "Castrol";
        else if (tmp.equals("MO"))
            name = "Mobil";
        else if (tmp.equals("TN")) {
            name = "Trong Nuoc";
            thue = 0;
            thanhTien = donGia * amount;
        }
    }

    private void setTien() {
        thue = 0;
        char tmp = id.charAt(0);
        if (tmp == 'X') {
            donGia = 128000;
            thue = donGia * amount * 3 / 100;
            thanhTien = donGia * amount * 103 / 100;
        } else if (tmp == 'D') {
            donGia = 11200;
            thue = donGia * amount * 7 / 200;
            thanhTien = donGia * amount * 207 / 200;
        } else if (tmp == 'N') {
            donGia = 9700;
            thue = donGia * amount * 2 / 100;
            thanhTien = donGia * amount * 102 / 100;
        }
    }
    
    
    
    public long getThanhTien() {
		return thanhTien;
	}

	@Override
    public String toString() {
        return id + " " + name + " " + donGia + " " + thue + " " + thanhTien;
    }

}