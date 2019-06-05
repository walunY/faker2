package xyz.walun.faker2.entity;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 15:15
 */
@Component
@Data
public class Ppt {
	// 信号能量
	private  final Integer rssi = 2;
	// 路由状态
	private  final Integer router = 0;
}
