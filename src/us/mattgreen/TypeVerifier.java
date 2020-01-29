package us.mattgreen;

public class TypeVerifier {


    public static int verifyInt(String userInput) throws BadInputException{
        try{
        return Integer.parseInt(userInput);

        } catch (NumberFormatException n) {
            throw new BadInputException("Wrong!!!");
        }
    }

    public static boolean verifyBool(String userInput) throws BadInputException {
            if(userInput.toUpperCase().equals("Y") )
            {
                return true;
            }
            else{  return false;}
    }
}
