package com.deepak.microservices.discoveryserver;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="documentation.swagger")
public class SwaggerServicesConfig {

    List<SwaggerServices> swagger;

    public List<SwaggerServices> getServices() {
        System.out.println("0000000000000-------------------"+swagger);
        return swagger;
    }

    public void setServices(List<SwaggerServices> swaggerResources) {
        System.out.println("fkghkfdhgk-------------------");
        this.swagger = swaggerResources;
    }

    @Configuration
    @EnableConfigurationProperties
    @ConfigurationProperties(prefix="documentation.swagger.services")
    public static class SwaggerServices{
        private String name;
        private String url;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            System.out.println("name-------------------"+name);
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        @Override
        public String toString() {
            return "SwaggerServices [name=" + name + ", url=" + url + ", version=" + version + "]";
        }


    }

}