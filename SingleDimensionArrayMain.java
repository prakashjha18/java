
public class SingleDimensionArrayMain {

	public static void main(String[] args) {
		
		
		System.out.println("Creating a blank array of size 10...");
		SingleDimensionArray sda = new SingleDimensionArray(10);
		
        
        System.out.println("Printing the Array...");
		sda.traverseArray();
		System.out.println();System.out.println();
        
		
		System.out.println("Inserting few values in the array...");
		sda.insert(0,0);
		sda.insert(1,10);
		sda.insert(2,20);
		sda.insert(3,30);
		sda.insert(4,40);
		sda.insert(5,50);
		sda.insert(6,60);
		sda.insert(7,70);
		sda.insert(8,80);
		sda.insert(1,100);
		sda.insert(12,120);
		System.out.println();System.out.println();
		
		
		System.out.println("Printing the Array...");
		sda.traverseArray();
		System.out.println();System.out.println();
		
		
		
		System.out.println("Accessing cell number#1...");
		sda.accessingCell(1);
		System.out.println();System.out.println();
		
		
		System.out.println("Accessing cell number#5...");
		sda.accessingCell(5);
		System.out.println();System.out.println();
		
		
		System.out.println("Accessing cell number#15...");
		sda.accessingCell(15);
		System.out.println();System.out.println();
		
		
		System.out.println("Searching 30 in the array...");
		sda.searchInAnArray(30);
		System.out.println();System.out.println();
		
		
		System.out.println("Searching 400 in the array...");
		sda.searchInAnArray(400);
		System.out.println();System.out.println();
		
		
		
		System.out.println("Deleting value from Cell#3 of array...");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(3);
		System.out.println();
		System.out.println("After Deleting: ");
		sda.traverseArray();
		System.out.println();System.out.println();System.out.println();
		
		
		System.out.println("Deleting value from Cell#15 of array...");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(15);
		System.out.println("After Deleting: ");
		sda.traverseArray();
		System.out.println();System.out.println();System.out.println();
		
		
		
		sda.deleteThisArray();
		System.out.println("After Deleting: ");
		sda.traverseArray();
		
				
	}//end of Main method
}//end of Class

class SingleDimensionArray {
	int arr[] = null;

    
    //Constructor
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	
    // Print the array
	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array no longer exists !");
		}
	}
    
    
	//Insert value in the Array
	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Successfully inserted " + valueToBeInserted + " at location: " + location);
			} else {
				System.out.println("This cell is already occupied by another value.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");
			// e.printStackTrace();
		}
	}

	
	

		
	// Access a particular element of an array
	public void accessingCell(int cellNumber) {
		try {
			System.out.println(arr[cellNumber]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");

		}
	}

	
	//Search for an element in the given Array
	public void searchInAnArray(int valueToSearch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToSearch) {
				System.out.println("Value found !");
				System.out.println("Index of " + valueToSearch + " is: " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found!!");
	}


	//Delete value from given Array
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
			// e.printStackTrace();
		}
	}
	
	
	//Delete the entire Array
	public void deleteThisArray() {
		arr = null;
		System.out.println("Array has been succefully deleted");
	}
	
}//end of class
