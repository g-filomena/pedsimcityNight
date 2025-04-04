package pedSim.parameters;

/**
 * The Parameters class contains global parameters and settings for the
 * PedSimCity simulation. These parameters are used to configure various aspects
 * of the simulation, including simulation mode, agent behavior, and data import
 * options.
 */
public class RouteChoicePars {

	public static boolean usingDMA = false;
	public static double thresholdTurn = 45;
	public static int MIN_WALKED_ROUTES_SIZE = 5;

	// Distance between Origin and Destination
	public static double minTripDistance = 700;
	public static double avgTripDistance = 1800;
	public static double maxTripDistance = 2500;
	public static double maxTripsPerDay = 6;

	public Integer[] originsTmp = {};
	public static Integer[] destinationsTmp = {};

	// Landmark Integration
	public static double distanceNodeBuilding = 40.0;
	public static double salientNodesPercentile = 0.90; // Threshold Percentile to identify salient nodes

}
