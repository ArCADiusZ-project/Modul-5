package ZooSpolka;

public class Snake extends Animal
{
    private boolean riversnake; // Wonsz żeczny - jest niebezpieczny riversnake == dangerous

    public Snake(String name, int yearOfBirth, TypeAnimal type, boolean riversnake)
        {
            super(name,yearOfBirth,type);
            this.riversnake = riversnake;
        }

    public boolean getRiversnake()
        {
            return riversnake;
        }

    public void setRiversnake(boolean riversnake)
        {
            this.riversnake = riversnake;
        }

    @Override
    public String toString()
        {
            return  super.getTypeAnimal() + " " + super.getName() + " wiek " + super.getAgeOfAnimal() + " NIEBEZPIECZNY" + getRiversnake();
        }

    @Override
    public void sound()
        {
            System.out.println("TUDUDU TUDUDU");
        }
}