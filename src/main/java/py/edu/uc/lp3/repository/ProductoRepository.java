package py.edu.uc.lp3.repository;
import org.springframework.data.repository.CrudRepository;
import py.edu.uc.lp3.domain.Producto;

//@Repository
public interface ProductoRepository extends CrudRepository<Producto,Long> {

}
