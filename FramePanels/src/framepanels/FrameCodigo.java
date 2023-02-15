/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package framepanels;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author invitado
 */
public class FrameCodigo extends JFrame {

    JPanel contenedorAPP;
    JPanel contenedorBotones;
    JPanel contenedorVentanas;
    JButton btn_pagina1, btn_pagina2;
   public FrameCodigo(){
       btn_pagina1= new JButton("PAGINA UNO");
       btn_pagina1.setSize(200, 40);
       btn_pagina1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed (ActionEvent e){
               mostrarVentanas(new PaginaUno());
           }
       });
       
        btn_pagina2 = new JButton("PAGINA DOS");
        btn_pagina2.setSize(200,40);
        btn_pagina2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                mostrarVentanas(new PaginaDos());
            }
        });
        
        contenedorBotones = new JPanel();
        contenedorBotones.setBackground(new Color(74,171,44));
        contenedorBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        contenedorBotones.add(btn_pagina1);
        contenedorBotones.add(btn_pagina2);
        
        contenedorVentanas = new JPanel();
        contenedorVentanas.setBackground(new Color(200,200,200));
        contenedorVentanas.setLayout(new BorderLayout());
        
        mostrarVentanas(new VentanaInicial());
        
        contenedorAPP = new JPanel();
        contenedorAPP.setBackground(new Color(255,255,255));
        contenedorAPP.setLayout(new BorderLayout());
        contenedorAPP.add(contenedorBotones, BorderLayout.NORTH);
        contenedorAPP.add(contenedorVentanas, BorderLayout.CENTER);
        
        this.setLayout(new BorderLayout());
        this.add(contenedorAPP, BorderLayout.CENTER);
        
        
    }
    
   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
