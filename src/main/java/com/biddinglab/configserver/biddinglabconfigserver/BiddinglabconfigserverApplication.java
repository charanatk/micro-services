package com.biddinglab.configserver.biddinglabconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BiddinglabconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiddinglabconfigserverApplication.class, args);
	}

}
