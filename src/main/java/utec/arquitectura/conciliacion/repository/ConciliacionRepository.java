package utec.arquitectura.conciliacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;


import java.sql.Date;
import java.util.List;

@Repository
public interface ConciliacionRepository extends JpaRepository<ConciliacionDominio, String> {


    List<ConciliacionDominio> findByCodigocomercioAndFechaproceso(String codigoComercio, Date fechaProceso);
    List<ConciliacionDominio> findByAutorizacionAndFechaproceso(String autorizacion,Date fechaProceso);

    List<ConciliacionDominio> findByCodigocomercioAndAutorizacionAndFechaproceso(String codigoComercio , String autorizacion, Date fechaProceso);

  /*  @Transactional
    @Query("{'codigoComercio': :#{#codigoComercio}}, 'fechaProceso': {$gte: :#{#fechaProcesoInicio}}, $lte: :#{#fechaProcesoFin}}}")
    List<ConciliacionDominio> findByCodigoComercioAndFechaProcesoInicioAndFechaProcesoFin(@Param("codigoComercio") String codigoComercio,
                                                                                          @Param("fechaProcesoInicio") String fechaProcesoInicio,
                                                                                          @Param("fechaProcesoFin")  String fechaProcesoFin);

    List<ConciliacionDominio> findByAutorizacionAndFechaProcesoInicioAndFechaProcesoFin(@Param("autorizacion") String autorizacion,
                                                                                        @Param("fechaProcesoInicio") Date fechaProcesoInicio,
                                                                                        @Param("fechaProcesoFin")  Date fechaProcesoFin);

    List<ConciliacionDominio> findByCodigoComercioAndAutorizacionAndFechaProcesoInicioAndFechaProcesoFin(@Param("codigoComercio") String codigoComercio,
                                                                                                         @Param("autorizacion") String autorizacion,
                                                                                                         @Param("fechaProcesoInicio") Date fechaProcesoInicio,
                                                                                                         @Param("fechaProcesoFin")  Date fechaProcesoFin);

    List<ConciliacionDominio> findByFechaProcesoBetween(Date startDate,Date endDate);*/

}
