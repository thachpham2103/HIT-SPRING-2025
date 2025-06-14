package buoi7.buoi7ol.doman.dto.repuest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Data
public class HotelCreatDTO {

    private String name;

    private String location;

    private Double price;

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;
}
