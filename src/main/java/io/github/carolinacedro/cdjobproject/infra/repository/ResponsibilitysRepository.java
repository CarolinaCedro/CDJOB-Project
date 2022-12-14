package io.github.carolinacedro.cdjobproject.infra.repository;

import io.github.carolinacedro.cdjobproject.infra.entities.Responsibilitys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponsibilitysRepository extends JpaRepository<Responsibilitys,Long> {
    List<Responsibilitys> findAllByIdIn(List<Long> id);
}
