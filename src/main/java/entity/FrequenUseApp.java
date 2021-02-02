package entity;

import java.io.Serializable;
import java.util.Date;

public class FrequenUseApp implements Serializable{
	private Long count;
	private String khachhang;
	private Date time;
	public FrequenUseApp(Long count, String ungdung, Date time) {
		super();
		this.count = count;
		this.khachhang = ungdung;
		this.time = time;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getKhachHang() {
		return khachhang;
	}
	public void setKhachHang(String khachhang) {
		this.khachhang = khachhang;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "FrequenUseApp [count=" + count + ", khachhang=" + khachhang + ", time=" + time + "]";
	}
	
	

}
