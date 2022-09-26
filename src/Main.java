public class Main
{
    public static void main(String[] args)
    {
        String playerA=  "R";
        playerA.toUpperCase();

        switch(playerA)
        {
            case "D":

                System.out.println("you get a democratic donkey!");
                break;

            case "R":
                System.out.println("You get a republican elephant");
                break;


            case "I":
                System.out.println("You get Independent person");
                break;

            default:
                System.out.println("incorrect value entered");
                break;




        }


    }
}
