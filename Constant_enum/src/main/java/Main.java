package com.constant_enum;

public class Main {

    //creating enum data type to store contants
    enum Color {
        RED("red"), GREEN("green"), BLUE("blue");

        private String Value;

        Color(String Value){
            this.Value = Value;
        }
        public String getValue(){
            return Value;
        }
    }

    public static void main(String[] args) {
        Color color = Color.BLUE;

        System.out.println("Enum name: "+ color.name());
        System.out.println("Enum value: "+ color.getValue());

        //for itterate all the enum:
        System.out.println("Itterate all the enum: ");
        for(Color color1: Color.values()){
            System.out.println("Enum Name: "+color1.name());
            System.out.println("Enum value: "+color1.getValue());
        }
    }
}
