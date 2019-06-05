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
}
