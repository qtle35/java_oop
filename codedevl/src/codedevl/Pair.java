package codedevl;

class Pair<K, V> {
	private K first;
	private V second;

	public Pair(K first, V second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	public K getFirst() {
		return first;
	}

	public V getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "("+first + "," + second+")";
	}

}
