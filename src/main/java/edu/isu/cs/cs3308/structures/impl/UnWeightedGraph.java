// Bradley Tyler
// Isaac Griffith
// CS 3308
// Campaign 05
// 4-24-2019
package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.Edge;
import edu.isu.cs.cs3308.structures.Graph;
import edu.isu.cs.cs3308.structures.Vertex;

import java.util.Iterator;

public class UnWeightedGraph<V, E> implements Graph<V, E> {

    E source;
    E destination;
    E weight;

    /**
     * Returns the number of vertices of the graph
     */
    @Override
    public int numVertices() {
        return 0;
    }

    /**
     * Returns an iteration of all the vertices of the graph
     */
    @Override
    public Iterator<Vertex<V>> vertices() {
        return null;
    }

    /**
     * Returns the number of edges of the graph
     */
    @Override
    public int numEdges() {
        return 0;
    }

    /**
     * Returns an iteration of all edges of the graph
     */
    @Override
    public Iterator<Edge<E>> edges() {
        return null;
    }

    /**
     * Returns the edge from vertex u to vertex v, if one exists, otherwise returns null.
     * For an undirected graph, there is no difference between getEdge(u, v) and getEdge(v, u)
     *
     * @param u
     * @param v
     */
    @Override
    public Edge<E> getEdge(V u, V v) {
        return null;
    }

    /**
     * Returns an array containing the two endpoint vertices of edge e. If the graph is directed
     * the first vertex is the origin and the second is the destination.
     *
     * @param e
     */
    @Override
    public Vertex<V>[] endVertices(Edge<E> e) {
        return new Vertex[0];
    }

    /**
     * For edge e incident to vertex v, returns the other vertex of the edge; an error occurs
     * if e is not incident to v.
     *
     * @param v
     * @param e
     */
    @Override
    public Vertex<V> opposite(Vertex<V> v, Edge<E> e) {
        return null;
    }

    /**
     * Returns the number of outgoing edges from vertex v.
     *
     * @param v
     */
    @Override
    public int outDegree(Vertex<V> v) {
        return 0;
    }

    /**
     * Returns the number of incoming edges to vertex v. For an undirected graph, this returns
     * the same value as does outDegree(v)
     *
     * @param v
     */
    @Override
    public int inDegree(Vertex<V> v) {
        return 0;
    }

    /**
     * Returns an iteration of all outgoing edges from vertex v
     *
     * @param v
     */
    @Override
    public Iterator<Edge<E>> outgoingEdges(Vertex<V> v) {
        return null;
    }

    /**
     * Returns an iteration of all incoming edges to vertex v. For an undirected graph, this
     * returns the same collection as does outgoingEdges(v)
     *
     * @param v
     */
    @Override
    public Iterator<Edge<E>> incomingEdges(Vertex<V> v) {
        return null;
    }

    /**
     * Creates and returns a new Vertex storing element v
     *
     * @param v
     */
    @Override
    public Vertex<V> insertVertex(V v) {
        return null;
    }

    /**
     * Creates and returns a new Edge from vertex u to vertex v, storing element e; an error occurs
     * if there already exists an edge from u to v
     *
     * @param u
     * @param v
     * @param e
     */
    @Override
    public void insertEdge(Vertex<V> u, Vertex<V> v, E e) {

    }

    /**
     * Removes vertex v and all its incident edges from the graph
     *
     * @param v
     */
    @Override
    public V removeVertex(Vertex<V> v) {
        return null;
    }

    /**
     * Removes edge e from the graph
     *
     * @param e
     */
    @Override
    public E removeEdge(Edge<E> e) {
        return null;
    }
}
