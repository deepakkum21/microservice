## This project contains three services.

1. **StudentService** : 
   - which is nothing but simple service with eureka client enabled.
2. **EurekaServer** : 
   - which is nothing but eureka server where student service will get discovered.
3. **Zuul** : 
   - This service is zuul enabled which is acting as API Gateway means one entry for Student service.