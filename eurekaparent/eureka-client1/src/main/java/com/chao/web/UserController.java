package com.chao.web;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;

   /* @Autowired
    private DiscoveryClient discoveryClient;*/

    @GetMapping("/eureka-instance")
    public String serviceUrl(){

        InstanceInfo instanceInfo = this.eurekaClient.getNextServerFromEureka("EUREKA-CLIENT1",false);
        System.out.println("client 1...");
        return instanceInfo.getHomePageUrl();
    }

   /* @GetMapping("/instance-info")
    public Set<String> showInfo(){
        Set<String> allKnownRegions = this.discoveryClient.getAllKnownRegions();
        return allKnownRegions;

    }
*/
}





