package ada.tech.java.Repository;

import ada.tech.java.Model.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvioRepository extends JpaRepository <Envio, Long> {

}



