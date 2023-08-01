package cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n02.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n02.model.domain.Fruta;

//@Repository
public interface FrutaRepository extends JpaRepository<Fruta, Integer> {

}
