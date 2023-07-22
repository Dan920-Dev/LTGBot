package com.dan920dev.ltgbot;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManager;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class LTGBot {

    private final ShardManager shardManager;
    private final Dotenv config;

    public  LTGBot() throws LoginException{

        config = Dotenv.configure().load();
        String token = config.get("TOKEN");

        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.listening("listening stupid..."));
        shardManager = builder.build();
    }

    public Dotenv getConfig() {
        return config;
    }
    public ShardManager getShardManager(){
        return shardManager;
    }
    public static void main(String[] args) {
    try{
        LTGBot bot = new LTGBot();
        System.out.println("DONE");
    }catch (LoginException e){
        System.out.println("ERORR: Invalid token");
    }

    }
}