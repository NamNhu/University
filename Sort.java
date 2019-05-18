package de.uni_hannover.hci.nam;


public class Sort {

    public static void sort(SortMode mode, ISortable[] toSort){
        switch(mode){
            case NAME:
                int lng = toSort.length;

                for(int i = 0; i < lng-1; i++){
                    for(int j = i+1; j < lng; j++){
                        if(toSort[i].getPrice() > toSort[j].getPrice()){
                            ISortable temp = toSort[i];
                            toSort[i] = toSort[j];
                            toSort[j] = temp;
                        }
                    }
                }
                break;
            case PRICE: break;
            case ID: break;
            default: break;
        }
    }
}
