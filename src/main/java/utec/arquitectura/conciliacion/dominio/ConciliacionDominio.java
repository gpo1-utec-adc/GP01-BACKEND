package utec.arquitectura.conciliacion.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="transaction", schema = "conciliacion")
public class ConciliacionDominio {




    private String codigocomercio;

    private int tipooperacion;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaoperacion;

    private String horaoperacion;

    @Id
    private String numeroreferencia;


    private int emisor;


    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaproceso;


    private double importebruto;


    private double comemisor;


    private double commerchant;


    private double comtotal;


    private double igv;


    private double importeneto;


    private String codigomon;

    private String fechaabono;


    private String tarjetamask;

    private String ruc;


    private String autorizacion;


    private int codvisanet;

    private String estado;

    private double montocontracargo;


    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechacontracargo;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecharetencion;


    private double montodevolucion;

    private String montoretencion;

    private String estadodevolucion;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechadevolucion;

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

    public String getFechaabono() {
        return fechaabono;
    }

    public void setFechaabono(String fechaabono) {
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

    public void setCodvisanet(int codvisanet) {
        this.codvisanet = codvisanet;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMontocontracargo() {
        return montocontracargo;
    }

    public void setMontocontracargo(double montocontracargo) {
        this.montocontracargo = montocontracargo;
    }

    @Nullable
    public Date getFechacontracargo() {
        return fechacontracargo;
    }

    public void setFechacontracargo(@Nullable Date fechacontracargo) {
        this.fechacontracargo = fechacontracargo;
    }

    @Nullable
    public Date getFecharetencion() {
        return fecharetencion;
    }

    public void setFecharetencion(@Nullable Date fecharetencion) {
        this.fecharetencion = fecharetencion;
    }

    public double getMontodevolucion() {
        return montodevolucion;
    }

    public void setMontodevolucion(double montodevolucion) {
        this.montodevolucion = montodevolucion;
    }

    public String getMontoretencion() {
        return montoretencion;
    }

    public void setMontoretencion(String montoretencion) {
        this.montoretencion = montoretencion;
    }

    public String getEstadodevolucion() {
        return estadodevolucion;
    }

    public void setEstadodevolucion(String estadodevolucion) {
        this.estadodevolucion = estadodevolucion;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

}
