package xyz.walun.faker2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 15:12
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Scope("prototype")
public class Sensor {
	// 传感器各个探头
	private ArrayList<Endpoint> eps;
	// 传感器sn
	private String sn;
	// 是否在线
	private boolean ol;
	// 传感器属性
	private Ppt ppt;
	// 传感器名称
	private String na;
	// 传感器类型
	private String tp;

	public ArrayList<Endpoint> getEps() {
		return eps;
	}

	public void setEps(ArrayList<Endpoint> eps) {
		this.eps = eps;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public boolean isOl() {
		return ol;
	}

	public void setOl(boolean ol) {
		this.ol = ol;
	}

	public Ppt getPpt() {
		return ppt;
	}

	public void setPpt(Ppt ppt) {
		this.ppt = ppt;
	}

	public String getNa() {
		return na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}
}
