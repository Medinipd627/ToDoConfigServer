package com.bridgelabz.eureka;

/***************************************************************************************
 * Created By:Medini P.D 
 * Date:- 17/08/2018 
 * Purpose: ConfigServerApplication main class
 ***************************************************************************************/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ToDoConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ToDoConfigServerApplication.class, args);
	}
}
