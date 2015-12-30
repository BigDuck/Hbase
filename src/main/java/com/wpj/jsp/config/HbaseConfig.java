/*
 * Copyright (c) 2015 - 12 - 30  10 : 41 :41
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package com.wpj.jsp.config;

import org.apache.hadoop.conf.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.hadoop.hbase.HbaseTemplate;


/**
 * Name：HbaseConfig
 * Time：2015/12/30 20:32
 * author：WPJ587
 * description：Hbase的配置
 **/
@org.springframework.context.annotation.Configuration
@EnableAutoConfiguration
@ConfigurationProperties(value = "hbase.zookeeper",ignoreNestedProperties = false)
public class HbaseConfig {
    private String quorum;
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getQuorum() {
        return quorum;
    }

    public void setQuorum(String quorum) {
        this.quorum = quorum;
    }


    @Bean
    public Configuration configuration() {
        System.out.println("---wpjlovehome@gmail.com-----quorum 值=" + quorum  + ","+port + "HbaseConfig.configuration()");
        Configuration configuration = new Configuration();
        configuration.set("hbase.zookeeper.quorum", quorum);
        configuration.set("hbase.zookeeper.property.clientPort", port);
        return configuration;
    }
    @Bean
    public HbaseTemplate hbaseTemplate(){
        return new HbaseTemplate(configuration());
    }
}
