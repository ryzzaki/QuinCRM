/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincrm;

import java.io.File;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author cuong
 */
public class QuinCRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //opens the initial GUI
        InitialGUI show = new InitialGUI();
        show.setVisible(true);
        show.setLocationRelativeTo(null);

        //Easy Startup
        //EMMF
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jdbc:derby:QuinDatabase;create=truePU");
        System.out.println(emf);

        //QuinCRM Directory
        String loggeduser = System.getenv("USERPROFILE");
        File quinDirectory = new File(loggeduser + "\\Documents\\QuinCRM");
        //Check for existance of the folder
        if (!quinDirectory.exists()) {
            quinDirectory.mkdirs();
            System.out.println("QuinCRM has been created");
        } else {
            System.out.println("QuinCRM already exists");
        }
    }
}
