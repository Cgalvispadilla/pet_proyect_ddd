package com.softienda.tienda.producto;

import co.com.sofka.domain.generic.Entity;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.producto.values.CategoriaID;

import java.util.Objects;


public class Categoria extends Entity<CategoriaID> {

    private  Nombre nombre;

    public Categoria(CategoriaID entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }
    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }
    public Nombre nombre() {
        return nombre;
    }
}
