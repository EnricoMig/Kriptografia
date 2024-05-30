/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Enrico Migliorini
 */
public class MensagemController {

    public static char[] caractere(String mensagem) {
        mensagem = mensagem.trim().toLowerCase();
        char[] quebra = mensagem.toCharArray();
        return quebra;
    }
    
    public static String tratado(String codigo){
        return null; 
        /*Trata as letras para ficarem 
        maiusculas no começo do texto e pós pontos.*/
    }
    
    public static void select(){
       
    }

}
