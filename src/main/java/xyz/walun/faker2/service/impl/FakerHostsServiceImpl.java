package xyz.walun.faker2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.walun.faker2.entity.Gateway;
import xyz.walun.faker2.service.IFakerHostsService;
import xyz.walun.faker2.utils.CreateGatewaies;

import java.util.ArrayList;

/**
 * Created by Walun on 2019-06-03 15:42
 */
@Service
public class FakerHostsServiceImpl implements IFakerHostsService {
    @Autowired
    private CreateGatewaies createGatewaies;



    @Override
    public ArrayList<Gateway> getHosts(int gat_num, int sensor_num) {
        return createGatewaies.getSensors(gat_num,sensor_num);
    }
}
