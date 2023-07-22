package com.dan920dev.ltgbot.listeners;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.User;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class EventListener extends ListenerAdapter {
     @Override
    public void onGuildMemberUpdate(@NotNull GuildMemberUpdateEvent event) {

        Guild guild = event.getGuild();
        User user = event.getUser();

        String message = "¡Hey pa " + "<@259036523603820544>" + " alguien  le tocó los roles a " + user.getAsMention();
        System.out.println(message);

        MessageChannel defaultChannel = guild.getSystemChannel();
        defaultChannel.sendMessage(message).queue();
        System.out.println(message);
    }




}
