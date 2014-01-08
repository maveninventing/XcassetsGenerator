/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maven.icongenerator;

import javax.swing.SwingUtilities;

/**
 *
 * @author marison
 */
public class SystemLog {
    
    private static javax.swing.JTextArea area;
    
    public static void register(javax.swing.JTextArea a){
        area=a;
    }
    
    public static void log(final String log){
        System.out.println(log);
        if(area != null){
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    area.append(log+"\n");
                }
            });            
        }
        
    }
}
