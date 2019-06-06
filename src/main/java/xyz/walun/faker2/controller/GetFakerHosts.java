package xyz.walun.faker2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
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
	public ArrayList<Gateway>[] creat(){

		ArrayList<Gateway>[] hosts=  new ArrayList[2];
		ArrayList<Gateway> hosts1 = fakerHostsService.getHosts(1,10);
		ArrayList<Gateway> hosts2 = fakerHostsService.getHosts(1,10);
		hosts[0]=hosts1;
		hosts[1]=hosts2;

		return hosts;
	}

	@GetMapping("/api/device/creat1")
	@ResponseBody
	@Async
	public ArrayList<Gateway>[] creat1(){
		ArrayList<Gateway>[] hosts=  new ArrayList[5];
		ArrayList<Gateway> arrayList1;

		arrayList1= fakerHostsThreadService.getHosts1(1,10);
		System.out.println("arrayList1"+arrayList1);

		ArrayList<Gateway> arrayList2 = fakerHostsThreadService.getHosts2(1,10);
		System.out.println("arrayList2"+arrayList2);

		ArrayList<Gateway> arrayList3 = fakerHostsThreadService.getHosts3(1,10);
		System.out.println("arrayList3" +arrayList3);

		ArrayList<Gateway> arrayList4 = fakerHostsThreadService.getHosts4(1,10);
		System.out.println(arrayList4+"arrayList1");

		ArrayList<Gateway> arrayList5 = fakerHostsThreadService.getHosts5(1,10);
		System.out.println(arrayList5+"arrayList1");
		hosts[0]=arrayList1;
		hosts[1]=arrayList2;
		hosts[2]=arrayList3;
		hosts[3]=arrayList4;
		hosts[4]=arrayList5;

//		return hosts;
		return hosts;
	}
	@GetMapping("/api/device/creat2")
	@ResponseBody
	@Async
	public ArrayList<Gateway>[] creat2(){
		ArrayList<Gateway>[] hosts=  new ArrayList[5];

//		for (int i = 0;i<5;i ++) {
			ArrayList<Gateway> hosts1 = fakerHostsThreadService.getHosts1(1, 10);
			ArrayList<Gateway> hosts2 = fakerHostsThreadService.getHosts2(1, 10);
			ArrayList<Gateway> hosts3 = fakerHostsThreadService.getHosts3(1, 10);
			ArrayList<Gateway> hosts4 = fakerHostsThreadService.getHosts4(1, 10);
			ArrayList<Gateway> hosts5 = fakerHostsThreadService.getHosts5(1, 10);
			System.out.println("arrayList1" + hosts1);
			hosts[0]=hosts1;
			hosts[1]=hosts2;
			hosts[2]=hosts3;
			hosts[3]=hosts4;
			hosts[4]=hosts5;
//		}

//		return hosts;
		return hosts;
	}


}
