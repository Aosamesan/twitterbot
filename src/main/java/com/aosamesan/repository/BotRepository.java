package com.aosamesan.repository;

import com.aosamesan.web.model.Bot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRepository extends MongoRepository<Bot,String> {
}
