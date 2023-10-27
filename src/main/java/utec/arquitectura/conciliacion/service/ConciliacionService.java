package utec.arquitectura.conciliacion.service;

import org.springframework.stereotype.Service;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;

import java.sql.Date;
import java.util.List;

@Service
public interface ConciliacionService {

    List<ConciliacionDominio> obtenerConciliaciones(String autorizacion, String codigoComercio, Date fechaProceso);

}
