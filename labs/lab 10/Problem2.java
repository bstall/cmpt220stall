import java.util.ArrayList;

public class Problem2 {
	//13.3
	public static void main(String[] args) {
		//Create ArrayList
		ArrayList<Number> list = new ArrayList<>();

		//Add unsorted numbers
		list.add(13);
		list.add(7.5);
		list.add(2);
		list.add(4.2);
		list.add(5);
		list.add(30);
		list.add(27.6);
		list.add(1);

		System.out.println(list.toString());

		sort(list);

		//Display list of sorted numbers
		System.out.println(list.toString());
	}

	//Sorts ArrayList of numbers
	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			//Find minimum 
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			//Swap list.get(i) with list.get(minIndex) 
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			} 
		}
	}

}
