/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chave;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Enrico Migliorini
 */
public class Descriptografia {
    public static String tenisPolar(char[] mensagem){
        String[] codigo=new String[mensagem.length];
        String msg="";
        
        
        for (int x = 0; x < mensagem.length; x++) {
            switch (mensagem[x]) {
                case 't':
                    codigo[x] = "p";
                    break;

                case 'e':
                    codigo[x] = "o";
                    break;
                case 'n':
                    codigo[x] = "l";
                    break;
                case 'i':
                    codigo[x] = "a";
                    break;
                case 's':
                    codigo[x] = "r";
                    break;
                case 'p':
                    codigo[x] = "t";
                    break;
                case 'o':
                    codigo[x] = "e";
                    break;
                case 'l':
                    codigo[x] = "n";
                    break;
                case 'a':
                    codigo[x] = "i";
                    break;
                case 'r':
                    codigo[x] = "s";
                    break;
                default:
                    codigo[x] = "".valueOf(mensagem[x]);
                    break;

            }
        }
        
        for(int x = 0; x<mensagem.length;x++){
            msg += codigo[x];
        }
        return msg;
    }
    
    public static String vermelho(char[] mensagem){
        String msg = "";
        Matcher matcher;
        Pattern pattern;
        
        for(int x = 0; x<mensagem.length;x++){
            msg += mensagem[x];
        }
        
        pattern = Pattern.compile("(ais)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "a");
        }
        
        pattern = Pattern.compile("(enter)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "e");
        }
        
        pattern = Pattern.compile("(inis)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "i");
        }
        
        pattern = Pattern.compile("(omber)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "o");
        }
        
        pattern = Pattern.compile("(ufter)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "u");
        }
        
        return msg;
    }
    public static String alfabeto(char[] mensagem){
        String msg = "";
        Matcher matcher;
        Pattern pattern;
        
        for(int x = 0; x<mensagem.length;x++){
            msg += mensagem[x];
        }
        msg += "\n";
        
        pattern = Pattern.compile("(alpha\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "a");
        }
        
        pattern = Pattern.compile("(bravo\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "b");
        }
        
        pattern = Pattern.compile("(charlie\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "c");
        }
        pattern = Pattern.compile("(delta\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "d");
        }
        pattern = Pattern.compile("(echo\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "e");
        }
        pattern = Pattern.compile("(foxtrot\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "f");
        }
        pattern = Pattern.compile("(golf\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "g");
        }
        pattern = Pattern.compile("(hotel\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "h");
        }
        pattern = Pattern.compile("(india\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "i");
        }
        pattern = Pattern.compile("(juliet\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "j");
        }
        pattern = Pattern.compile("(kilo\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "k");
        }
        pattern = Pattern.compile("(lima\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "l");
        }
        pattern = Pattern.compile("(mike\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "m");
        }
        pattern = Pattern.compile("(november\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "n");
        }
        pattern = Pattern.compile("(oscar)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "o");
        }
        pattern = Pattern.compile("(papa\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "p");
        }
        pattern = Pattern.compile("(quebec\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "q");
        }
        pattern = Pattern.compile("(romeo\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "r");
        }
        pattern = Pattern.compile("(sierra\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "s");
        }
        pattern = Pattern.compile("(tango\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "t");
        }
        pattern = Pattern.compile("(uniform\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "u");
        }
        pattern = Pattern.compile("(victor\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "v");
        }
        pattern = Pattern.compile("(whiskey\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "w");
        }
        pattern = Pattern.compile("(x-ray\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "x");
        }
        pattern = Pattern.compile("(yankee\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "y");
        }
        pattern = Pattern.compile("(zulu\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "z");
        }
        pattern = Pattern.compile("(\n)");
        matcher = pattern.matcher(msg);
        if(matcher.find()){
            msg = msg.replace(matcher.group(0), "");
        }
        
        
        return msg;
    
    
    }
}
