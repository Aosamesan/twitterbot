package com.aosamesan.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bot")
@Data
public class Bot {
    @Id
    public String botName;
    public String koreanBotName;
    public String oAuthToken;
    public String oAuthTokenSecret;
    public String oAuthKey;
    public String oAuthKeySecret;
    public String imageDirectoryPath;
}
