public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();

        IndieBuilder indie1 = new IndieBuilder();
        director.indieBuild(indie1);

        RockBuilder rock1= new RockBuilder();
        director.rockBuild(rock1);
    }
    
}
