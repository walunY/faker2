package xyz.walun.faker2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 15:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope("prototype")
public class Gateway {
	private String sn;
	private Long ts;
	private String type;
	private ArrayList<Sensor> data;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Sensor> getData() {
		return data;
	}

	public void setData(ArrayList<Sensor> data) {
		this.data = data;
	}
}
