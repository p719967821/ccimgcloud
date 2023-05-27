package com.xz.recommend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 48423
 */
@SpringBootApplication(scanBasePackages = {"com.xz.recommend","com.xz.common"})
@EnableDiscoveryClient
@EnableFeignClients
public class RecommendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecommendApplication.class, args);
    }

}
