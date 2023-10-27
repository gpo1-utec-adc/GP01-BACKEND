package utec.arquitectura.conciliacion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;
import utec.arquitectura.conciliacion.repository.ConciliacionRepository;
import utec.arquitectura.conciliacion.service.ConciliacionService;

import java.sql.Date;
import java.util.List;

@Service
public class ConciliacionServiceImpl implements ConciliacionService {

    @Autowired
    private ConciliacionRepository conciliacionRepository;

    @Override
    public List<ConciliacionDominio> obtenerConciliaciones(String autorizacion, String codigoComercio, Date fechaProceso)
    {
         if(autorizacion== null && codigoComercio != null) {
             return conciliacionRepository.findByCodigocomercioAndFechaproceso(codigoComercio, fechaProceso);
         } else if (autorizacion != null && codigoComercio == null) {
                return conciliacionRepository.findByAutorizacionAndFechaproceso(autorizacion, fechaProceso);
         }else {
             return conciliacionRepository.findByCodigocomercioAndAutorizacionAndFechaproceso(codigoComercio,autorizacion,fechaProceso);
         }
        /** if(autorizacion== null && codigoComercio != null)
         {
             return conciliacionRepository.findByCodigoComercioAndFechaProcesoInicioAndFechaProcesoFin(codigoComercio, fechaProcesoInicio, fechaProcesoFin);
        } else if (autorizacion != null && codigoComercio == null) {
             return conciliacionRepository.findByAutorizacionAndFechaProcesoInicioAndFechaProcesoFin(autorizacion, fechaProcesoInicio, fechaProcesoFin);
         }else if (autorizacion != null && codigoComercio != null) {
             return conciliacionRepository.findByCodigoComercioAndAutorizacionAndFechaProcesoInicioAndFechaProcesoFin(codigoComercio, autorizacion, fechaProcesoInicio, fechaProcesoFin);
         }else {
             return conciliacionRepository.findByFechaProcesoBetween(fechaProcesoInicio, fechaProcesoFin);
         }**/

    }

}
