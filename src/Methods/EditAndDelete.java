/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon
 */
public class EditAndDelete {
    

    public EditAndDelete(){
    }
    public void DeleteForUser(String iD) throws IOException{

        BufferedWriter nooverWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt", true)));
        Path path = Paths.get("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt");    
            //schauen ob datei existiert
            if (Files.exists(path)){
                Scanner scanner = new Scanner(path);
                    while(scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        nooverWrite.write(line);
                        
                        //schreibt eine zeile zu spät! + schreibt nur unten dran!
                        if(line == null ? iD == null : line.equals(iD)){
                            scanner.nextLine();
                            scanner.nextLine();
                            scanner.nextLine();
                          //scanner.nextLine();
                            nooverWrite.write("");
                            nooverWrite.newLine();
                            nooverWrite.write("");
                            nooverWrite.newLine();
                            nooverWrite.write("");        
                        }
                        nooverWrite.newLine();   
                    }
                 
                scanner.close();
                nooverWrite.close();
            }else{
                JOptionPane.showMessageDialog(null,"Der Eintrag existiert nicht und kann daher nicht bearbeitet werden!");
            }
    
        
    }
    public void EditForUser(String iD,String username,String password,String domain) throws FileNotFoundException, IOException    {
        
        BufferedWriter noOverWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt", true)));
        Path path = Paths.get("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt");    
            //schauen ob datei existiert
            if (Files.exists(path)){
                Scanner scanner = new Scanner(path);
                    while(scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        noOverWrite.write(line);
                        if(line == null ? iD == null : line.equals(iD)){
                            scanner.nextLine();
                            scanner.nextLine();
                            scanner.nextLine();
                            noOverWrite.newLine();
                            noOverWrite.write(username);        
                            noOverWrite.newLine();
                            noOverWrite.write(password);  
                            noOverWrite.newLine();
                            noOverWrite.write(domain);
                        }
                        noOverWrite.newLine();
                    }
            scanner.close();
                noOverWrite.close();
            }else{
                JOptionPane.showMessageDialog(null,"Der Eintrag existiert nicht und kann daher nicht bearbeitet werden!");
            }
    }
    public void DeleteForAdmin(String iD) throws IOException{
 
        BufferedWriter nooverWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt", true)));
        Path path = Paths.get("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt");    
            //schauen ob datei existiert
            if (Files.exists(path)){
                Scanner scanner = new Scanner(path);
                    while(scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        nooverWrite.write(line);
                        //schreibt eine zeile zu spät! + schreibt nur unten dran!
                        if(line == null ? iD == null : line.equals(iD)){
                            scanner.nextLine();
                            scanner.nextLine();
                            nooverWrite.write("");
                            nooverWrite.newLine();
                        }
                        nooverWrite.newLine();   
                    }
                scanner.close();
                nooverWrite.close();
            }else{
                JOptionPane.showMessageDialog(null,"Der Eintrag existiert nicht und kann daher nicht bearbeitet werden!");
            }
        }
    public void EditForAdmin(String iD,String username,String password) throws FileNotFoundException, IOException{

        BufferedWriter nooverWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt", true)));
        Path path = Paths.get("C:\\Users\\nt-user1\\Documents\\NetBeansProjects\\P-Case\\src\\resources\\adminList.txt");    
            //schauen ob datei existiert
            if (Files.exists(path)){
                Scanner scanner = new Scanner(path);
                    while(scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        nooverWrite.write(line);
                        if(line == null ? iD == null : line.equals(iD)){
                            scanner.nextLine();
                            scanner.nextLine();
                            scanner.nextLine();
                            nooverWrite.newLine();
                            nooverWrite.write(username);        
                            nooverWrite.newLine();
                            nooverWrite.write(password);        
                        }
                        nooverWrite.newLine();
                    }
                scanner.close();
                nooverWrite.close();
            }else{
                JOptionPane.showMessageDialog(null,"Der Eintrag existiert nicht und kann daher nicht bearbeitet werden!");
            }
    }
  
}

        
        
    
    
    
    
    
    

