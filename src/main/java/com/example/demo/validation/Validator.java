package com.example.demo.validation;

public class Validator {
public boolean validPrix(float prix)
{
return 	prix>100;

}
public boolean validDescription(String description)
{
return description.length()>10;	
}
}
