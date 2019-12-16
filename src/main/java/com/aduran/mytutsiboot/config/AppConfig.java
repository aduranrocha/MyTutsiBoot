package com.aduran.mytutsiboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.aduran.mytutsiboot.dao")
public class AppConfig {

}
