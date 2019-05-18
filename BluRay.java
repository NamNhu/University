package de.uni_hannover.hci.nam;


public class BluRay implements ISortable{
    String title;
    int price;
    String publisher;
    String asin;



    public BluRay(String tt, int pr, String pub, String a){
        this.title = tt;
        this.price = pr;
        this.publisher = pub;
        this.asin = a;
    }


    public String getSortString(SortMode mode){
        String result = "";


        switch(mode){
            case NAME: result += "${" + this.title + "}-${" + this.publisher + "}"; break;

            case PRICE: int length = countDigits(this.price);
                        for(int i = length; i < 6; i++){
                            result += 0;
                        }
                        result += this.price; break;

            case ID: result += "${" + this.asin + "}"; break;

            default: break;
        }


        return result;
    }


    public String getTitle(){
        return this.title;
    }


    public int getPrice(){
        return this.price;
    }


    public String getPublisher(){
        return this.publisher;
    }


    public String getASIN(){
        return this.asin;
    }



    //this function counts the digits of a natural number
    static int countDigits(int toCount){
        if(toCount < 10){
            return 1;
        }else {//for the case the number got more than 1 digit
            return 1 + countDigits(toCount / 10);//count the digits;
        }
    }
}
