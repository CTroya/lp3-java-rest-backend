package py.edu.uc.lp3.repository;

import org.springframework.stereotype.Repository;

import py.edu.uc.lp3.domain.Almacenamiento;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface AlmacenamientoRepository extends CrudRepository<Almacenamiento,Long>{
    
}
