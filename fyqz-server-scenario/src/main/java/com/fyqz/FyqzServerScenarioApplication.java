package com.fyqz;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Scanner;

@EnableSwagger2Doc
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class FyqzServerScenarioApplication {

	public static void main(String[] args) {
		System.out.println("================================================== 开始启动 应用fyqz-service-scenario =============================================================");
		System.out.println("请在控制台指定fyqz-service-scenario应用的端口号 —— [端口号随意指定，注意不要与本机端口号出现冲突即可]");
		Scanner scanner = new Scanner(System.in);
		String port = scanner.nextLine();
		new SpringApplicationBuilder(FyqzServerScenarioApplication.class).properties("server.port=" + port).run(args);//启动项目
		System.out.println("================================================== 应用fyqz-service-scenario 启动成功 =============================================================");
	}
}
