package entities.graph;

import java.util.ArrayList;
import java.util.List;

import entities.QueueElement;

public class Vertex extends QueueElement {
	
	public boolean Visited = false;
	
	private int m_Id;
	
	private List<Edge> m_Edges;
	
	public int GetId() {
		return m_Id;
	}	
	
	public List<Edge> GetEdges(){
		return m_Edges;
	}
	
	
	public Vertex(int id) {
		m_Id = id;
		m_Edges = new ArrayList<Edge>();
	}


	public void AddEdge(Edge edge) {
		if(m_Edges.contains(edge) == false) {
			m_Edges.add(edge);
		}
	}
	
	public Vertex[] GetNeighbours() {
		
		if(m_Edges.size() == 0)
			return null;
		
		Vertex[] neighbours = new Vertex[m_Edges.size()];
		
		for (int i = 0; i < m_Edges.size(); i++) {
			neighbours[i] = m_Edges.get(i).GetNeighbour(this);
		}
		
		return neighbours;
	}
	
	@Override
	public String toString() {
		return "Vertex [Id=" + m_Id + "]";
	}

}
