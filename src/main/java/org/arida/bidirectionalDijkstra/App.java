package org.arida.bidirectionalDijkstra;

import org.graphast.graphgenerator.GraphGenerator;
import org.graphast.model.Node;
import org.graphast.model.contraction.CHGraph;
import org.graphast.query.route.shortestpath.model.Path;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CHGraph graphMITExample = new GraphGenerator().generateMITExample();

		Node source = graphMITExample.getNode(0l);
		Node target = graphMITExample.getNode(4l);

		BidirectionalDijkstra bidirectionalDijkstra = new BidirectionalDijkstra(graphMITExample);

		Path path = bidirectionalDijkstra.execute(source, target);

		System.out.println(path);

	}
}
