class Ex5 {
    public static void main(String[] args) {
        String day="friday";
        String res= "";
        // switch(day){
        //     case "Saturday","Sunday" :
        //         System.out.println("7am");
        //         break;
        //     case "Monday" :
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("6am");
        // }
       /*****************************/
        // switch(day){
        //     case "Saturday","Sunday" -> System.out.println("7am");
        //     case "Monday" -> System.out.println("8am");
        //     default-> System.out.println("6am");
        // }
        /*********************************** */
        // switch(day){
        //     case "Saturday","Sunday" -> res="7am";
        //     case "Monday" -> res="8am";
        //     default-> res="6am";
        // }
        // System.out.println(res);
        /************************************************ */
        // res=switch(day){
        //     case "Saturday","Sunday" -> "7am";
        //     case "Monday" -> "8am";
        //     default-> "6am";
        // };
        // System.out.println(res);
        /************************************************************* */
        res=switch(day){
            case "Saturday","Sunday" :  yield "7am";
            case "Monday" : yield "8am";
            default : yield "6am";
        };
        System.out.println(res);
    }
}
