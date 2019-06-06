package xyz.walun.faker2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.walun.faker2.entity.Gateway;
import xyz.walun.faker2.service.IFakerHostsService;
import xyz.walun.faker2.service.IFakerHostsThreadService;

import javax.annotation.Resource;
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

	@Autowired
	private IFakerHostsThreadService fakerHostsThreadService;

	@GetMapping("/api/device/creat")
	@ResponseBody
	public ArrayList<Gateway> creat(){
		ArrayList<Gateway> hosts = fakerHostsService.getHosts(1,10);
		return hosts;
	}
	@GetMapping("/api/device/creat1")
	@ResponseBody
	public ArrayList<Gateway>[] creat1(){
			ArrayList<Gateway>[] hosts=  new ArrayList[5];
			ArrayList<Gateway> arrayList1 = fakerHostsThreadService.getHosts1(1,10);
			System.out.println(arrayList1);
			ArrayList<Gateway> arrayList2 = fakerHostsThreadService.getHosts2(1,10);
			ArrayList<Gateway> arrayList3 = fakerHostsThreadService.getHosts3(1,10);
			ArrayList<Gateway> arrayList4 = fakerHostsThreadService.getHosts4(1,10);
			ArrayList<Gateway> arrayList5 = fakerHostsThreadService.getHosts5(1,10);
			hosts[0]=arrayList1;
			hosts[1]=arrayList2;
			hosts[2]=arrayList3;
			hosts[3]=arrayList4;
			hosts[4]=arrayList5;

		return hosts;
	}


}
