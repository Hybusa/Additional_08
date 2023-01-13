public class MyArrayList {
    private int[] theArray;
    private int numItems;

    public MyArrayList() {
        theArray = new int[1];
        numItems = 0;
    }

    public void addItems(int num) {
        if (numItems == theArray.length)
            growArray();
        theArray[numItems] = num;
        numItems++;
    }
    public int getItem(int index) {
       return theArray[index];
    }

    public int getLength() {
        return numItems;
    }

    public void printMyArray() {
        for (int i : theArray) {
            if (i != 0)
                System.out.print(i + " ");
        }
    }

    private void growArray() {
        int[] tmpArr = new int[theArray.length * 2];
        for (int i = 0; i < numItems; i++) {
            tmpArr[i] = theArray[i];
        }
        theArray = tmpArr;
    }


}
