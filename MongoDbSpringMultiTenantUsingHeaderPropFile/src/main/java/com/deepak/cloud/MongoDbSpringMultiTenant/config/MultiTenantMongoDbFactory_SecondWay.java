package com.deepak.cloud.MongoDbSpringMultiTenant.config;

import java.net.UnknownHostException;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class MultiTenantMongoDbFactory_SecondWay extends SimpleMongoDbFactory {

    public String DEFAULT_DB = "deepakmultitenantdemo";

    public MultiTenantMongoDbFactory_SecondWay(MongoClientURI uri) throws UnknownHostException {
        super(uri);
    }

    @Override
    public MongoDatabase getDb() throws DataAccessException {

        // Check the RequestContext
        Object tenant = RequestContextHolder.getRequestAttributes().getAttribute("tenantId", RequestAttributes.SCOPE_REQUEST);
        System.out.println("================================================="+tenant);
        if (tenant instanceof String)
        {
            System.out.println("================================================="+tenant);
            return getDb(tenant.toString());
        }

        // Return a default DB
        return super.getDb(DEFAULT_DB);
    }

}