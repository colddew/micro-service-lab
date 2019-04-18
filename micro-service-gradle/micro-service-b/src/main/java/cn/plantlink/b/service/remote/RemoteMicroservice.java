package cn.plantlink.b.service.remote;

import cn.plantlink.b.config.MicroserviceBProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteMicroservice {

    @Autowired
    private MicroserviceBProperties bProperties;

    @Autowired
    private RestTemplate restTemplate;

    public String dClientRest() {
        return restTemplate.getForObject(bProperties.getDBaseUrl() + "/api/v1/d/rest", String.class);
    }
}
