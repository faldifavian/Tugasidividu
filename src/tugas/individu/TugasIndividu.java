/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.individu;

/**
 *
 * @author faldi
 */
public class TugasIndividu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Splash splash =  new Splash();
        splash.setVisible(true);
        Login login = new Login();
        try {
            for (int i = 0; i <= 100; i++) {
                
                Thread.sleep(40);
                splash.noLoading.setText(Integer.toString(i)+"%");
                splash.barLoading.setValue(i);
                
            }
            splash.setVisible(false);
            login.setVisible(true);
            
        } catch (InterruptedException e) {
        }
    }
    
}
