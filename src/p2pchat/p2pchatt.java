/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class p2pchatt {
public static TCPserver tcp=new TCPserver();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client client1 = new Client();
        client1.setVisible(true);
        client1.nameofuser.setText("Abdallah");
        client1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Client client2 = new Client();
        client2.setVisible(true);
        client2.nameofuser.setText("Amjad");
        client2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Client client3 = new Client();
//        client3.setVisible(true);
//        client3.nameofuser.setText("fares");
//        client3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
}
