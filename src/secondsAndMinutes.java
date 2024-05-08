public class secondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3601));
        System.out.println(getDurationString(1, 1));
    }
    public static String getDurationString(int seconds){
        String result;
        if(seconds < 0){
            result = "Invalid input!";
        }
        else{
            int hours = seconds / 3600;
            int remainMins = (seconds  % 3600)/60;
            int remainSecs =  seconds % 60;

            result = hours + "h " + remainMins + "m "+remainSecs + "s";
        }

        return result;
    }

    public static String getDurationString(int minutes, int seconds){
        String result;
        if(minutes < 0 || seconds < 0){
            result = "Invalid input!";
        }
        else if(seconds > 59) {
            result = "Seconds must be between 0-59";
        }
        else{
            seconds = seconds + (minutes*60);
            result = getDurationString(seconds);
        }
        return result;
    }

}
