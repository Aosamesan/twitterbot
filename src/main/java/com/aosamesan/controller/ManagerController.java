package com.aosamesan.controller;

import com.aosamesan.model.Bot;
import com.aosamesan.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/")
public class ManagerController {
    private MongoService mongoService;

    @Autowired
    public void setMongoService(MongoService mongoService) {
        this.mongoService = mongoService;
    }

    @RequestMapping(path = "/")
    public String index(Model model) {
        List<Bot> botList = mongoService.findBotList();
        model.addAttribute("botList", botList);
        return "index";
    }

    @RequestMapping(path = "/createBot", method = RequestMethod.POST)
    public String createBot(@RequestParam String botName, @RequestParam(required = false, defaultValue = "") String koreanBotName) {
        mongoService.createBot(botName, koreanBotName);
        return "redirect:/index";
    }
}
