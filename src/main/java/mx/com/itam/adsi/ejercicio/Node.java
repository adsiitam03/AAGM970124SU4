package mx.com.itam.adsi.ejercicio; 
 
import org.apache.log4j.Logger; 

public class Node {
    private final static Logger LOG = Logger.getLogger(Node.class);
	/**
  	    *Información que contiene el nodo.
   	*/ 
        String data;

	/**
    	  *Nodo que está unido al nodo actual
   	*/ 
        Node next;
        
	/**
     	  *Constructor que añade "data" al atributo data del nodo.
	  *@return Node nuevo nodo con información dada y siguiente nodo nulo.
   	*/ 
        Node(String data) {
		LOG.info("Crea nuevo nodo");
            this.data = data;
            next = null;
        }
        
	/**
     	  *Crea un nodo siguiente al actual.
	  *@return Node nuevo nodo con información dada y siguiente nodo nulo.
   	*/ 
        Node gus() {
		//Verifica si el nodo siguiente es nulo, en este caso regresa el nodo actual; en caso contrario crea un nuevo nodo y lo pone next
            if(next == null) return this;
            Node otro = next;
            next      = null;
            Node tavo = otro.gus();
            otro.next = this;
            return tavo;
        }
      
        /**
         * Imprime en la consola la secuencia de Nodos que 
         * componen a esta lista. Por ejemplo, para la lista
         * que devuelve el mÃ©todo "build", la invocaciÃ³n de
         * este mÃ©todo escribe en la consola: 
         * 
         * A-->B-->C-->D-->E-->F-->
         * 
         * Lo anterior serÃ­a lo que se visualiza en la consola 
         * justo despuÃ©s de ejecutar las siguintes dos lineas:
         * 
         *         Node a = build();
         *         a.prn();
         *         
         */
        void prn() {
		LOG.info("Imprime cadena de nodos");
            // Este mÃ©todo requiere sÃ³lo de 3 a 7 lineas de cÃ³digo para funcionar correctamente
            String nombre = this.data;
            Node nodoAux = this.next;
            while(nodoAux != null){
                System.out.println(nombre + " --> ");
                nombre = nodoAux.data;
                nodoAux = nodoAux.next;
            }
        }
        public static void main(String...argv) {
        
    	}
    }// ends Node class
    
    


