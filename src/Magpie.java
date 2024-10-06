public class Magpie {
    
    /**
     * A default constuctor
     */
    public Magpie(){ //one constructor
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {//there are 2 methods in this class// and return "Hello, let's talk."
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.indexOf("mother") >= 0) {
            response = "Tell me more about your mother.";
        } 
        else if (statement.startsWith("no") && (statement.indexOf("no") >= 0)) {
            response = "True#1";
        } 
        else if (statement.endsWith("no") && (statement.indexOf("no") >= 0)) {
            response = "True#2";
        } 
        else if (statement.indexOf("no,") >= 0) {
            response = "True#3";
        } 
        else if (statement.indexOf("no.") >= 0) {
            response = "True#4";
        } 
        else if (statement.indexOf("Wilson") >= 0) {
        response = "She shoulds like a good teacher.";
        }
        else if (statement.indexOf("apple") >= 0) {
        response = "Delicious! Let's do it.";
        }
        else if (statement.indexOf("brother") >= 0) {
        response = "Right hand man.";
        }
        else if (statement.indexOf("wife") >= 0) {
        response = "My best friend.";
        }
        else if (statement.trim().length() ==0){
        response = "Say something, please";
        }
        else if (statement.indexOf("near") >= 0 && statement.indexOf("Starbucks") >= 0) {
            response = "The nearest Starbucks is in the Student Union 0.5 miles away.";
        }
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0){
            response = "Tell me more about your pets";
        }
        else if ((statement.indexOf("park") >= 0) && !(statement.indexOf("car") >= 0)) {
            response = "I bet the trees there are lovely this time of year.";
        }
        else if (statement.indexOf("park") >= 0 && statement.indexOf("car") >= 0) {
            response = "Parking on campus is atrocious and expensive";
        }
        else if ((statement.indexOf("rock") >= 0) && !(statement.indexOf("music") >= 0)) {
            response = "I had a rock collection too!";
        }
        else if (statement.indexOf("rock") >= 0 && statement.indexOf("music") >= 0) {
            response = "What is your favorite band?";
        }

        else if (statement.indexOf("love") >= 0 && statement.indexOf("mom") >= 0 && statement.indexOf("cook") >= 0 ) {
            response = "I'll bet it's delicious";
        }

        if (response.length() == 0) {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }
        if (whichResponse == 4) {
            response = "What in the world?";
        }
        if (whichResponse == 5) {
            response = "I don't undersatnd you.";
        }

        return response;

        //A. Why so negative?
        //B. Tell me more about your mother.
        //C. Hmmm.... or You don't say... 
        //D. The number of words we respones with will determine how the chatbot response to us.

        //Part D
        //1. Tell me more about your mother
        //2. It response with the last one first
        //3. Mother response
        //4. 
        
    }
}
