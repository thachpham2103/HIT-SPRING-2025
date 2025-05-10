package btvnbuoi6springboot.btvnbuoi6.dto.departmentDTO;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DepartmentCreateResponse {

    private String name;
    private String description;

}
