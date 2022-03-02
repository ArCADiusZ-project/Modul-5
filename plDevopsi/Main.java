package plDevopsi;

public class Main
{

    public static void main(String[] args)
    {
//Zad.1
        {

            //Stwórz zmienne i przypisz do nich wartości :
            //        ○ val_integer typu integer z wartością 250
            //        ○ val_string typu String z wartością “Akademia jest super !”
            //        ○ val_double typu zmiennoprzecinkowej z wartością 1.234555
            //        ○ Wyświetl wszystkie zmienne na konsoli w postaci “Zmienna X ma wartosc Y”
            {
                System.out.println(" ");
                System.out.println("Zad. 1");
                System.out.println(" ");
            }
            {
                int val_integer = 250;
                String val_string = "Akademia jest super !";
                double val_double = 1.234555;

                System.out.println("zmienna val_integer ma wartość " + val_integer);
                System.out.println("zmienna val_string ma wartość " + val_string);
                System.out.println("zmienna val_double ma wartość " + val_double);
            }
            {
                System.out.println(" ");
                System.out.println("Koniec Zad. 1");
                System.out.println(" ");
            }

        }

//Zad.2
        {
            //   Zadeklaruj tablice 10 liczb typu int i przeiteruj po niej od indexu 0 do 19 (od 1 do 20). W czasie iteracji sprawdź czy dana liczba jest parzysta
            //   (liczba%2==0), jeśli tak to wyświetla napis “Liczba X jest parzysta”, gdzie X to dana liczba, w przeciwnym wypadku wyświetl sama liczbe.
            {
                System.out.println(" ");
                System.out.println("Zad. 2");
                System.out.println(" ");
            }
            {
                int[] tabl = {78, 90, 40, 81, 60, 68, 55, 37, 49, 77, 98, 92, 89, 27, 72, 36, 2, 47, 83, 79}; //wziąlem z generatora

                for (int index = 0; index < 19; index++) {
                    if (tabl[index] % 2 == 0) {
                        System.out.println("liczba " + tabl[index] + " jest parzysta");
                    } else {
                        System.out.println(tabl[index]);
                    }
                }
            }
            {
                System.out.println(" ");
                System.out.println("Koniec Zad. 2");
                System.out.println(" ");
            }
        }

        //Zad.3
        {
            //   Używając pętli while, zrób sumę liczb od 1 do 500 i ją wyświetl.
            {
                System.out.println(" ");
                System.out.println("Zad. 3");
                System.out.println(" ");
            }
            {
                boolean bool = true;
                int sum = 0;
                int a = 0;

                while (bool)
                {
                    sum = sum + a++;
                    if (a == 501)
                    {
                        bool = false;
                        System.out.println("suma liczb od 1 do 500 wynosi " + sum);
                    }
                }
            }
            {
                System.out.println(" ");
                System.out.println("Koniec Zad. 3");
                System.out.println(" ");
            }
        }

        //Zad.4
        {
            //   Napisz program, który obliczy średnia liczb z tablicy int i na jej podstawie wystawi ocenę (char) (A >=4, B >=3 i <4, C < 3), następnie używając
            //   switch wyświetla odpowiedni komunikat w zależności od oceny (A=Super, B=Srednio, C=Slabo, Domsylnie= cos nie tak…)
            {
                System.out.println(" ");
                System.out.println("Zad. 4");
                System.out.println(" ");
            }
            {
                int[] tabl2 = {5, 3, 5, 3, 3, 1, 3, 2, 2, 4}; //wziąlem z generatora
                double sum2 = 0;


                for (int index = 0; index < 10; index++)
                {
                    sum2 = sum2 + tabl2[index];
                }

                System.out.println(sum2);
                double aver = sum2 / tabl2.length;
                System.out.println(aver);

                char w ='x';

                char gradeA = 'A';
                char gradeB = 'B';
                char gradeC = 'C';

                if (aver >= 4)
                    {
                        w='A';
                        System.out.println(gradeA);
                    }
                else if (aver >= 3)
                    {
                        w='B';
                        System.out.println(gradeB);
                    }
                else if (aver < 3)
                    {
                        w='C';
                        System.out.println(gradeC);
                    }

                switch (w)
                {
                    case 'A':
                        System.out.println(gradeA + " Świetnie");
                        break;
                    case 'B':
                        System.out.println(gradeB + " jest ŚREDNIO (czyli SUPER!)");
                        break;
                    case 'C':
                        System.out.println(gradeC + " Słabo");
                        break;
                    default:
                        System.out.println("coś nie tak...");
                }
            }
            {
                System.out.println(" ");
                System.out.println("Koniec Zad. 4");
                System.out.println(" ");
            }
        }

        //Zad.5
        {
            //   Stwórz funkcje static pod funkcja main, która będzie pobierać tablice typu double i zwraca zmodyfikowaną tablice bezwzględną (tzn wszystkie
            //   jej elementy powinny być dodanie jeśli były wcześniej ujemne)
            {
                System.out.println(" ");
                System.out.println("Zad. 5");
                System.out.println(" ");
            }
            {
                double[] rel = {1, -2, -7, 6, -3, -10, -1, -3, -7, 6};

                //for (int i = 0; i < rel.length; i++) - zapis pierwotny
                //{
                //    System.out.println(Math.abs(rel[i]));
                //}
                for (double v : rel)
                {
                    System.out.println(Math.abs(v));
                }
            }
            {
                System.out.println(" ");
                System.out.println("Koniec Zad. 5");
                System.out.println(" ");
            }
        }

        //Zad.6
        {
            //   Stwórz funkcje static pod funkcja main, która będzie pobierać imię (String) i zwracać typ enum MEN, WOMEN w zależności od tego czy imię jest
            //   męskie czy nie.
            {
                System.out.println(" ");
                System.out.println("Zad. 6");
                System.out.println(" ");
            }
            {
                String name = "ArCADiusZ";

                if (name.endsWith("a"))
                    {
                        System.out.println(sex.WOMAN);
                    }
                else if (!name.endsWith("a") && name.equals("Juda"))
                    {
                        System.out.println(sex.MAN);
                    }
            }
            {
                System.out.println(" ");
                System.out.println("Koniec Zad. 6");
                System.out.println(" ");
            }
        }
    }
}
