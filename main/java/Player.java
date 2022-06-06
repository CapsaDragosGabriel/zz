public abstract class Player{
    protected  String name;
    public Player(){}
    protected Player(String name){this.name=name;}
}

final class Ronaldo extends Player{
    Ronaldo(){name="Cristiano";}
}

class Euro2020{
    private final Ronaldo cr7=new Ronaldo();
}