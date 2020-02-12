package D13_Ej01;

public class Password {
	
    private final static int LONG_DEF=8;  // Longuitud por defecto, constante.
  
    private int longitud;  // Atributo, longuitud de la contraseña.
    
    private String contraseña; // Atributo, caracteres de la contraseña.
  
    //Metodos publicos
  
    public int getLongitud() {  //Devuelve la longitud
        return longitud;        //@return longitud de la contraseña 
    }
  
    public void setLongitud(int longitud) {  // Modifica la longitud de la contraseña
        this.longitud = longitud;            // @param longitud a cambiar
    }
  
    public String getContraseña() {  // Devuelve la contraseña
        return contraseña;           // @return contraseña
    }
  
    public String generaPassword (){  // Genera una contraseña al azar con la longitud que este definida
        String password="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
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
        return password;  // @return contraseña
    }
  
    public boolean esFuerte(){ // Comprueba la fortaleza de la contraseña
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contraseña.length();i++){
                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
  
    public Password (){  // Crea una contraseña al azar 
        this(LONG_DEF);
    }
  
    public Password (int longitud){ // La contraseña sera la pasada por parametro
        this.longitud=longitud;     // @param longitud
        contraseña=generaPassword();  
    }

}
