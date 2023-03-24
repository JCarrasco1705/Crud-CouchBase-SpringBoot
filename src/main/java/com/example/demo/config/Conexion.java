package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
@Configuration
public class Conexion extends AbstractCouchbaseConfiguration {
    @Value("${spring.couchbase.bootstrap-hosts}")
    private String HOST;
    @Value("${spring.couchbase.bucket.user}")
    private String USER;
    @Value("${spring.couchbase.bucket.password}")
    private String PASS;
    @Value("${spring.couchbase.bucket.name}")
    private String BUCKET;


    @Override
    public String getConnectionString() {
        return Arrays.asList(HOST).toString();
    }

    @Override
    public String getUserName() {
        return USER;
    }

    @Override
    public String getPassword() {
        return PASS;
    }

    @Override
    public String getBucketName() {
        return BUCKET;
    }
}
