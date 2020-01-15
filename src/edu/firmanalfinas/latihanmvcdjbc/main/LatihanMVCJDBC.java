/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firmanalfinas.latihanmvcdjbc.main;


import edu.firmanalfinas.latihanmvcdjbc.error.PelangganException;
import edu.firmanalfinas.latihanmvcdjbc.view.MainViewPelanggan;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author Firman Alfinas
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
    
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });
    }
    
}
