public  abstract class Music {
    public String name;
    public int leght;

    //constructor
    public Music(){

    }
    public Music(String name,int leght){

    }

    //method 
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getlength(){
        return leght;
    }
    public void setlength(int leght){
        this.leght=leght;
    }
}
