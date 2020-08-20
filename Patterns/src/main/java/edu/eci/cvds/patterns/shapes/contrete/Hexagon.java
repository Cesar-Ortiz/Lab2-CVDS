package edu.eci.cvds.patterns.shapes.contrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape {
	private int edges;
	
	public Hexagon() {
		edges = 6;
	}
	
	public int getNumberOfEdges() {
        return edges;
    }
}
