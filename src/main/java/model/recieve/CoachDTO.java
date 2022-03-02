package model.recieve;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoachDTO {
    @NotBlank
    private String name;

    @JsonProperty(value = "train_id")
    private UUID trainId;
}
