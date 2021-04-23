/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 */
public class Tools {
    Tools(){

    }

    /***
     *
     * @param palabra palabra que se cambira por un numero
     * @return el codigo de la palabra en numero
     */
    public int StringToNum(String palabra){
        int numero=0;
        String[] caracteres = palabra.split("");
        String etiqueta = "";

        for (int i=0;i<caracteres.length;i++){
            if(caracteres[i].equals("A")){
                etiqueta = etiqueta+"1";
            }else if(caracteres[i].equals("B")){
                etiqueta = etiqueta+"2";
            }else if(caracteres[i].equals("C")){
                etiqueta = etiqueta+"3";
            }else if(caracteres[i].equals("D")){
                etiqueta = etiqueta+"4";
            }else if(caracteres[i].equals("E")){
                etiqueta = etiqueta+"5";
            }
        }
        numero = (int) Long.parseLong(etiqueta);
        return numero;
    }

    public String StringToNum(int palabra){
        if (palabra == 1){
            return "A";
        }else if (palabra == 2){
            return "B";
        }else if (palabra == 3){
            return "C";
        }else if (palabra == 4){
            return "D";
        }else{
            return "E";
        }
    }
}
