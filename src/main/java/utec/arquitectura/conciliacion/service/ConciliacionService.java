package utec.arquitectura.conciliacion.service;

import org.springframework.stereotype.Service;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;
import utec.arquitectura.conciliacion.model.Request;

import java.sql.Date;
import java.util.List;

@Service
public interface ConciliacionService {
    List<ConciliacionDominio> obtenerConciliaciones(String codigoComercio,String autorizacion,String estado,String estadoDevolucion,String fechaProcesoInicio,String fechaProcesoFin);

}
