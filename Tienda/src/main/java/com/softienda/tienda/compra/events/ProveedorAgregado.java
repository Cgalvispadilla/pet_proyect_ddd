package com.softienda.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.compra.values.Nacionalidad;
import com.softienda.tienda.compra.values.NombreProveedor;
import com.softienda.tienda.compra.values.NumeroDeContacto;
import com.softienda.tienda.compra.values.ProveedorID;
import com.softienda.tienda.generics.values.Direccion;

public class ProveedorAgregado extends DomainEvent {
    private final ProveedorID proveedorID;
    private final NombreProveedor nombreProveedor;
    private final Direccion direccion;
    private final Nacionalidad nacionalidad;
    private final NumeroDeContacto numeroDeContacto;

    public ProveedorAgregado(ProveedorID entityId, ProveedorID proveedorID, NombreProveedor nombreProveedor, Direccion direccion, Nacionalidad nacionalidad, NumeroDeContacto numeroDeContacto) {
        super("tienda.compra.proveedoragregado");
        this.proveedorID = proveedorID;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.numeroDeContacto = numeroDeContacto;
    }

    public ProveedorID getProveedorID() {
        return proveedorID;
    }

    public NombreProveedor getNombreProveedor() {
        return nombreProveedor;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public NumeroDeContacto getNumeroDeContacto() {
        return numeroDeContacto;
    }
}