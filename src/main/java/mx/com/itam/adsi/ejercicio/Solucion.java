package mx.com.itam.adsi.ejercicio; 

import org.apache.log4j.Logger; 

/**
  *Clase Solucion
  *
  *Crea un objeto Node y manda llamar sus métodos
  *@author Mónica E. Alba Glez. 160502
*/ 
public class Solucion {
    private final static Logger LOG = Logger.getLogger(Solucion.class);
    /**
      *Atributo de tipo nodo para probar la clase Nodo
    */ 
    Node nodo;

    /**
        *Constructor que inicializa el nodo con data "nuevoNodo".
	*@return Node Regresa el nuevo nodo creado con información default.
    */ 
    Solucion(){
        nodo = new Node("nuevoNodo");
    }

    /**
        *Constructor que inicializa el nodo con datos enviados por el usuario.
	*@return Node Regresa nuevo nodo con información dada
    */ 
    Solucion(String nom){
        nodo = new Node(nom);
    }

    /**
     * 
     * Método que sirve para crear nodos y asignar valores a los atributos.
     * 
     * @return Node Regresa el primero que se creó
     */
    private Node build() {
	LOG.info("Método build()");
	LOG.info("Crea 6 nodos con lestras de A hasta F");
        /*Método que crea 6 Nodos, cada uno con una letra diferente y
            luego a cada uno en su propiedad next le asigna en siguiente.  */
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba
     */
    public void ok() {
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    /**
     *Corre los métodos del nodo que se va a crear
   */ 
    public static void main(String...argv) {
	LOG.info("Creación de Solucion");
        Solucion sol = new Solucion();
	LOG.info("Llama método 'ok'");
        sol.ok();
    }

}
