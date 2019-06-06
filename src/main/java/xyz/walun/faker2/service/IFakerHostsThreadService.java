package xyz.walun.faker2.service;

import org.springframework.scheduling.annotation.Async;
import xyz.walun.faker2.entity.Gateway;

import java.util.ArrayList;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/5 22:59
 */
public interface IFakerHostsThreadService {

	ArrayList<Gateway> getHosts1(int gat_num, int sensor_num) ;
//	ArrayList<Gateway> getHosts1(int gat_num, int sensor_num) ;

	ArrayList<Gateway> getHosts2(int gat_num, int sensor_num) ;

	ArrayList<Gateway> getHosts3(int gat_num, int sensor_num) ;

	ArrayList<Gateway> getHosts4(int gat_num, int sensor_num) ;
	ArrayList<Gateway> getHosts5(int gat_num, int sensor_num) ;
}

