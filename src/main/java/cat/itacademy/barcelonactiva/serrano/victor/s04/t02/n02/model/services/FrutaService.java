package cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n02.model.services;

import java.util.Optional;

import cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n02.model.domain.Fruta;

public interface FrutaService {
	
	public Iterable<Fruta> findAll();
	
	public Fruta save(Fruta fruta);
	
	public void deleteById(int id);
	
	public Optional<Fruta> findById(int id);

}
