package utec.arquitectura.conciliacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;


import java.util.Date;
import java.util.List;

@Repository
public interface ConciliacionRepository extends JpaRepository<ConciliacionDominio, String> {

    List<ConciliacionDominio> findByEstadoAndFechaprocesoAndEstadodevolucion(
            String estado, Date fechaproceso, String estadodevolucion);
    List<ConciliacionDominio> findByEstadoAndFechaprocesoAndEstadodevolucionAndCodigocomercio
            (String estado, Date fechaproceso, String estadodevolucion, String codigocomercio);

    List<ConciliacionDominio> findByEstadoAndFechaprocesoAndEstadodevolucionAndAutorizacion
            (String estado, Date fechaproceso, String estadodevolucion, String autorizacion);

    /**@Query( value = "SELECT l from ConciliacionDominio  l where l.autorizacion = :autorizacion and l.estado = :estado and " +
            " l.codigocomercio= :codigocomercio and l.estadodevolucion = :estadodevolucion ", nativeQuery = false)
    List<ConciliacionDominio> getAll
            (@Param("estado") String estado,@Param("estadodevolucion") String estadodevolucion,@Param("autorizacion") String autorizacion,@Param("codigocomercio") String codigocomercio);**/

    List<ConciliacionDominio> findByEstadoAndFechaprocesoAndEstadodevolucionAndAutorizacionAndCodigocomercio
            (String estado, Date fechaproceso, String estadodevolucion, String autorizacion, String codigocomercio);

}
