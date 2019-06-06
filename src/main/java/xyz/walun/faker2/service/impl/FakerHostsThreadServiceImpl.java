package xyz.walun.faker2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import xyz.walun.faker2.entity.Gateway;
import xyz.walun.faker2.service.IFakerHostsThreadService;
import xyz.walun.faker2.utils.CreateGatewaies;

import java.util.ArrayList;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 23:01
 */
@Service
public class FakerHostsThreadServiceImpl implements IFakerHostsThreadService{
	@Autowired
	private CreateGatewaies createGatewaies;


	@Async
	@Override
	public ArrayList<Gateway> getHosts1(int gat_num, int sensor_num) {
		ArrayList<Gateway> sensors = createGatewaies.getSensors(gat_num, sensor_num);
		System.out.println("s1"+sensors);// 有值
		return sensors;
	}

	@Async
	@Override
	public ArrayList<Gateway> getHosts2(int gat_num, int sensor_num) {
//		return createGatewaies.getSensors(gat_num, sensor_num);
		ArrayList<Gateway> sensors = createGatewaies.getSensors(gat_num, sensor_num);
		System.out.println("s1"+sensors);
		return sensors;
	}

	@Async
	@Override
	public ArrayList<Gateway> getHosts3(int gat_num, int sensor_num) {
//		return createGatewaies.getSensors(gat_num, sensor_num);
		ArrayList<Gateway> sensors = createGatewaies.getSensors(gat_num, sensor_num);
		System.out.println("s1"+sensors);
		return sensors;
	}

	@Async
	@Override
	public ArrayList<Gateway> getHosts4(int gat_num, int sensor_num) {
//		return createGatewaies.getSensors(gat_num, sensor_num);
		ArrayList<Gateway> sensors = createGatewaies.getSensors(gat_num, sensor_num);
		System.out.println("s1"+sensors);
		return sensors;
	}

	@Async
	@Override
	public ArrayList<Gateway> getHosts5(int gat_num, int sensor_num) {
//		return createGatewaies.getSensors(gat_num, sensor_num);
		ArrayList<Gateway> sensors = createGatewaies.getSensors(gat_num, sensor_num);
		System.out.println("s1"+sensors);
		return sensors;
	}

}
