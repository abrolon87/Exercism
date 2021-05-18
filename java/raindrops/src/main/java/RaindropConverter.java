class RaindropConverter {

    String convert(int number) {
        int n = number;
        String strNum = Integer.toString(n);
        if (n%3 == 0 && n%5 == 0 && n%7 == 0) 
            return "PlingPlangPlong";
        else if (n%3 == 0 && n%5 == 0)
            return "PlingPlang";
        else if (n%3 == 0 && n%7 == 0)
            return "PlingPlong";
        else if (n%5 == 0 && n%7 == 0)
            return "PlangPlong";
        else if (n%3 ==0)
            return "Pling";    
        else if (n%5 == 0) 
            return "Plang";
        else if (n%7 == 0)
            return "Plong";
        else
            return strNum;
        
    }

}
