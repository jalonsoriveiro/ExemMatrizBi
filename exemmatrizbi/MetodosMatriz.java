/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemmatrizbi;

/**
 *
 * @author jalonsoriveiro
 */
public class MetodosMatriz {
    
    
    
    public int[][] crearMatriz(int[][]taboa){
    
        for(int f=0;f<taboa.length;f++){
    
            for(int c=0;c<taboa[f].length;c++){
            
                taboa[f][c]= meusmetodos.PedirDato.PedirInt();
            
            }        
        }
        return  taboa;    
    }
    
    public void amosar(int [][]taboa){
        for(int f=0;f<taboa.length;f++){
                System.out.println("\n");   
            for(int c=0;c<taboa[f].length;c++){
            
                System.out.println(taboa[f][c]+ "  ");
            
            }        
        }
    
    
    }
    public void amosarTodo(int [][]taboa,String []alumnos,String[] modulos,int[]notaMedia){
        float acumulador =0;
        int vueltasF=0;
        float acumuladorModulos=0;
        int notas=0;
        int notasModulo=0;
        for(int i = 0;i<modulos.length;i++){
            //System.out.print("   "+ modulos[i]+"  ");
            
        }
        for(int f=0;f<taboa.length;f++){
             System.out.print("\n "+alumnos[f]+"  ");   
             vueltasF = f;
             
             for(int c=0;c<taboa[f].length;c++){                        
               System.out.print(taboa[f][c]+ "  ");          
               
               acumulador  = acumulador + taboa[f][c];
               notas = c+1;
               
            } 
            notaMedia[f]=(int) (acumulador/notas);
            System.out.print("Media "+notaMedia[f]);
            acumulador=0;
            notas=0;
            
            
            
            
        }
        for(int a=0;a<taboa.length;a++){            
        notasModulo =a;
                 for(int f=0;f<taboa.length;f++){
            
         
            
        }
         acumuladorModulos =acumuladorModulos +taboa[vueltasF][notasModulo];
             System.out.print("\n Media Modulo"+acumuladorModulos);
            acumuladorModulos=0;
            notasModulo=0;
        }
    
    }
    
    
    public void mediaAlumnos(int [][]taboa,String []alumnos,String[] modulos,int[]notaMedia){
       
        float acumulador =0;                
        int notas=0;        
        for(int i = 0;i<modulos.length;i++){
            //System.out.print("   "+ modulos[i]+"  ");
            
        }
        for(int f=0;f<taboa.length;f++){
             System.out.print("\n "+alumnos[f]+"  ");   
             
             for(int c=0;c<taboa[f].length;c++){                        
               System.out.print(taboa[f][c]+ "  ");          
               
               acumulador  = acumulador + taboa[f][c];
               notas = c+1;
               
            } 
            notaMedia[f]=(int) (acumulador/notas);
            System.out.print("Media "+notaMedia[f]);
            acumulador=0;
            notas=0;                      
            
        }
    
    
    
    }
    public void mediaModulos(int [][]taboa,String []alumnos,String[] modulos,int[]notaMedia){

        int vueltasF=0;
        float acumuladorModulos=0;
        int notasModulo=0;
            for(int a=0;a<taboa.length;a++){                              
                           for(int f=0;f<taboa.length;f++){
            
                               System.out.println("Nota ="+taboa[f][a]);
            vueltasF=f;
            acumuladorModulos =acumuladorModulos +taboa[vueltasF][a];
             }

             System.out.print("\n Media Modulo"+acumuladorModulos/+(vueltasF+1)+"\n");
            acumuladorModulos=0;
            notasModulo=0;
        }
    
    }
    
    public void salir(){
    
        System.exit(0);
    }
    
}