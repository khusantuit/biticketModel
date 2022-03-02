package model.recieve;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
public class StationDTO {
    @NotBlank
    private String name;

    @JsonProperty("parent_id")
    private UUID parentId;
    private Double latitude;
    private Double longitude;

    @Size(min = 32, max = 32)
    @JsonProperty(value = "region_id")
    private UUID regionId;

    @Size(min = 32, max = 32)
    @JsonProperty(value = "district_id")
    private UUID districtId;
}
