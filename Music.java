public  abstract class Music {
    public String name;
    public String brand;
    public int leght;

    //constructor
    public Music(){

    }
    public Music(String name,String brand,int leght){

    }

    //method 
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public int getlength(){
        return leght;
    }
    public void setlength(int leght){
        this.leght=leght;
    }
}
