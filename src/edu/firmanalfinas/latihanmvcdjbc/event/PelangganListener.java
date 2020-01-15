/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firmanalfinas.latihanmvcdjbc.event;

import edu.firmanalfinas.latihanmvcdjbc.entity.Pelanggan;
import edu.firmanalfinas.latihanmvcdjbc.model.PelangganModel;

/**
 *
 * @author Firman Alfinas
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
        
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);

}
