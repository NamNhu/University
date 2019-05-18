package de.uni_hannover.hci.nam;

public class Main {

    public static void main(String[] args){
        SortMode mode = SortMode.ID;
        ISortable ele1 = new BluRay("Hallo", 1, "Nam", "B1C2597K12");
        ISortable ele2 = new BluRay("Hallo", 3, "Nam", "B1C2597K12");
        ISortable ele3 = new BluRay("Hallo", 2, "Nam", "B1C2597K12");
        ISortable ele4 = new BluRay("Hallo", 5, "Nam", "B1C2597K12");
        ISortable ele5 = new BluRay("Hallo", 4, "Nam", "B1C2597K12");

        ISortable[] sortArray = {ele1, ele2, ele3, ele4, ele5};

    }
}
