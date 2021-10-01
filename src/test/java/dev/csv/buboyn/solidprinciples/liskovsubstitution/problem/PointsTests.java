package dev.csv.buboyn.solidprinciples.liskovsubstitution.problem;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;


public class PointsTests {

	private final Point3D reference = new Point3D(3,5, 7);
	private final List<Point3D> test_points = Arrays.asList(
			                                         new Point3D(2,3,7),
			                                         new Point3D(3,5, 7),
			                                         new Point3D(4,3, 7)
			                                         );
	
	
	@Test
	public void test_equal_if_only_if_dinstance_0() {
		
		for (Point3D point: test_points) {
			assertEquals("test for " + reference + " and " + point,
					             reference.equals(point), 
					             reference.distance(point) == 0);
		}
	}

}
