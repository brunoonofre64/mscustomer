package io.github.brunoonofre.mscustomer.domain.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOutputDTO {
    private String uuid;
    private String name;
    private String cpf;
    private Long age;
}
