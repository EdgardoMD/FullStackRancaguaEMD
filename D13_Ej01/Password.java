package D13_Ej01;

public class Password {
	
    private final static int LONG_DEF=8;  // Longuitud por defecto, constante.
  
    private int longitud;  // Atributo, longuitud de la contrase�a.
    
    private String contrase�a; // Atributo, caracteres de la contrase�a.
  
    //Metodos publicos
  
    public int getLongitud() {  //Devuelve la longitud
        return longitud;        //@return longitud de la contrase�a 
    }
  
    public void setLongitud(int longitud) {  // Modifica la longitud de la contrase�a
        this.longitud = longitud;            // @param longitud a cambiar
    }
  
    public String getContrase�a() {  // Devuelve la contrase�a
        return contrase�a;           // @return contrase�a
    }
  
    public String generaPassword (){  // Genera una contrase�a al azar con la longitud que este definida
        String password="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si a�adir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;  // @return contrase�a
    }
  
    public boolean esFuerte(){ // Comprueba la fortaleza de la contrase�a
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contrase�a.length();i++){
                if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            //Si la constrase�a tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
  
    public Password (){  // Crea una contrase�a al azar 
        this(LONG_DEF);
    }
  
    public Password (int longitud){ // La contrase�a sera la pasada por parametro
        this.longitud=longitud;     // @param longitud
        contrase�a=generaPassword();  
    }

}