package edu.eci.cvds.patterns.shapes.contrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Quadrilateral implements Shape{
	private int edges;
	
	public Quadrilateral(){
		edges = 4;
	}
	public int getNumberOfEdges() {
        return edges;
    }
}
