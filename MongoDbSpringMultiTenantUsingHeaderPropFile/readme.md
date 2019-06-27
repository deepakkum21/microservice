# Multi-Tenant Rest API With Spring Boot & MongoDb Having tenant name in the header and default tenant name in the properties file

1. Multi-tenancy is a **virtualization technique that allows to multiple groups for users (tenants) to share a single software instance**. 
2. Dealing with multiple tenants force to decide the correct strategy to separate the data of different tenants. Such strategy has implications for cost, maintenance, security and development efforts.
3. There **exist several strategies** to implement multitenancy that differs from the level of isolation and scalability across tenants:
    1. **discriminator column:**
    -   in all *database tables a column tells the tenant that owns the row*. 
    -   Multi-tenancy is not transparent to the application, there is no isolation, difficult to scale.

    2. **schema-based multitenancy:**
        - *database schemas are used to separate tenants*. 
        - This approach is almost transparent to the application, i.e. queries can be written without thinking about tenants.

    3. **single database per tenant:** 
        - most expensive but provides the best level of isolation and scalability.

## The request flow
The process to establish a multi-tenant communication is usually composed of 3 steps:

1. accept the incoming connection, authenticating the user if necessary.
2. identifying the tenant for which the user is issuing the request.
3. establish a connection with the database and schema of the tenant.



## note:
1. if using @WebFilter , then need to add @ServletComponentScan to the main class.
2. if not using @WebFilter then use only @Component