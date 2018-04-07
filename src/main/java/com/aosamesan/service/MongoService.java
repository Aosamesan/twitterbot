package com.aosamesan.service;

import com.aosamesan.model.Bot;
import com.aosamesan.repository.BotRepository;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {
    private BotRepository botRepository;

    @Autowired
    public void setBotRepository(BotRepository botRepository) {
        this.botRepository = botRepository;
    }

    public boolean createBot(@NotNull String botName, String koreanBotName) {
        try {
            Bot bot = new Bot();
            bot.setBotName(botName);
            bot.setKoreanBotName(koreanBotName);
            botRepository.insert(bot);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Bot> findBotList() {
        return botRepository.findAll();
    }


}
