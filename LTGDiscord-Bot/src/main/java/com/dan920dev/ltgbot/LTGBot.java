package com.dan920dev.ltgbot;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManager;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class LTGBot {

    private final ShardManager shardManager;

    public  LTGBot() throws LoginException{

        String token = "MTEzMjA5MDc0ODE0NjI4NjY2Mg.GVuRxM.qyo3HiOmEceXSDf0ejvzbY2Xno_14zjdU0wB14";
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.listening("listening stupid..."));
        shardManager = builder.build();
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