import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;

import javax.security.auth.login.LoginException;

public class DiscordBot{
    public static void main(String[] args) {
        final String token = "MTI0MTc1MTI5NjY2MzYxNzU1Nw.GIfCfH.0MnH4DIP7zz-PNLqvJxg0JVj_t9vPM0nOMNk08";
        final JDA jda = JDABuilder.createLight(token).build();
    }
}