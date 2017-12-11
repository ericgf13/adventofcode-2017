package ericgf13.adventofcode.bean;

import java.util.HashSet;
import java.util.Set;

public class Disk {

	private String name;
	private int weight;
	private int trueWeight;
	private Set<String> childrenStr;
	private Set<Disk> children = new HashSet<>();
	private Disk parent;

	public Disk(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTrueWeight() {
		return trueWeight;
	}

	public void setTrueWeight(int trueWeight) {
		this.trueWeight = trueWeight;
	}

	public Set<String> getChildrenStr() {
		return childrenStr;
	}

	public void setChildrenStr(Set<String> childrenStr) {
		this.childrenStr = childrenStr;
	}

	public Set<Disk> getChildren() {
		return children;
	}

	public void setChildren(Set<Disk> children) {
		this.children = children;
	}

	public Disk getParent() {
		return parent;
	}

	public void setParent(Disk parent) {
		this.parent = parent;
	}
}
