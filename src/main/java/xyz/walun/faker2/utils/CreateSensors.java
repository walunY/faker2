package xyz.walun.faker2.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.walun.faker2.entity.Endpoint;
import xyz.walun.faker2.entity.Ppt;
import xyz.walun.faker2.entity.Sensor;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 15:18
 */
@Component
public class CreateSensors {
	@Autowired
	private Ppt ppt;
	public ArrayList<Sensor> getSensors(int num,int tag_host){
		// 设置只保留一位小数格式
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(1);
		ArrayList<Sensor> sensors = new ArrayList<>();

		for(int i = 0;i<num;i++){
			Sensor sensor = ApplicationContextProvider.getBean("sensor", Sensor.class);
			ArrayList<Endpoint> endpoints = new ArrayList<>();
			// 声明探头对象
			for (int j=0;j<i+1;j++) {
				Endpoint endpoint =ApplicationContextProvider.getBean("endpoint",Endpoint.class);
				// 设置管道地址
				endpoint.setAddr(j);
				// 设置管道类型
				endpoint.setTp(j + 1);
				// 根据管道类型设置随机值
				endpoint.setVu((nf.format((j * 10 + (Math.random() * 10)))));
				endpoints.add(endpoint);
			}
			sensor.setEps(endpoints);
			// 获取当前线程，可以在多线程时唯一标记sn
			String[] split1 = Thread.currentThread().toString().split("-");
			String s = split1[1].split(",")[0];
			sensor.setSn("faker-" +tag_host+"-"+ i + "-" + s + "-" + new Date().getTime());
			// 根据序列号是否在线
			sensor.setOl(i % 2 == 0 ? true : false);
			// 设置属性
			sensor.setPpt(ppt);
			// 设置传感器名称
			sensor.setNa((i + 1) + "#传感器");
			// 设置传感器类型
			sensor.setTp("1");
			sensors.add(sensor);
		}
		return sensors;
	}
}
