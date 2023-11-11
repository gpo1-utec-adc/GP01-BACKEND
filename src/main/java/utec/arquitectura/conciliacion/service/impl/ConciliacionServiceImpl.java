package utec.arquitectura.conciliacion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;
import utec.arquitectura.conciliacion.model.Request;
import utec.arquitectura.conciliacion.repository.ConciliacionRepository;
import utec.arquitectura.conciliacion.service.ConciliacionService;
import utec.arquitectura.conciliacion.util.ConvertFecha;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class ConciliacionServiceImpl implements ConciliacionService {

    @Autowired
    private ConciliacionRepository conciliacionRepository;

    @Override
    public List<ConciliacionDominio> obtenerConciliaciones(String codigoComercio,String autorizacion,String estado,String estadoDevolucion,String fechaProcesoInicio,String fechaProcesoFin)
    {
        if(codigoComercio== "" && autorizacion ==  "")
        {
            return conciliacionRepository.findByEstadoAndEstadodevolucionAndFechaprocesoBetween(
                    estado,estadoDevolucion, fechaProcesoInicio, fechaProcesoFin);
        }
        else if(autorizacion ==  "" && codigoComercio !=  "")
         {
             return conciliacionRepository.findByEstadoAndEstadodevolucionAndCodigocomercioAndFechaproceso(
                     estado, estadoDevolucion, codigoComercio, fechaProcesoInicio, fechaProcesoFin);
        } else if (autorizacion != "" && codigoComercio  == "") {
             return conciliacionRepository.findByEstadoAndEstadodevolucionAndAutorizacion(
                     estado, estadoDevolucion, autorizacion, fechaProcesoInicio, fechaProcesoFin);
         }else   {
             return conciliacionRepository.findByEstadoAndFechaprocesoAndEstadodevolucionAndAutorizacionAndCodigocomercio(
                     estado,  estadoDevolucion, autorizacion,codigoComercio,
                     fechaProcesoInicio, fechaProcesoFin);
         }

    }

}
