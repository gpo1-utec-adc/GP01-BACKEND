package utec.arquitectura.conciliacion.dominio;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Data
@Table(name="transaction", schema = "conciliacion")
public class ConciliacionDominio {



    public String getCodigocomercio() {
        return codigocomercio;
    }

    public void setCodigocomercio(String codigocomercio) {
        this.codigocomercio = codigocomercio;
    }

    public int getTipooperacion() {
        return tipooperacion;
    }

    public void setTipooperacion(int tipooperacion) {
        this.tipooperacion = tipooperacion;
    }

    public Date getFechaoperacion() {
        return fechaoperacion;
    }

    public void setFechaoperacion(Date fechaoperacion) {
        this.fechaoperacion = fechaoperacion;
    }

    public String getHoraoperacion() {
        return horaoperacion;
    }

    public void setHoraoperacion(String horaoperacion) {
        this.horaoperacion = horaoperacion;
    }

    public String getNumeroreferencia() {
        return numeroreferencia;
    }

    public void setNumeroreferencia(String numeroreferencia) {
        this.numeroreferencia = numeroreferencia;
    }

    public int getEmisor() {
        return emisor;
    }

    public void setEmisor(int emisor) {
        this.emisor = emisor;
    }

    public Date getFechaproceso() {
        return fechaproceso;
    }

    public void setFechaproceso(Date fechaproceso) {
        this.fechaproceso = fechaproceso;
    }

    public double getImportebruto() {
        return importebruto;
    }

    public void setImportebruto(double importebruto) {
        this.importebruto = importebruto;
    }

    public double getComemisor() {
        return comemisor;
    }

    public void setComemisor(double comemisor) {
        this.comemisor = comemisor;
    }

    public double getCommerchant() {
        return commerchant;
    }

    public void setCommerchant(double commerchant) {
        this.commerchant = commerchant;
    }

    public double getComtotal() {
        return comtotal;
    }

    public void setComtotal(double comtotal) {
        this.comtotal = comtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getImporteneto() {
        return importeneto;
    }

    public void setImporteneto(double importeneto) {
        this.importeneto = importeneto;
    }

    public String getCodigomon() {
        return codigomon;
    }

    public void setCodigomon(String codigomon) {
        this.codigomon = codigomon;
    }

    public Date getFechaabono() {
        return fechaabono;
    }

    public void setFechaabono(Date fechaabono) {
        this.fechaabono = fechaabono;
    }

    public String getTarjetamask() {
        return tarjetamask;
    }

    public void setTarjetamask(String tarjetamask) {
        this.tarjetamask = tarjetamask;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public int getCodvisanet() {
        return codvisanet;
    }

    public void setCodVisanet(int codvisanet) {
        this.codvisanet = codvisanet;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipodevolucion() {
        return tipodevolucion;
    }

    public void setTipodevolucion(String tipodevolucion) {
        this.tipodevolucion = tipodevolucion;
    }

    public double getMontodevolucion() {
        return montodevolucion;
    }

    public void setMontodevolucion(double montodevolucion) {
        this.montodevolucion = montodevolucion;
    }

    public String getContracargo() {
        return contracargo;
    }

    public void setContracargo(String contracargo) {
        this.contracargo = contracargo;
    }

    public Date getFechacontracargo() {
        return fechacontracargo;
    }

    public void setFechacontracargo(Date fechacontracargo) {
        this.fechacontracargo = fechacontracargo;
    }

    public Date getFecharetencion() {
        return fecharetencion;
    }

    public void setFecharetencion(Date fecharetencion) {
        this.fecharetencion = fecharetencion;
    }

    public String getMontodevoluciontota() {
        return montodevoluciontota;
    }

    public void setMontodevoluciontota(String montodevoluciontota) {
        this.montodevoluciontota = montodevoluciontota;
    }

    public String getRetencion() {
        return retencion;
    }

    public void setRetencion(String retencion) {
        this.retencion = retencion;
    }

    public Long getIdtransaction() {
        return idtransaction;
    }

    public void setIdtransaction(Long idtransaction) {
        this.idtransaction = idtransaction;
    }

    @Id
    private Long idtransaction;

    private String codigocomercio;

    private int tipooperacion;

    private Date fechaoperacion;


    private String horaoperacion;

    private String numeroreferencia;


    private int emisor;


    private Date fechaproceso;


    private double importebruto;


    private double comemisor;


    private double commerchant;


    private double comtotal;


    private double igv;


    private double importeneto;


    private String codigomon;


    private Date fechaabono;


    private String tarjetamask;

    private String ruc;


    private String autorizacion;


    private int codvisanet;

    private String estado;

    private String tipodevolucion;

    @Nullable
    private double montodevolucion;

    private String contracargo;

    @Nullable
    private Date fechacontracargo;

    @Nullable
    private Date fecharetencion;

    private String montodevoluciontota;

    private String retencion;

}
