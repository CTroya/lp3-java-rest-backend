package py.edu.uc.lp3.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import py.edu.uc.lp3.domain.Organizacion;

@Repository
public interface OrganizacionRepository extends CrudRepository<Organizacion,Long>{
	ArrayList<Organizacion> findByTipo(String tipo);
}

