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
}
