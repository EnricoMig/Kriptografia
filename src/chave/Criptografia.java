/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chave;

/**
 *
 * @author Enrico Migliorini
 */
public class Criptografia {

    public static String tenisPolar(char[] mensagem) {
        String[] codigo = new String[mensagem.length];
        String msg = "";

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

        for (int x = 0; x < codigo.length; x++) {
            msg += codigo[x];
        }

        return msg;
    }

    public static String vermelho(char[] mensagem) {
        String[] codigo = new String[mensagem.length];
        String msg = "";

        for (int x = 0; x < mensagem.length; x++) {
            switch (mensagem[x]) {
                case 'a':
                    codigo[x] = "ais";
                    break;
                case 'e':
                    codigo[x] = "enter";
                    break;
                case 'i':
                    codigo[x] = "inis";
                    break;
                case 'o':
                    codigo[x] = "omber";
                    break;
                case 'u':
                    codigo[x] = "ufter";
                    break;
                default:
                    codigo[x] = "".valueOf(mensagem[x]);
                    break;

            }
        }

        for (int x = 0; x < codigo.length; x++) {
            msg += codigo[x];
        }

        return msg;
    }

    public static String alfabeto(char[] mensagem) {
        String[] codigo = new String[mensagem.length];
        String msg = "";
        for (int x = 0; x < mensagem.length; x++) {
            switch (mensagem[x]) {
                case 'a':
                    codigo[x] = "alpha\n";
                    break;
                case 'b':
                    codigo[x] = "bravo\n";
                    break;
                case 'c':
                    codigo[x] = "charlie\n";
                    break;
                case 'd':
                    codigo[x] = "delta\n";
                    break;
                case 'e':
                    codigo[x] = "echo\n";
                    break;
                case 'f':
                    codigo[x] = "foxtrot\n";
                    break;
                case 'g':
                    codigo[x] = "golf\n";
                    break;
                case 'h':
                    codigo[x] = "hotel\n";
                    break;
                case 'i':
                    codigo[x] = "india\n";
                    break;
                case 'j':
                    codigo[x] = "juliet\n";
                    break;
                case 'k':
                    codigo[x] = "kilo\n";
                    break;
                case 'l':
                    codigo[x] = "lima\n";
                    break;
                case 'm':
                    codigo[x] = "mike\n";
                    break;
                case 'n':
                    codigo[x] = "november\n";
                    break;
                case 'o':
                    codigo[x] = "oscar\n";
                    break;
                case 'p':
                    codigo[x] = "papa\n";
                    break;
                case 'q':
                    codigo[x] = "quebec\n";
                    break;
                case 'r':
                    codigo[x] = "romeo\n";
                    break;
                case 's':
                    codigo[x] = "sierra\n";
                    break;
                case 't':
                    codigo[x] = "tango\n";
                    break;
                case 'u':
                    codigo[x] = "uniform\n";
                    break;
                case 'v':
                    codigo[x] = "victor\n";
                    break;
                case 'w':
                    codigo[x] = "whiskey\n";
                    break;
                case 'x':
                    codigo[x] = "x-ray\n";
                    break;
                case 'y':
                    codigo[x] = "yankee\n";
                    break;
                case 'z':
                    codigo[x] = "zulu\n";
                    break;
                default:
                    codigo[x] = "".valueOf(mensagem[x])+"\n";
                    break;
            }
        }

        for (int x = 0; x < codigo.length; x++) {
            msg += codigo[x];
        }

        return msg;
    }
}
