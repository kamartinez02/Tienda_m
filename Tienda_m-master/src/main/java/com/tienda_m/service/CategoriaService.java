/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda_m.service;

import com.tienda_m.domain.Categoria;
import java.util.List;

/**
 *
 * @author karen
 */
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activo);
    
    public Categoria getCategoria (Categoria categoria);
    
    public void save (Categoria categoria);
    
    public void delete (Categoria categoria);
    
}
