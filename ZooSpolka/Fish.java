package ZooSpolka;

public class Fish extends Animal
{
    private int numberOfHusks; //liczba lusek

    public Fish(String name, int yearOfBirth, TypeAnimal type, int numberOfFins)
        {
            super(name,yearOfBirth,type);
            this.numberOfHusks = numberOfFins;
        }

    public int getNumberOfHusks()
        {
            return numberOfHusks;
        }

    public void setNumberOfHusks(int numberOfHusks)
        {
            this.numberOfHusks = numberOfHusks;
        }

    @Override
    public String toString()
        {
            return  super.getTypeAnimal() + " " + super.getName() + " wiek " + super.getAgeOfAnimal() + " liczba płetw " + getNumberOfHusks();
        }

    @Override
    public void sound()
        {
            System.out.println("Wszystkie rybki spia w jeziorze CIURALLA CIURALLA LAAAA!");
        }

}