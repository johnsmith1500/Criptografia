/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguranca;

/**
 *
 * @author João Victor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            System.out.println(Cript.md5("Apenas um texto de exemplo"));
            System.out.println(Cript.sha256("Apenas um texto de exemplo"));
            System.out.println(Cript.sha512("Apenas um texto de exemplo"));
            
        }catch(Exception e){
            //TODO: handle exception
        }
    }
    
}
