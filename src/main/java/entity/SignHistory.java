package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sign_history")
public class SignHistory {
 
	@Id
	private int id;
	@Column
	private String ungdung;
	@Column
	private String khachhang;
	@Column(name="thoigian")
	private Date time;
	@Column
	private int ketqua;
	@Column
	private int loai;
	@Column
	private String alg;
	@Column private String serial;
	@Column private String hashinput;
	@Column private String hashoutput;
	@Column private String signature;
	@Column private String detail;
	@Column private String duration;
	@Column private String transactionid;
	@Column private String challenge;
	
	public SignHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUngdung() {
		return ungdung;
	}
	public void setUngdung(String ungdung) {
		this.ungdung = ungdung;
	}
	public String getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(String khachhang) {
		this.khachhang = khachhang;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getKetqua() {
		return ketqua;
	}
	public void setKetqua(int ketqua) {
		this.ketqua = ketqua;
	}
	
	
	public int getLoai() {
		return loai;
	}
	public void setLoai(int loai) {
		this.loai = loai;
	}
	public String getAlg() {
		return alg;
	}
	public void setAlg(String alg) {
		this.alg = alg;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getHashinput() {
		return hashinput;
	}
	public void setHashinput(String hashinput) {
		this.hashinput = hashinput;
	}
	public String getHashoutput() {
		return hashoutput;
	}
	public void setHashoutput(String hashoutput) {
		this.hashoutput = hashoutput;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getChallenge() {
		return challenge;
	}
	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}
	@Override
	public String toString() {
		return "SignHistory [id=" + id + ", ungdung=" + ungdung + ", khachhang=" + khachhang + ", time=" + time
				+ ", ketqua=" + ketqua + "]";
	}
	
}
