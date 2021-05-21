import java.util.HashMap;

public class FunctionsOfDataStructure {

	HashMap<String, Integer> hs = new HashMap<>();

	public void insert(String str, int i) {
		if (hs.keySet().contains(str)) {
			hs.replace(str, i);
		} else {
			hs.put(str, i);
		}

		print();
	}

	public void delete(String str, int i) {

		if (hs.keySet().contains(str)) {
			hs.remove(str);
		}
		print();
	}

	public boolean search(String str) {
		boolean present = false;
		if (hs.keySet().contains(str)) {
			present = true;
		}

		return present;
	}

	public int getKey(String str, int i) {

		if (hs.keySet().contains(str)) {
			hs.get(str);

			return 0;
		}
		return -1;
	}

	public int getSize() {

		return hs.size();

	}

	public void print() {
		System.out.println(hs);
	}

	public static void main(String[] args) {

		FunctionsOfDataStructure ds = new FunctionsOfDataStructure();
		System.out.println("________Insert testing_________");
		ds.insert("java", 0);
		ds.insert("java1", 1);
		ds.insert("java", 2);
		System.out.println("***************************************");
		System.out.println("________Search Operation_________");

		System.out.println(ds.search("java"));
		System.out.println(ds.search("java6"));
		System.out.println("***************************************");

		System.out.println("________Get the Key_________");
		System.out.println(ds.getKey("java", 2));
		System.out.println(ds.getKey("empty", 2));
		System.out.println("***************************************");

		System.out.println("________Get the size_________");
		System.out.println("To get size: " + ds.getSize());
		System.out.println("***************************************");

		System.out.println("________Delete_________");
		ds.delete("java", 0);
		System.out.println("***************************************");

		// ds.insert("java2", 2);
		// ds.delete("java2", 0);
	}

}
