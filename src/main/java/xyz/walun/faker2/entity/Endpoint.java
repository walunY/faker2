package xyz.walun.faker2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 15:15
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Endpoint {
	// 管道地址
	private Integer addr;
	// 探头类型
	private Integer tp;
	// 探测值
	private String vu;

	public Integer getAddr() {
		return addr;
	}

	public void setAddr(Integer addr) {
		this.addr = addr;
	}

	public Integer getTp() {
		return tp;
	}

	public void setTp(Integer tp) {
		this.tp = tp;
	}

	public String getVu() {
		return vu;
	}

	public void setVu(String vu) {
		this.vu = vu;
	}
}
