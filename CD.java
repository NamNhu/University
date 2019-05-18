package de.uni_hannover.hci.nam;

public class CD implements ISortable {
    String title;
    String artist;
    String publisher;
    int price;
    String asin;



    public CD(String tt, String art, String pub, int pr, String a){
        this.title = tt;
        this.artist = art;
        this.publisher = pub;
        this.price = pr;
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


    String getTitle(){
        return this.title;
    }


    int getPrice(){
        return this.price;
    }


    String getPublisher(){
        return this.publisher;
    }


    String getASIN(){
        return this.asin;
    }


    String getArtist(){
        return this.artist;
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
