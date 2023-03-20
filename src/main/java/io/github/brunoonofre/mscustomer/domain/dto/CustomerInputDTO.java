package io.github.brunoonofre.mscustomer.domain.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInputDTO {
    private String name;
    private String cpf;
    private Long age;
}
