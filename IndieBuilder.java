public class IndieBuilder implements Builder{
    IndieMusic indiemusic;
    public IndieBuilder(){
        this.indiemusic = new IndieMusic();
    }
    public void setname(String musicname){

        this.indiemusic.setName(musicname);

    }
    public void setbrand(String brandname){

        this.indiemusic.setBrand(brandname);

    }
    public void setlength(int musiclenght){

        this.indiemusic.setlength(musiclenght);

    }
    public void showInfo(){
        System.out.println("Music Name:"+" "+this.indiemusic.getName());
        System.out.println("Brand:"+" "+this.indiemusic.getBrand());
        System.out.println("Lenght:"+" "+this.indiemusic.getlength());
    }
    


    
}
