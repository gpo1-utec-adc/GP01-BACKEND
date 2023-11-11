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

    @Query(value = "Select c from ConciliacionDominio c where c.estado = :estado and c.estadodevolucion = :estadodevolucion and " +
            "c.fechaproceso >= to_date(:start, 'YYYY-mm-dd') and c.fechaproceso <= to_date(:end, 'YYYY-mm-dd')")
    List<ConciliacionDominio> findByEstadoAndEstadodevolucionAndFechaprocesoBetween(
          @Param("estado") String estado,@Param("estadodevolucion") String estadodevolucion,@Param("start") String start,@Param("end") String end);

    @Query(value = "Select c from ConciliacionDominio c where c.estado = :estado and c.estadodevolucion = :estadodevolucion and c.codigocomercio=:codigocomercio" +
            " and c.fechaproceso >= to_date(:start, 'YYYY-mm-dd') and c.fechaproceso <= to_date(:end, 'YYYY-mm-dd')")
    List<ConciliacionDominio> findByEstadoAndEstadodevolucionAndCodigocomercioAndFechaproceso
            (@Param("estado") String estado,@Param("estadodevolucion") String estadodevolucion,
             @Param("codigocomercio") String codigocomercio,
             @Param("start") String start,@Param("end") String end);

    @Query(value = "Select c from ConciliacionDominio c where c.estado = :estado and c.estadodevolucion = :estadodevolucion and c.autorizacion=:autorizacion" +
            " and c.fechaproceso >= to_date(:start, 'YYYY-mm-dd') and c.fechaproceso <= to_date(:end, 'YYYY-mm-dd')")
    List<ConciliacionDominio> findByEstadoAndEstadodevolucionAndAutorizacion
            (@Param("estado") String estado,@Param("estadodevolucion") String estadodevolucion,
             @Param("autorizacion") String autorizacion,
             @Param("start") String start,@Param("end") String end);

    @Query(value = "Select c from ConciliacionDominio c where c.estado = :estado and c.estadodevolucion = :estadodevolucion and c.autorizacion=:autorizacion" +
            " and c.codigocomercio=:codigocomercio and c.fechaproceso >= to_date(:start, 'YYYY-mm-dd') and c.fechaproceso <= to_date(:end, 'YYYY-mm-dd')")
    List<ConciliacionDominio> findByEstadoAndFechaprocesoAndEstadodevolucionAndAutorizacionAndCodigocomercio
            (@Param("estado") String estado,@Param("estadodevolucion") String estadodevolucion,
             @Param("autorizacion") String autorizacion,
             @Param("codigocomercio") String codigocomercio,
             @Param("start") String start,@Param("end") String end);

}
