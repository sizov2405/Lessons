package lesson44;

public class Kettle {

    public static int boiledTime = 8;

    public void checkKettle (int currentMin){
        if (currentMin >= boiledTime){
            System.out.println("Water is boiled");
        }
        else{
            System.out.println("Check kettle later");
        }
    }

    public void qtyOfPages (int totalMinutes, Person person) throws Exception {
        if(totalMinutes <= 0){
            throw new Exception("It is unreal number of minutes");
        }

        if(person == null){
            throw new Exception("Person can't be null");
        }

        int personReadingSpeed = person.getReadingSpeedPerPage();
        if(personReadingSpeed <= 0){
            throw new Exception("You should read faster");
        }

        int personCheckingPeriod = person.getCheckingPeriodPerPage();
        if(personCheckingPeriod <= 0){
            throw new Exception("Are you a human?");
        }

        int readPages = 0;
        //i = currentMin
        for(int currentMin=personReadingSpeed; currentMin<=totalMinutes; currentMin = currentMin + personReadingSpeed){
            readPages++;
            if (readPages != 0 && 0 == readPages % personCheckingPeriod){
                //0 = 1 % 2 = 1 – 1 page
                //0 = 2 % 2 = 0 – 2 pages
                //0 = 3 % 2 = 1 – 3 pages
                //0 = 4 % 2 = 0 - 4 pages


                //(0 == currentMin % (person.getCheckingPeriodPerPage() * personReadingSpeed)
                //0 = 2 % (2 *2) = 2 – 1 page
                //0 = 4 % (2 *2) = 0 – 2 pages
                //0 = 6 % (2 *2) = 2 – 3 pages
                //0 = 8 % (2 *2) = 0 - 4 pages
                checkKettle(currentMin);
            }

        }
        System.out.println("Read page: " + readPages);
    }
}

