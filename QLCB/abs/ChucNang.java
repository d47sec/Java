package abs;

import java.util.ArrayList;

import entities.CanBo;

public abstract class ChucNang {
    protected ArrayList<CanBo> dsCanBo = new ArrayList<>();
    public abstract void themCanBo(CanBo c);
    public abstract void timKiemTheoHoTen(String name);
    public abstract void hienThiThongTin();
    public abstract void thoatChuongTring();
}
