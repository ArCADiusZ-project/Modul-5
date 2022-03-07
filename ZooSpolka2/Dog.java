package ZooSpolka;

public class Dog extends Animal
{
    private DogBreed breed; // rasa
    public enum DogBreed {CZIULALA, KUNDELEK};
    public Dog(String name, int yearOfBirth, Animal.TypeAnimal type, Dog.DogBreed breed)
        {
            super(name,yearOfBirth,type);
            this.breed = breed;
        }

    public DogBreed getDogBreed()
        {
            return breed;
        }

    public void setDogBreed(DogBreed breed)
        {
            this.breed = breed;
        }

    @Override
    public String toString()
        {
            return  super.getTypeAnimal() + " " + super.getName() + " wiek " + super.getAgeOfAnimal() + " rasa " + getDogBreed();
        }

    @Override
    public void sound()
        {
            System.out.println("Szczeku szczek");
        }
}