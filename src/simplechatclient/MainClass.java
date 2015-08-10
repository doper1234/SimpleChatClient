/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechatclient;

import java.net.Socket;

public class MainClass {

    public static void main(String[] args) throws Exception {

        Socket s = new Socket("192.168.1.105", 0);
        System.out.println(s.getPort());

    }

}
