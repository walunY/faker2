package xyz.walun.faker2.utils;

import org.springframework.stereotype.Component;
import xyz.walun.faker2.entity.Endpoint;
import xyz.walun.faker2.entity.Gateway;
import xyz.walun.faker2.entity.Sensor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 15:51
 */
@Component
public class CreateGatewaies {
	public ArrayList<Gateway> getSensors(int gat_num,int sensor_num) {
		ArrayList<Gateway> gateways = new ArrayList<>();
		ArrayList<Sensor> sensors;
		for(int i = 0;i<gat_num;i++){
			// 生成网关
			Gateway gateway = ApplicationContextProvider.getBean("gateway", Gateway.class);
			// 存储传感器

			// 声明探头对象
			CreateSensors createSensors =ApplicationContextProvider.getBean("createSensors",CreateSensors.class);
			sensors = createSensors.getSensors(sensor_num,i);
			gateway.setData(sensors);

			// 获取当前线程，可以在多线程时唯一标记sn
			Thread thread = Thread.currentThread();
			System.out.println(thread);
			String[] split = Thread.currentThread().toString().split(",");

			// 前缀+序列号+线程号+时间戳，高并发时唯一确定sn
			gateway.setSn("faker-host-"+i+"-"+split[1]+"-"+new Date().getTime());
			// 时间戳
			gateway.setTs(new Date().getTime());
			// 网关类型
			gateway.setType("1");
			// 网关所包含的传感器
			gateways.add(gateway);
		}
		return gateways;
	}
	}
