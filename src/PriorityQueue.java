/***
 * @author Gabriel Alejandro Vicente Lorenzo 20498
 * Clase proporcionada en ejemlos de la clase
 */
public interface PriorityQueue<E extends Comparable<E>>
{
    /***
     * Regresa el primer nodo
     * @return firs
     */
    public E getFirst();

    /***
     * Remueve nodos
     * @return referencia a nodo
     */
    public E remove();

    /***
     * Agregar un valor al VectorHeap
     * @param value valor a agregar
     */
    public void add(E value);

    /***
     * Verifica si esta vacio el VectorHeap
     * @return false si contiene elementos, true si esta vacio
     */
    public boolean isEmpty();

    /***
     * Regresa el size de VectorHeap
     * @return size VectorHeap
     */
    public int size();

    /***
     *
     * limpia a vector heap
     */
    public void clear();

}