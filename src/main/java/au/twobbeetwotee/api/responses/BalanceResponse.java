package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BalanceResponse {
    @Expose private int wallet;
    @Expose private int costs;
    @Expose private String currency;
    @Expose private String month;
}
