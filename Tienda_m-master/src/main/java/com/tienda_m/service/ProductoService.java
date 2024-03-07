/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_m.service;

import com.tienda_m.domain.Producto;
import java.util.List;

/**
 *\
 * @author karen
 */
public interface ProductoService {
    
    public List<Producto> getProductos(boolean activo);
    
    public Producto getProducto (Producto categoria);
    
    public void save (Producto categoria);
    
    public void delete (Producto categoria);
    
}
