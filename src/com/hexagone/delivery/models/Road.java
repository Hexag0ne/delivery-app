package com.hexagone.delivery.models;

/**
 * This class is part of the map modeling. A Road is a link between two
 * Intersections It carries several information :
 * <ul>
 * <li>The two intersections it is linking</li>
 * <li>it's name</li>
 * <li>it's length</li>
 * <li>the average speed motorists travel on this road</li>
 * </ul>
 * Note that if a real road allows cars to travel both ways, it will be modeled
 * as <strong>two different roads </strong> in the map.
 */
public class Road {

	public Road(Integer origin, Integer destination) {
		super();
		this.origin = origin;
		this.destination = destination;
	}

	/**
	 * Length of the road between the two intersections in
	 * <strong>decimetres</strong>
	 */
	private double length;
	/**
	 * Average speed at which cars travel down this road in
	 * <strong>Km/h</strong>
	 */
	private double speed;
	/** Name of the Road */
	private String roadName;

	/** Unique identifier of the node from which the road spans */
	private Integer origin;
	/** Unique identifier of the towards which the road goes */
	private Integer destination;

	/**
	 * Computes the time needed to travel down a road
	 * 
	 * @return the time as a number of seconds
	 */
	public Double getTime() {
		return new Double((double) length * 36) / ((((double) speed) * 100));
	}

	/**
	 * Allows the user to get a copy of the origin intersection of the road.
	 * 
	 * @return a copy of the origin intersection identifier
	 */
	public Integer getOrigin() {
		return new Integer(origin);
	}

	/**
	 * Allows the user to get a copy of the destination node of the road
	 * 
	 * @return the unique identifier node as an Integer
	 */
	public Integer getDestination() {
		return new Integer(destination);
	}

	public String getRoadName() {
		return roadName;
	}

	public Road(Integer origin, Integer destination, double length, double speed, String name) {
		this.origin = origin;
		this.destination = destination;
		this.length = length;
		this.speed = speed;
		this.roadName = name;
	}

	@Override
	public String toString() {
		return "Road[\"" + roadName + "\", " + origin + "->" + destination + "]";
	}
}
