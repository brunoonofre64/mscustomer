package io.github.brunoonofre.mscustomer.domain.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.util.UUID;
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String uuid;
    private String name;
    private String cpf;
    private Long age;

    @PrePersist
    private void prePersist() {
        uuid = UUID.randomUUID().toString();
    }
}
