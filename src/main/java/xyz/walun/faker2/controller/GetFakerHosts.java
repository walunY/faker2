package xyz.walun.faker2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.walun.faker2.entity.Gateway;
import xyz.walun.faker2.service.IFakerHostsService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Walun
 * @date ：Created in 2019/6/4 16:11
 */
@RestController
public class GetFakerHosts {
	@Autowired
	private IFakerHostsService fakerHostsService;

	@GetMapping("/api/device/creat")
	@ResponseBody
	public ArrayList<Gateway> creat(){
		ArrayList<Gateway> hosts = fakerHostsService.getHosts(1,10);
		System.out.println(hosts);
		return hosts;
	}

}
