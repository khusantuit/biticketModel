package model.recieve;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

@Getter
public class TripDTO {
    @NotBlank
    private String name;
    private List<UUID> stations;
}
