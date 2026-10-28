package edu.monmouth.hw1;

import edu.monmouth.vehicle.Vehicle;

public class VehicleList 
{
	private VehicleNode head;

	public VehicleList() 
	{
		head = null;
	}

	// inserts at the front of the list
	public void insert(Vehicle vehicle)
	{
		VehicleNode node = new VehicleNode(vehicle);
		node.setNext(head);
		head = node;
	}

	public void insertEnd(Vehicle vehicle) 
	{
		VehicleNode node = new VehicleNode(vehicle);
		if (isEmpty()) 
		{
			head = node;
			return;
		}
		VehicleNode current = head;
		while (current.getNext() != null) 
		{
			current = current.getNext();
		}
		current.setNext(node);
	}

	public Vehicle first() 
	{
		if (isEmpty()) 
		{
			return null;
		}
		return head.getVehicle();
	}

	public Vehicle last() 
	{
		if (isEmpty()) 
		{
			return null;
		}
		VehicleNode current = head;
		while (current.getNext() != null) 
		{
			current = current.getNext();
		}
		return current.getVehicle();
	}

	public Vehicle removeFirst() 
	{
		if (isEmpty())
		{
			return null;
		}
		Vehicle vehicle = head.getVehicle();
		head = head.getNext();
		return vehicle;
	}

	public boolean isEmpty() 
	{
		return head == null;
	}

	public int size() 
	{
		int count = 0;
		for (VehicleNode current = head; current != null; current = current.getNext()) 
		{
			count++;
		}
		return count;
	}

	@Override
	public String toString() 
	{
		if (isEmpty()) 
		{
			return "VehicleList is empty";
		}
		StringBuilder sb = new StringBuilder("VehicleList (" + size() + " vehicles):\n");
		int index = 1;
		for (VehicleNode current = head; current != null; current = current.getNext()) 
		{
			sb.append("  ").append(index++).append(". ").append(current.getVehicle()).append("\n");
		}
		return sb.toString();
	}
}
