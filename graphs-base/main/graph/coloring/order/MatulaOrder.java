package graph.coloring.order;

import graph.Graph;

public class MatulaOrder implements OrderMethod {

	@Override
	public Order generateOrder(Graph graph) {
		Order order = new Order(graph.getNodes());
		
		// TODO: Implement me!
		
		return order;
	}

}
