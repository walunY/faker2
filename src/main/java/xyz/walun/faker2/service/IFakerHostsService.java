package xyz.walun.faker2.service;

import xyz.walun.faker2.entity.Gateway;

import java.util.ArrayList;

/**
 * Created by Walun on 2019-06-03 15:39
 */
public interface IFakerHostsService {
    ArrayList<Gateway> getHosts(int gat_num, int sensor_num) ;
}
