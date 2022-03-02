package model.recieve;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
public class SeatDTO {
    @NotNull
    @JsonProperty(value = "seat_num")
    private Integer seatNum;

    @JsonProperty(value = "coach_id")
    private UUID coachId;
}
