/*
 * Nombre: Nodo.java
 * Descripción: Creación de nodos para un árbol
 * Autor: Aníbal Uriel Guijarro Rocha
 * Autor: Emmanuel Gómez Trujillo
 * Autor: Mario Alessandro López García
 * Fecha: 28 de Marzo de 2023
 */
package compilador;

import java.util.ArrayList;

/**
 * @author Anibal Uriel Guijarro Rocha
 * @author Emmanuel Gómez Trujillo
 * @author Mario Alessandro López García
 */
public class Nodo {
    //VARIABLES
    private int info; //Almacenamiento de datos
    private Nodo padre; //Referencia a nodo padre
    private ArrayList<Nodo> hijos = new ArrayList(); //Referencia de nodos hijos
    
    //CONSTRUCTORES
    /**
     * Constructor para inicializar las variables en null (Excepto los hijos)
     */
    public Nodo(){
        this.info = 0;
        this.padre = null;
    } //Fin de primer constructor
    
    /**
     * Constructor para inicializar las variables con valores definidos
     * @param info Información a almacenar en el nodo
     * @param padre Nodo padre del nodo
     * @param hijos Nodos hijos del nodo
     */
    public Nodo(int info, Nodo padre, ArrayList hijos) {
        this.info = info;
        this.padre = padre;
        this.hijos = hijos;
    } //Fin de segundo constructor
    
    //MÉTODOS
    /**
     * Método para obtener la información del nodo
     * @return Información del nodo
     */
    public int getInfo() {
        return info;
    } //Fin de método 'getInfo'

    /**
     * Método para establecer la información del nodo
     * @param info Información a almacenar en el nodo
     */
    public void setInfo(int info) {
        this.info = info;
    } //Fin de método 'setInfo'

    /**
     * Método para obtener el nodo padre del nodo
     * @return Nodo padre del nodo
     */
    public Nodo getPadre() {
        return padre;
    } //Fin de método 'getPadre'

    /**
     * Método para establecer el nodo padre del nodo
     * @param padre Nodo padre del nodo
     */
    public void setPadre(Nodo padre) {
        this.padre = padre;
    } //Fin de método 'setPadre'
    
    /**
     * Método para obtener un solo hijo del nodo
     * @param indice Índice del nodo hijo a retornar
     * @return Nodo hijo específico
     */
    public Nodo getHijoUnico(int indice){
        return hijos.get(indice);
    } //Fin de método 'getHijoUnico'

    /**
     * Método para obtener todos los hijos del nodo
     * @return ArrayList de Nodos que contiene a todos los hijos del nodo
     */
    public ArrayList<Nodo> getHijos() {
        return hijos;
    } //Fin de método 'getHijos'

    /**
     * Método para establecer un solo hijo a la vez del nodo
     * @param hijo Nodo a ser insertado como hijo del nodo
     */
    public void setHijoUnico(Nodo hijo) {
        hijo.setPadre(this);
        hijos.add(hijo);
    } //Fin de método 'setHijoUnico'
    
    /**
     * Método para establecer todos los nodos hijos del nodo
     * @param hijos ArrayList de Nodos que contiene a todos los hijos a ser insertados al nodo
     */
    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    } //Fin de método 'setHijos'
    
} //Fin de clase
