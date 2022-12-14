package io.github.carolinacedro.cdjobproject.infra.dto;

import io.github.carolinacedro.cdjobproject.infra.entities.Adm;
import io.github.carolinacedro.cdjobproject.infra.entities.Candidate;
import io.github.carolinacedro.cdjobproject.infra.entities.Vacancy;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateDto {


    private Long id;
    @NotBlank
    @Size(max = 100)
    private String name;
    @NotBlank
    @Size(max = 30)
    private String phone;
    @NotBlank
    @Email
    @Size(max = 50)
    private String email;
    @NotBlank
    @Size(max = 50)
    private String state;
    @NotBlank
    @Size(max = 255)
    private String note;
    private Vacancy vacancy;

}
