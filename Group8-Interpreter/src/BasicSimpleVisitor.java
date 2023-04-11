import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BasicSimpleVisitor extends SimpleBaseVisitor<Object>{

    private HashMap<String, Object> variableList = new HashMap<>();
    private HashMap<String, Object> varDataType = new HashMap<>();
    private ArrayList<String> listOFDataType = new ArrayList<>(Arrays.asList("INT", "FLOAT", "CHAR", "STRING", "BOOL"));

    
    @Override
    public Object visitAssignment(SimpleParser.AssignmentContext ctx) {
        String line = "";
        String dataType = null;

        //getting the data type
        if(listOFDataType.contains(ctx.getChild(0).getText())){
            dataType = ctx.getChild(0).getText();
        }
      
        //get the line assignment without the "data type"
        for(int i=0; i < ctx.getChildCount()-1; i++){

            if(listOFDataType.contains(ctx.getChild(i).getText())){
                continue;
            }else{
                line += ctx.getChild(i).getText();
            }

        }

        String[] variableLine = line.split(",");
        for (String variable : variableLine) {

            //System.out.println(index);
            if(variable.contains("=")){
                
                
                if(variable.split("=").length > 2){    //INT a=b=c=10
                    String[] identifier = variable.split("=");
                    String value = identifier[identifier.length-1];

                 //traverse each identifier
                    for(int i=0; i < identifier.length-1; i++){
                        variableList.put(identifier[i], value);
                    }

                }else{
                    int index = variable.indexOf("=");
                    String identifier = variable.substring(0, index);
                    String value = variable.substring(index+1, variable.length());

                    if(dataType == null){  //a = 10

                        if(varDataType.get(identifier) != null){

                            dataType = varDataType.get(identifier).toString();


                            if(variableList.get(value) != null){
                                value = variableList.get(value).toString();
                            }

                            valueChecker(dataType, identifier, value);
                            variableList.put(identifier, value);

                        }else{

                            //the identfier does not exist in the list
                            System.err.println("Error: Variable " + identifier + " does not exists.");

                        }
                    }else{ //INT a=10

                        if(variableList.get(identifier) != null){
                            System.err.println("Error: Variable " + identifier + " already exists.");
                        }

                        if(variableList.get(value) != null){
                            value = variableList.get(value).toString();
                        }
        
                        valueChecker(dataType, identifier, value);
                        variableList.put(identifier, value);
                        varDataType.put(identifier, dataType);
                    }
                }
                
            }else{
               
                String identifier = variable;
                if(dataType == null){ //a,b,c,d

                    System.err.println("Error:" + identifier + " is unknown.");

                }else{  //int a,b,c,d

                    if(variableList.get(identifier) != null){
                        System.err.println("Error: Variable " + identifier + " already exists.");
                    }
    
                    variableList.put(identifier, -1);
                    varDataType.put(identifier, dataType);

                }
            }
        }
        
        

        return null;
    }


    private void valueChecker(String dataType, String identifier, String expression){
        if(dataType.equals("INT")){

            try{
                Integer.parseInt(expression);
            }catch(Exception e){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a integer");
            }

        }else if(dataType.equals("FLOAT")){

            try{
                Float.parseFloat(expression);
            }catch(NumberFormatException e){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a floating point");
            }

        }else if(dataType.equals("CHAR")){

            if(expression.length() != 3 || expression.charAt(0) != '\'' || expression.charAt(2) != '\''){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a character");
            }
            
        }else if(dataType.equals("STRING")){

            if(expression.length() < 2 || expression.charAt(0) != '\"' || expression.charAt(expression.length()-1) != '\"'){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a string");
            }

        }else if(dataType.equals("BOOL")){

            if(!expression.equals("\"" +"TRUE" + "\"") && !expression.equals("\"" + "FALSE"+ "\"")){
                throw new RuntimeException("Invalid value for variable " + identifier + ": expected a boolean");
            }
        }
    }



}