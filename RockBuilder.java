public class RockBuilder implements Builder{
    RockMusic rockmusic;
    public RockBuilder(){
        this.rockmusic=new RockMusic();
    }
    public void setname(String musicname){

        this.rockmusic.setName(musicname);

    }
    public void setbrand(String brandname){

        this.rockmusic.setBrand(brandname);

    }
    public void setlength(int musiclenght){

        this.rockmusic.setlength(musiclenght);

    }
    public void showInfo(){
        System.out.println("Music Name:"+" "+this.rockmusic.getName());
        System.out.println("Brand:"+" "+this.rockmusic.getBrand());
        System.out.println("Lenght:"+" "+this.rockmusic.getlength());
    }
    
}
