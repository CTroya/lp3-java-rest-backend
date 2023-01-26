package py.edu.uc.lp3.repository;

//import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;
import py.edu.uc.lp3.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
}

