package solidprinciples_demo;

public class s_demo {

    //s - single resposibility principle
    // a class can own or do a aciton for only one item

    public void generateReport(){
        System.out.println("this is my report");
    }

    // the below method can be used in a seprate class not combining with this class
//    public void generateSavedReport(){
//        System.out.println("save it to a csv file format");
//    }
}
