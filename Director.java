public class Director {
    Builder builder;
    
    public  void indieBuild(Builder builder){
        this.builder=builder;
        this.builder.setname("Circle");
        this.builder.setbrand("dept");
        this.builder.setlength(4);
        this.builder.showInfo();
    }
    public void rockBuild(Builder builder){
        this.builder=builder;
        this.builder.setname("Holiday");
        this.builder.setbrand("Turnstile");
        this.builder.setlength(3);
        this.builder.showInfo();
    }
    
}
