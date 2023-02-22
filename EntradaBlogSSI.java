package EntradaBlog;

/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el 22/2/2023.
 * @author Sandra Sáez Ibarra
 * @version 2.3
 */

public class EntradaBlogSSI {
//Modificar.
        //separador es el ccarácter que separa ENTRADA DE del
        //nombre del autor

        public static char separador=':';
        private int id;
        private String texto;
        private String autor;


    /**
     * Este método lanza una excepción
     * @param id int recibe número
     * @param autor String recibe el nombre del autor
     * @param texto String recibe el texto que contiene la entrada
     * @throws IllegalArgumentException
     */
	public EntradaBlogSSI (int id,String autor,String texto)throws IllegalArgumentException{
            if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
            this.id=id;
            this.autor=autor;
            this.texto=texto;
        }

    /**
     *
     * @return toString String devuelve una cadena de texto
     */
    @Override
        public String toString(){
            String cad="";
            cad+="\nENTRADA DE"+separador+autor;
            cad+="\n "+texto;
            return cad;
        }

    /**
     * Este método devuelve el número de la entrada
     * @return getId int
     */

        public int getId(){
            return this.id;
        }

    /**
     * Este método devuelve el texto completo de la entrada
     * @return getTexto String
     */

        public String getTexto(){
            return this.texto;
        }

    /**
     * Este método devuelve el nombre del autor de la entrada en mayúsculas
     * @return getAutor String
     */

        public String getAutor(){
            return this.autor.toUpperCase();
        }

    /**
     * Este método devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return devuelveAutor String
     */

        public String devuelveAutor(){
            return this.autor;
        }

    /**
     * No tiene porqué tener argumentos
     * @param args
     */

        public static void main(String[] args) {
            //Modificar.
            EntradaBlogSSI e1=new EntradaBlogSSI (-3,"sandra","Últimas noticias, está disponible BixBy 2.0");
            System.out.println(e1);
        }

}
