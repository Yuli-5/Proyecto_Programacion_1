/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;
import proyecto_programacion_q3.EntornoGui;
import proyecto_programacion_q3.Login;

/**
 *
 * @author Yuli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        EntornoGui principal = new EntornoGui();
        Login login = new Login();
        login.setBounds(20, 10, 530, 600);
        login.setLocationRelativeTo(null);
        login.setVisible(true);  
      
    }
     public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Su informacion esta incompleta revise de nuevo", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }
        public void Creado(){
        JOptionPane.showMessageDialog(null, "Producto registrado correctamente", "Message", JOptionPane.INFORMATION_MESSAGE);
    }  
}
