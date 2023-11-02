package utec.arquitectura.conciliacion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;
import utec.arquitectura.conciliacion.model.Request;
import utec.arquitectura.conciliacion.repository.ConciliacionRepository;
import utec.arquitectura.conciliacion.service.ConciliacionService;
import utec.arquitectura.conciliacion.util.ConvertFecha;

import java.util.Date;
import java.util.List;

@Service
public class ConciliacionServiceImpl implements ConciliacionService {

    @Autowired
    private ConciliacionRepository conciliacionRepository;

    @Override
    public List<ConciliacionDominio> obtenerConciliaciones(Request request)
    {
        Date fecha = ConvertFecha.convertFechaToDate(request.getFechaProceso());
        if(request.getAutorizacion()== null && request.getCodigoComercio() == null)
        {
            return conciliacionRepository.findByEstadoAndFechaprocesoAndEstadodevolucion(
                    request.getEstado(), fecha, request.getEstadoDevolucion());
        }
        else if(request.getAutorizacion()== null && request.getCodigoComercio() != null)
         {
             return conciliacionRepository.findByEstadoAndFechaprocesoAndEstadodevolucionAndCodigocomercio(
                     request.getEstado(), fecha, request.getEstadoDevolucion(), request.getCodigoComercio());
        } else if (request.getAutorizacion() != null && request.getCodigoComercio()  == null) {
             return conciliacionRepository.findByEstadoAndFechaprocesoAndEstadodevolucionAndAutorizacion(
                     request.getEstado(), fecha, request.getEstadoDevolucion(), request.getAutorizacion());
         }else   {
             return conciliacionRepository.findByEstadoAndFechaprocesoAndEstadodevolucionAndAutorizacionAndCodigocomercio(
                     request.getEstado(), fecha, request.getEstadoDevolucion(), request.getAutorizacion(),
                     request.getCodigoComercio());
         }

    }

}
