/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatecnica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import pruebatecnica.entidad.Alcancia;

/**
 *
 * @author aposso
 */
public class PruebaTecnica extends JFrame {

    // Objetos
    private final Alcancia alcancia;
    private Alcancia respuesta;
    //Panel
    private final JPanel contentPane;

    public PruebaTecnica() {
        
        alcancia = new Alcancia();
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(8,6));

        panel.add(new JPanel());
        JButton buttonCincuenta = new JButton("+50");
        panel.add(buttonCincuenta);
        JButton buttonCien = new JButton("+100");
        panel.add(buttonCien);
        JButton buttonDoscientos = new JButton("+200");
        panel.add(buttonDoscientos);
        JButton buttonQuinientos = new JButton("+500");
        panel.add(buttonQuinientos);
        JButton buttonMil = new JButton("+1000");
        panel.add(buttonMil);
        
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        
        panel.add(new JPanel());        
        JLabel lblCincuenta = new JLabel("Monedas de 50");
        panel.add(lblCincuenta);
        JLabel lblCien = new JLabel("Monedas de 100");
        panel.add(lblCien);
        JLabel lblDoscientos = new JLabel("Monedas de 200");
        panel.add(lblDoscientos);
        JLabel lblQuinientos = new JLabel("Monedas de 500");
        panel.add(lblQuinientos);
        JLabel lblMil= new JLabel("Monedas de 1000");
        panel.add(lblMil);
        
        JLabel lblCantidad = new JLabel("Cantidad: ");
        panel.add(lblCantidad);       
        JLabel cantidadCincuenta = new JLabel("0");
        panel.add(cantidadCincuenta);
        JLabel cantidadCien = new JLabel("0");
        panel.add(cantidadCien);
        JLabel cantidadDoscientos = new JLabel("0");
        panel.add(cantidadDoscientos);
        JLabel cantidadQuinientos = new JLabel("0");
        panel.add(cantidadQuinientos);
        JLabel cantidadMil= new JLabel("0");
        panel.add(cantidadMil);
        
        JLabel lblDinero = new JLabel("Dinero en COP: ");
        panel.add(lblDinero);       
        JLabel dineroCincuenta = new JLabel("0");
        panel.add(dineroCincuenta);
        JLabel dineroCien = new JLabel("0");
        panel.add(dineroCien);
        JLabel dineroDoscientos = new JLabel("0");
        panel.add(dineroDoscientos);
        JLabel dineroQuinientos = new JLabel("0");
        panel.add(dineroQuinientos);
        JLabel dineroMil= new JLabel("0");
        panel.add(dineroMil);
      
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        
                
        JLabel lblTotalCantidad = new JLabel("Total Monedas: ");
        panel.add(lblTotalCantidad);
        JLabel totalCantidad = new JLabel("0");
        panel.add(totalCantidad);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        
        JLabel lblTotalDinero = new JLabel("Total Dinero en COP: ");
        panel.add(lblTotalDinero);
        JLabel totalDinero = new JLabel("0");
        panel.add(totalDinero);
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());
        panel.add(new JPanel());

        
        
        buttonCincuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                respuesta = agregarMoneda("cincuenta",1);
                dineroCincuenta.setText(""+respuesta.getCincuenta()*50);
                cantidadCincuenta.setText(""+respuesta.getCincuenta()); 
                totalCantidad.setText(""+respuesta.getTotalMonedas());
                totalDinero.setText(""+respuesta.getTotalDinero());
            }
        });
        
        buttonCien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                respuesta = agregarMoneda("cien",1);
                dineroCien.setText(""+respuesta.getCien()*100);
                cantidadCien.setText(""+respuesta.getCien()); 
                totalCantidad.setText(""+respuesta.getTotalMonedas());
                totalDinero.setText(""+respuesta.getTotalDinero());
            }
        });
        
        buttonDoscientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                respuesta = agregarMoneda("doscientos",1);
                dineroDoscientos.setText(""+respuesta.getDoscientos()*200);
                cantidadDoscientos.setText(""+respuesta.getDoscientos()); 
                totalCantidad.setText(""+respuesta.getTotalMonedas());
                totalDinero.setText(""+respuesta.getTotalDinero());
            }
        });
        
        buttonQuinientos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                respuesta = agregarMoneda("quinientos",1);
                dineroQuinientos.setText(""+respuesta.getQuinientos()*500);
                cantidadQuinientos.setText(""+respuesta.getQuinientos()); 
                totalCantidad.setText(""+respuesta.getTotalMonedas());
                totalDinero.setText(""+respuesta.getTotalDinero());
            }
        });
        
        buttonMil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                respuesta = agregarMoneda("mil",1);
                dineroMil.setText(""+respuesta.getMil()*1000);
                cantidadMil.setText(""+respuesta.getMil()); 
                totalCantidad.setText(""+respuesta.getTotalMonedas());
                totalDinero.setText(""+respuesta.getTotalDinero());
            }
        });


    }
       
    public Alcancia agregarMoneda(String denominacion,int cantidad) {
        switch (denominacion) {
            case "cincuenta":
                alcancia.setCincuenta();
                alcancia.setTotalMonedas();
                alcancia.setTotalDinero(cantidad*50);   
                return alcancia;
            case "cien":
                alcancia.setCien();
                alcancia.setTotalMonedas();
                alcancia.setTotalDinero(cantidad*100);  
                return alcancia;
            case "doscientos":
                alcancia.setDoscientos();
                alcancia.setTotalMonedas();
                alcancia.setTotalDinero(cantidad*200); 
                return alcancia;
            case "quinientos":
                alcancia.setQuinientos();
                alcancia.setTotalMonedas();
                alcancia.setTotalDinero(cantidad*500);
                return alcancia;
            case "mil":
                alcancia.setMil();
                alcancia.setTotalMonedas(); 
                alcancia.setTotalDinero(cantidad*1000); 
                return alcancia;
        }
        return null;

    }

    public static void main(String[] args) {
        try {
            PruebaTecnica pt = new PruebaTecnica();
            pt.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
