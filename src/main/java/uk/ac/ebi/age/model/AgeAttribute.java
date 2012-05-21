package uk.ac.ebi.age.model;


public interface AgeAttribute extends Attributed, AgeObjectProperty, Comparable<AgeAttribute>
{
 AgeAttributeClass getAgeElClass();
 AttributeClassRef getClassReference();
 
 Object getValue();
 
 boolean getValueAsBoolean();
 int getValueAsInteger();
 double getValueAsDouble();
 
 public int getOrder();
 
 Attributed getAttributedHost();
 AgeObject  getMasterObject();
}
