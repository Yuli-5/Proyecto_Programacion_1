
import proyecto_programacion_q3.EntornoGui;
import proyecto_programacion_q3.Login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Yuli
 */
public class Main {

    public static void main(String[] args) {
        EntornoGui principal = new EntornoGui();
        Login login = new Login();
        login.setBounds(20, 10, 530, 600);
        login.setLocationRelativeTo(null);
        login.setVisible(true);  
      
    }
    
}
