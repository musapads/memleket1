package Karabot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Hauptklasse {

    public static JDA bot;
    public static void main (String[] args) {
        String prefix = "-";
        String token = "MTA2NDMzODc3NTUzMjEyNjI0OQ.GPRZDg.MQ0hYiHoJaiMjD27ZzQugaGb-mmnW3ZGU71MIU";
        String status;
        status = "test";

        JDABuilder bauplan = JDABuilder.createDefault(token);
        JDABuilder.createLight(token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .addEventListeners(new Memleket())
                .build();

        bauplan.addEventListeners(new Memleket());
        bauplan.setStatus(OnlineStatus.ONLINE);
        JDA bot = bauplan.build();
    }
}
