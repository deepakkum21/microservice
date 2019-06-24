# Spring Cloud Eureka, Hystrix and Zuul Example

## Components
1. **eureka-service** - The Eureka service which is the Service Registry
2. **hello-server** - The Service which is going to give data to the Client.
3. **hello-client** - The Service which is going to get data from Server via the Discovery Service from the Service Registry (eureka-service).
4. **zuul-service** - This is the Gateway/Edge Service which is registered with Eureka and routes the requests to Client and Server using Eureka Service.