package com.rodrigo.webflux.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("anime")
public class Anime {
    @Id
    private Integer id;
    @NotNull
    @NotEmpty(message = "Anime name cannot be empty")
    private String name;
}
