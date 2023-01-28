package au.twobbeetwotee.api.responses.discord;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DiscordRegisteredResponse {
    @Expose private boolean success;
    @Expose private boolean registered;
}
