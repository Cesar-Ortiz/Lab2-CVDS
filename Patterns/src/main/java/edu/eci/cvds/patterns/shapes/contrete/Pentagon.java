package edu.eci.cvds.patterns.shapes.contrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Pentagon implements Shape{
	private int edges; 
	
	public Pentagon() {
		edges = 5;
	}
	
	public int getNumberOfEdges() {
        return edges;
    }
}
