/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemmatrizbi;

import javax.swing.JOptionPane;

/**
 *
 * @author jalonsoriveiro
 */
public class ExemMatrizBi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int opcion=0;
        int[][]matriz = new int[3][4];
        String[] alumnos={"alum1","alum2","alum3"};
        String[] modulos={"M1","M2","M3","M4"};
        int [] notaMedia = new int [3];
        MetodosMatriz obj = new MetodosMatriz();
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("****Menu*********\n"
                    + "1)Crear Matriz \n"
                    + "2)Amosar \n"
                    + "3)Amosar todo \n"
                    + "4) Media Alumnos \n"
                    + "5) Media Modulos \n"
                    + "6) Sair \n"
                    + "Teclea opcion \n")
                      );
            
            switch(opcion){
                case 1: matriz= obj.crearMatriz(matriz);
                     break;
                case 2: obj.amosar(matriz);
                     break;
                case 3: obj.amosarTodo(matriz, alumnos, modulos,notaMedia);
                     break;
                case 4: obj.mediaAlumnos(matriz, alumnos, modulos,notaMedia);
                     break;     
                case 5: obj.mediaModulos(matriz, alumnos, modulos,notaMedia);
                     break;     
                case 6: obj.salir();
            }
        }while(opcion <6);                                 
}
}
    
